package com.auctomatic.dto;

public class SoldItemsImpl implements SoldItems{
	    private int productId;
	    private String productName;
	    private String sellerName;
	    private String category;
	    private int buyerId;
	    private double price;
	    
	    public SoldItemsImpl() {}
	    
		public SoldItemsImpl(int productId, String productName, String sellerName, String category,int buyerId, double price) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.sellerName = sellerName;
			this.category = category;
			this.buyerId = buyerId;
			this.price = price;
		}

		public int getProductId() {
			return productId;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public String getSellerName() {
			return sellerName;
		}

		public void setSellerName(String sellerName) {
			this.sellerName = sellerName;
		}

		public String getCategoryName() {
			return category;
		}

		public void setCategoryName(String category) {
			this.category = category;
		}

		public int getBuyerId() {
			return buyerId;
		}

		public void setBuyerId(int buyerId) {
			this.buyerId = buyerId;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

}
