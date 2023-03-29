package com.auctomatic.dto;

public class SearchBuyerImpl implements SearchBuyer{
	private int buyer_ID;
	 private String  buyer_name;
	 private String  buyer_email;
	 private String product_name;
	 private String category_name;
	 private int seller_ID;
	 private int price;
	 
	public SearchBuyerImpl(int buyer_ID, String buyer_name, String buyer_email, String product_name,
			String category_name, int seller_ID, int price) {
		this.buyer_ID = buyer_ID;
		this.buyer_name = buyer_name;
		this.buyer_email = buyer_email;
		this.product_name = product_name;
		this.category_name = category_name;
		this.seller_ID = seller_ID;
		this.price = price;
	}
	
	public SearchBuyerImpl() {}

	public int getBuyer_ID() {
		return buyer_ID;
	}

	public void setBuyer_ID(int buyer_ID) {
		this.buyer_ID = buyer_ID;
	}

	public String getBuyer_name() {
		return buyer_name;
	}

	public void setBuyer_name(String buyer_name) {
		this.buyer_name = buyer_name;
	}

	public String getBuyer_email() {
		return buyer_email;
	}

	public void setBuyer_email(String buyer_email) {
		this.buyer_email = buyer_email;
	}

	public String getProduct_name() {
		return product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
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
	 
	 
}
