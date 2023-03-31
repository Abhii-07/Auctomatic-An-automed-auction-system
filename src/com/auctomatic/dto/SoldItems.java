package com.auctomatic.dto;

public interface SoldItems {
	public int getProductId() ;

	public void setProductId(int productId) ;

	public String getProductName() ;

	public void setProductName(String productName) ;
	
	public String getSellerName() ;

	public void setSellerName(String sellerName) ;

	public String getCategoryName() ;

	public void setCategoryName(String categoryName) ;
	
	public int getBuyerId() ;

	public void setBuyerId(int buyerId) ;

	public double getPrice();

	public void setPrice(double price) ;
}
