package com.auctomatic.dto;

public class SellerImpl implements Seller{
	 private int seller_ID ;
	 private String seller_name ;
	 private String seller_email ;
	 private String seller_username ;
	 private String seller_password ;
	 private String seller_mobile ;
	 
	 public SellerImpl() {}
	 
	public SellerImpl(int seller_ID, String seller_name, String seller_email, String seller_username, String seller_password, String seller_mobile) {
		super();
		this.seller_ID = seller_ID;
		this.seller_name = seller_name;
		this.seller_email = seller_email;
		this.seller_username = seller_username;
		this.seller_password = seller_password;
		this.seller_mobile = seller_mobile;
	}

	public int getSellerId() {
		return seller_ID;
	}

	public void setSellerId(int seller_ID) {
		this.seller_ID = seller_ID;
	}

	public String getSellerName() {
		return seller_name;
	}

	public void setSellerName(String seller_name) {
		this.seller_name = seller_name;
	}

	public String getEmail() {
		return seller_email;
	}

	public void setEmail(String seller_email) {
		this.seller_email = seller_email;
	}

	public String getPassword() {
		return seller_password;
	}

	public void setPassword(String seller_password) {
		this.seller_password = seller_password;
	}

	public String getUsername() {
		// TODO Auto-generated method stub
		return seller_username;
	}
	
	public void setUsername(String seller_username) {
		// TODO Auto-generated method stub
		this.seller_username = seller_username;
	}
	
	public String getMobile() {
		return seller_mobile;
	}
	
	public void setMobile(String seller_mobile) {
		this.seller_mobile = seller_mobile;
	}
	@Override
	public String toString() {
		return "sellerId = " + seller_ID + ", sellerName = " + seller_name + ", email= " + seller_email + ", Username = "
				+ seller_username + ", Mobile no = "  + seller_mobile + "]";
	}

}
