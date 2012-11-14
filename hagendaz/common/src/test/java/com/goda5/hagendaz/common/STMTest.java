package com.goda5.hagendaz.common;

import java.util.Date;

import org.multiverse.api.references.TxnInteger;
import org.multiverse.api.references.TxnRef;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.multiverse.api.StmUtils.*;

public class STMTest {
	private TxnRef<Date> lastUpdate;
    private TxnInteger balance;
    
    public STMTest() {
    	
    }
    
    public STMTest(int balance){
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
    public void testIncBalance() {
    	STMTest test = new STMTest(100);
    	test.incBalance(50, new Date());
    	System.out.println(test.balance);
    	//Assert.assertEquals(test.balance.get(), 150);
    }
}
