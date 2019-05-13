package com.dilshan.service;

import java.util.List;

import com.dilshan.model.Item;

	public interface ItemService {
	public void add(Item item);
	public void edit(Item item);
	public void delete(int ItemId);
	public Item getItem(int ItemId);
	public List getAllItems();
}
