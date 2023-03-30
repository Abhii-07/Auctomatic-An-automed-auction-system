package com.auctomatic.dto;

public class ProductImpl implements Product{
	private int product_ID;
	private String product_name;
	private String category;
	private int buyer_ID;
	private int seller_ID;
	private int price;
	private int status;
	private String description;
	public ProductImpl(int product_ID, String product_name, String category, int buyer_ID, int seller_ID, int price,
			int status, String description) {
		this.product_ID = product_ID;
		this.product_name = product_name;
		this.category = category;
		this.buyer_ID = buyer_ID;
		this.seller_ID = seller_ID;
		this.price = price;
		this.status = status;
		this.description = description;
	}
	public ProductImpl() {
	}
	public int getProduct_ID() {
		return product_ID;
	}
	public void setProduct_ID(int product_ID) {
		this.product_ID = product_ID;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getBuyer_ID() {
		return buyer_ID;
	}
	public void setBuyer_ID(int buyer_ID) {
		this.buyer_ID = buyer_ID;
	}
	public int getSeller_ID() {
		return seller_ID;
	}
	public void setSeller_ID(int seller_ID) {
		this.seller_ID = seller_ID;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
		 
	
	
	
	
}
