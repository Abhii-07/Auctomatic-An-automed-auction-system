package com.auctomatic.dto;

public class SoldItemsImpl implements SoldItems{
	private int product_ID;
    private String product_name;
    private String seller_name;
    private String category_name;
    private int buyer_ID;
    private int price;
    
    public SoldItemsImpl() {}
    
	public SoldItemsImpl(int product_ID, String product_name, String seller_name, String category_name,int buyer_ID, int price) {
		super();
		this.product_ID = product_ID;
		this.product_name = product_name;
		this.seller_name = seller_name;
		this.category_name = category_name;
		this.buyer_ID = buyer_ID;
		this.price = price;
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

	public String getSeller_name() {
		return seller_name;
	}

	public void setSeller_name(String seller_name) {
		this.seller_name = seller_name;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public int getBuyer_ID() {
		return buyer_ID;
	}

	public void setBuyer_ID(int buyer_ID) {
		this.buyer_ID = buyer_ID;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
    
}
