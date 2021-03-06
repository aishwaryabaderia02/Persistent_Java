package com.beans;

public class Peripheral {
	private String itemCode;
	private String name;
	private String description;
	private int price, quantity;
	
	public Peripheral() { /* does nothing */ }

	public String getItemCode() { return itemCode; }
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public String getDescription() { return description; }
	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() { return price; }
	public void setPrice(int price) { this.price = price; }

	public int getQuantity() { return quantity; }
	public void setQuantity(int quantity) { this.quantity = quantity; }
}
