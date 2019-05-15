package com.dilshan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Item {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO) // for autonumber
	
	private int itemId;
	@Column
	private int stockId;
	@Column
	private String itemName;
	@Column
	private float itemPrice;
	@Column
	private int quantity;
	
	public Item() {
		
	}

	public Item(int itemId, int stockId, String itemName, float itemPrice, int quantity) {
		super();
		this.itemId = itemId;
		this.stockId = stockId;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.quantity = quantity;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	

}
