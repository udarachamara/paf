package com.dilshan.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dilshan.dao.ItemDao;
import com.dilshan.model.Item;

@Repository
public class ItemDaoImpl implements ItemDao {
	
	@Autowired
	private SessionFactory session;
	

	@Override
	public void add(Item item) {
		session.getCurrentSession().save(item);
	}

	@Override
	public void edit(Item item) {
		session.getCurrentSession().update(item);
	}

	@Override
	public void delete(int ItemId) {
		session.getCurrentSession().delete(getItem(ItemId));
	}

	@Override
	public Item getItem(int ItemId) {
		return (Item) session.getCurrentSession().get(Item.class, ItemId);
	}

	@Override
	public List getAllItems() {
		return session.getCurrentSession().createQuery("from Item").list();
	}

}
