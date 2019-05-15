package com.udara.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Payment {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) // for autonumber
	
	private int paymentId;
	@Column
	private int supplierId;
	@Column
	private int orderId;
	@Column
	private float totalPrice;
	@Column
	private String deliveryAddress;
	@Column
	private String cardNo;
	@Column
	private int cvc;
	
	public Payment() {
		
	}
	
	public Payment(int paymentId, int supplierId, int orderId, float totalPrice, String deliveryAddress, String cardNo,
			int cvc) {
		super();
		this.paymentId = paymentId;
		this.supplierId = supplierId;
		this.orderId = orderId;
		this.totalPrice = totalPrice;
		this.deliveryAddress = deliveryAddress;
		this.cardNo = cardNo;
		this.cvc = cvc;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}

	public int getSupplierId() {
		return supplierId;
	}

	public void setSupplierId(int supplierId) {
		this.supplierId = supplierId;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(String deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
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
	
	
	
	
}
