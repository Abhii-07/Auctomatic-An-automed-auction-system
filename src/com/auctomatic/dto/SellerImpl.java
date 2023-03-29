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

	public int getSeller_ID() {
		return seller_ID;
	}

	public void setSeller_ID(int seller_ID) {
		this.seller_ID = seller_ID;
	}

	public String getSeller_name() {
		return seller_name;
	}

	public void setSeller_name(String seller_name) {
		this.seller_name = seller_name;
	}

	public String getSeller_email() {
		return seller_email;
	}

	public void setSeller_email(String seller_email) {
		this.seller_email = seller_email;
	}

	public String getSeller_username() {
		return seller_username;
	}

	public void setSeller_username(String seller_username) {
		this.seller_username = seller_username;
	}

	public String getSeller_password() {
		return seller_password;
	}

	public void setSeller_password(String seller_password) {
		this.seller_password = seller_password;
	}

	public String getSeller_mobile() {
		return seller_mobile;
	}

	public void setSeller_mobile(String seller_mobile) {
		this.seller_mobile = seller_mobile;
	}

	
}
