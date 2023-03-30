package com.auctomatic.dto;

public class BuyerImpl implements Buyer{

	private int buyer_ID;
    private String buyer_name ;
    private String buyer_email ;
    private String buyer_username ;
    private String buyer_password ;
    private String buyer_mobile ;
    
    public BuyerImpl() {}

    
	public BuyerImpl(int buyer_ID, String buyer_name, String buyer_email, String buyer_username, String buyer_password,
			String buyer_mobile) {
		this.buyer_ID = buyer_ID;
		this.buyer_name = buyer_name;
		this.buyer_email = buyer_email;
		this.buyer_username = buyer_username;
		this.buyer_password = buyer_password;
		this.buyer_mobile = buyer_mobile;
	}


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

	public String getBuyer_username() {
		return buyer_username;
	}

	public void setBuyer_username(String buyer_username) {
		this.buyer_username = buyer_username;
	}

	public String getBuyer_password() {
		return buyer_password;
	}

	public void setBuyer_password(String buyer_password) {
		this.buyer_password = buyer_password;
	}

	public String getBuyer_mobile() {
		return buyer_mobile;
	}

	public void setBuyer_mobile(String buyer_mobile) {
		this.buyer_mobile = buyer_mobile;
	}
    
	

}
