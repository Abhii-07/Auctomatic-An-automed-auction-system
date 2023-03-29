package com.auctomatic.dto;

public class BuyerImpl implements Buyer{

	private int buyer_ID;
    private String buyer_name ;
    private String buyer_email ;
    private String buyer_username ;
    private String buyer_password ;
    private String buyer_mobile ;
    
    public BuyerImpl() {}
    
	public BuyerImpl(int buyer_ID, String buyer_name, String buyer_email,String buyer_username, String buyer_password, String buyer_mobile) {
		super();
		this.buyer_ID = buyer_ID;
		this.buyer_name = buyer_name;
		this.buyer_email = buyer_email;
		this.buyer_username = buyer_username;
		this.buyer_password = buyer_password;
		this.buyer_mobile = buyer_mobile;
	}

	public int getBuyerId() {
		return buyer_ID;
	}
	public void setBuyerId(int buyer_ID) {
		this.buyer_ID = buyer_ID;
	}
	public String getBuyerName() {
		return buyer_name;
	}
	public void setBuyerName(String buyer_name) {
		this.buyer_name = buyer_name;
	}
	public String getEmail() {
		return buyer_email;
	}
	public void setEmail(String buyer_email) {
		this.buyer_email = buyer_email;
	}
	public String getPassword() {
		return buyer_password;
	}
	public void setPassword(String buyer_password) {
		this.buyer_password = buyer_password;
	}
	public String getMobile() {
		return buyer_mobile;
	}
	
	public void setMobile(String buyer_mobile) {
		this.buyer_mobile = buyer_mobile;
	}
	
	public String getUsername() {
		return buyer_username;
	}
	
	public void setUsername(String buyer_username) {
		this.buyer_username = buyer_username;
	}
	
	@Override
	public String toString() {
		return "buyerId = " + buyer_ID + "\n" + "buyerName = " + buyer_name + "\n" + "email = " + buyer_email + "\n" + "username = " + buyer_username + "\n"+"password = "
				+ buyer_password + "\n" + "Mobile No = " + buyer_username + "\n";
	}

    

}
