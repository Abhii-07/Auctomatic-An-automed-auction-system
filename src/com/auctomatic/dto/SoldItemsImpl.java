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

	public int getProductId() {
		return product_ID;
	}

	public void setProductId(int product_ID) {
		this.product_ID = product_ID;
	}

	public String getProductName() {
		return product_name;
	}

	public void setProductName(String product_name) {
		this.product_name = product_name;
	}

	public String getSellerName() {
		return seller_name;
	}

	public void setSellerName(String seller_name) {
		this.seller_name = seller_name;
	}

	public String getCategoryName() {
		return category_name;
	}

	public void setCategoryName(String category_name) {
		this.category_name = category_name;
	}

	public int getBuyerId() {
		return buyer_ID;
	}

	public void setBuyerId(int buyer_ID) {
		this.buyer_ID = buyer_ID;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

    
}
