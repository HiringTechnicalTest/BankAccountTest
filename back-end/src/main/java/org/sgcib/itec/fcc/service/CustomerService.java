package com.bank.services;

import com.bank.domain.Account;

public class CustomerService {

	/**
	 * 
	 * @param iAccount
	 * @return
	 */
	public double checkAccount(Account iAccount){
		
		return iAccount.getBalance();
	}
	
}
