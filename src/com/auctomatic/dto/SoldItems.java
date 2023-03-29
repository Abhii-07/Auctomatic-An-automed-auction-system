package com.auctomatic.dto;

public interface SoldItems {
	public int getProductId() ;

	public void setProductId(int productId) ;

	public String getProductName() ;

	public void setProductName(String productName) ;
	
	public String getSellerName() ;

	public void setSellerName(String seller_name) ;

	public String getCategoryName() ;

	public void setCategoryName(String categoryName) ;
	
	public int getBuyerId() ;

	public void setBuyerId(int buyer_ID) ;

	public int getPrice();

	public void setPrice(int price) ;
}
