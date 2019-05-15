package com.udara.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Account {
	@Id
	@Column
	private int accountNo;
	
	@Column
	private float accountBalance;
	
	@Column
	private String cardNo;
	
	@Column
	private int cvc;
	
	@Column
	private String accountStatus;
	
	public Account() {
		
	}

	public Account(int accountNo, float accountBalance, String cardNo, int cvc, String accountStatus) {
		super();
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.cardNo = cardNo;
		this.cvc = cvc;
		this.accountStatus = accountStatus;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public float getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public int getCvc() {
		return cvc;
	}

	public void setCvc(int cvc) {
		this.cvc = cvc;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}
	
	
	
}
