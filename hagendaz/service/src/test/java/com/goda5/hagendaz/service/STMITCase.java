package com.goda5.hagendaz.service;

import java.util.Date;

import org.multiverse.api.references.TxnInteger;
import org.multiverse.api.references.TxnRef;
import org.springframework.transaction.annotation.Transactional;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.multiverse.api.StmUtils.*;

public class STMITCase extends IntegrationTestBaseService {
	private TxnRef<Date> lastUpdate;
    private TxnInteger balance;
    
    public STMITCase() {
    	
    }
    
    public STMITCase(int balance){
        this.lastUpdate = newTxnRef(new Date());
        this.balance = newTxnInteger(balance);
    }

    public void incBalance(final int amount, final Date date){
        atomic(new Runnable(){
            public void run(){
                balance.increment(amount);
                lastUpdate.set(date);

                if(balance.get()<0){
                    throw new IllegalStateException("Not enough money");
                }
            }
        });
    }
    
    @Test
    @Transactional
    public void testIncBalance() {
    	final STMITCase test = new STMITCase(100);
    	atomic(new Runnable(){
            public void run(){
		    	test.incBalance(50, new Date());
		    	System.out.println(test.balance);
		    	Assert.assertEquals(test.balance.get(), 150);
            }
        });
    }
}
