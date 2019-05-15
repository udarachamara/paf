package com.udara.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SuccessPayment {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) // for autonumber
	private int transactionId;
	@Column	
	private boolean transactionStatus;
	@Column	
	private int responseCode;
	
	public SuccessPayment() {
		
	}

	public SuccessPayment(int transactionId, boolean transactionStatus, int responseCode) {
		super();
		this.transactionId = transactionId;
		this.transactionStatus = transactionStatus;
		this.responseCode = responseCode;
	}

	public int getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(int transactionId) {
		this.transactionId = transactionId;
	}

	public boolean isTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(boolean transactionStatus) {
		this.transactionStatus = transactionStatus;
	}

	public int getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}
	
	

}
