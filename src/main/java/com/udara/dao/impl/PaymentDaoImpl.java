package com.udara.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.udara.dao.PaymentDao;
import com.udara.model.Payment;

@Repository
public class PaymentDaoImpl implements PaymentDao {
	
	@Autowired
	private SessionFactory session;
	

	@Override
	public void add(Payment payment) {
		session.getCurrentSession().save(payment);
	}

	@Override
	public void edit(Payment payment) {
		session.getCurrentSession().update(payment);
	}

	@Override
	public void delete(int paymentId) {
		session.getCurrentSession().delete(getPayment(paymentId));
	}

	@Override
	public Payment getPayment(int paymentId) {
		return (Payment) session.getCurrentSession().get(Payment.class, paymentId);
	}

	@Override
	public List getAllPayments() {
		return session.getCurrentSession().createQuery("from Payment").list();
	}



}
