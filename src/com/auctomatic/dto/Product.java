package com.auctomatic.dto;

public interface Product {
	public int getProduct_ID();
	public void setProduct_ID(int product_ID);
	public String getProduct_name();
	public void setProduct_name(String product_name);
	public String getCategory();
	public void setCategory(String category);
	public int getBuyer_ID();
	public void setBuyer_ID(int buyer_ID);
	public int getSeller_ID();
	public void setSeller_ID(int seller_ID);
	public int getPrice();
	public void setPrice(int price);
	public int getStatus();
	public void setStatus(int status);
	public String getDescription();
	public void setDescription(String description);
}


