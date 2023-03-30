package com.auctomatic.usecase;

import java.util.Scanner;

import com.auctomatic.Ui.Color;
import com.auctomatic.dao.BuyerDao;
import com.auctomatic.dao.BuyerDaoImpl;
import com.auctomatic.dto.Buyer;
import com.auctomatic.exception.CredentialException;
import com.auctomatic.exception.NoRecordFoundException;
import com.auctomatic.exception.SomeThingWrongException;

public class BuyerLoginUsecase {
	
	public static boolean BuyerLogin() throws SomeThingWrongException {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter Username-");
	    String buyer_username = sc.next();
	    System.out.println("Enter Password-");
	    String buyer_password = sc.next();

	    Buyer result = null;
	    BuyerDao dao = new BuyerDaoImpl();
	    try {
	        result = dao.BuyerLogin(buyer_username, buyer_password);
	        System.out.println();
	        System.out.println(Color.GREEN_BOLD_BRIGHT + "Welcome " + buyer_username + "!" + Color.RESET);
	        return true;
	    } catch (CredentialException e) {
	        System.err.println(Color.RED + "Error: Invalid Credentials"+ Color.RESET);
	    } catch (NoRecordFoundException e) {
	        System.err.println(Color.RED +"Error: No Record Found"+ Color.RESET);
	    }
	    return false;
	}
	
    public static void main(String[] args) throws CredentialException, NoRecordFoundException, SomeThingWrongException {
        boolean result = BuyerLogin();
    }
}
