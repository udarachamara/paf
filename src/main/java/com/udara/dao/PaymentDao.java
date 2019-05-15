package com.udara.dao;

import java.util.List;

import com.udara.model.Payment;

public interface PaymentDao {

	public void add(Payment payment);
	public void edit(Payment payment);
	public void delete(int paymentId);
	public Payment getPayment(int paymentId);
	public List getAllPayments();
}
