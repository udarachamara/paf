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
	
	private int ItemId;
	@Column
	private int StockId;
	@Column
	private String ItemName;
	@Column
	private float ItemPrice;
	@Column
	private int Quantity;
	
	public Item() {
		
	}

	public int getItemId() {
		return ItemId;
	}

	public void setItemId(int itemId) {
		ItemId = itemId;
	}

	public int getStockId() {
		return StockId;
	}

	public void setStockId(int stockId) {
		StockId = stockId;
	}

	public String getItemName() {
		return ItemName;
	}

	public void setItemName(String itemName) {
		ItemName = itemName;
	}

	public float getItemPrice() {
		return ItemPrice;
	}

	public void setItemPrice(float itemPrice) {
		ItemPrice = itemPrice;
	}

	public int getQuantity() {
		return Quantity;
	}

	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	
	

}
