package com.auctomatic.usecase;

import java.util.Scanner;

import com.auctomatic.Ui.Color;
import com.auctomatic.dao.SellerDao;
import com.auctomatic.dao.SellerDaoImpl;
import com.auctomatic.dto.Seller;
import com.auctomatic.exception.CredentialException;
import com.auctomatic.exception.NoRecordFoundException;
import com.auctomatic.exception.SomeThingWrongException;


public class SellerLoginUsecase {
	
	public static void main(String[] args) throws CredentialException, NoRecordFoundException, SomeThingWrongException{
        boolean result = SellerLogin();
    }
    public static boolean SellerLogin() throws SomeThingWrongException {
    	Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Username-");
	    String seller_username = sc.next();
	    System.out.println("Enter Password-");
	    String seller_password = sc.next();

	    Seller result = null;
	    SellerDao dao = new SellerDaoImpl();
	    try {
	        result = dao.SellerLogin(seller_username, seller_password);
	        System.out.println(Color.CYAN_BACKGROUND_BRIGHT + "Welcome " + seller_username + "!" + Color.RESET);
	        return true;
	    } catch (CredentialException e) {
	        System.err.println("Error: Invalid Credentials");
	    } catch (NoRecordFoundException e) {
	        System.err.println("Error: No Record Found");
	    }
	    return false;
    }
}
