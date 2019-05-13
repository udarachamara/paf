package com.dilshan.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dilshan.dao.ItemDao;
import com.dilshan.model.Item;
import com.dilshan.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemDao itemDao;

	@Transactional
	public void add(Item item) {
		itemDao.add(item);

	}

	@Transactional
	public void edit(Item item) {
		itemDao.edit(item);
	}

	@Transactional
	public void delete(int ItemId) {
		itemDao.delete(ItemId);
	}

	@Transactional
	public Item getItem(int ItemId) {
		return itemDao.getItem(ItemId);
	}

	@Transactional
	public List getAllItems() {
		return itemDao.getAllItems();
	}

}
