package com.goda5.hagendaz.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.goda5.hagendaz.data.dao.AccountDao;

@Service
public class AccountService implements PostProcessorAware {
	
	
	@Inject
	private AccountDao dao;
	
	@Transactional(readOnly=false, propagation=Propagation.REQUIRES_NEW)
	public void transfer() {
	
	}

	@Override
	public void setValue(String value) {
		System.out.println("Value is " + value);
	}
}
