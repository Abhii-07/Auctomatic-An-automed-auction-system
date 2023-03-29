package com.auctomatic.Ui;

import com.auctomatic.exception.CredentialException;
import com.auctomatic.exception.NoRecordFoundException;
import com.auctomatic.exception.SomeThingWrongException;
import com.auctomatic.usecase.BuyerLoginUsecase;

public class BuyerMain {
	public static boolean BuyerLogin() throws CredentialException, NoRecordFoundException, SomeThingWrongException{
        BuyerLoginUsecase login=new BuyerLoginUsecase();
        boolean result = login.BuyerLogin();
        return result;
    }
    public static void BuyerHomeWindow() {
        System.out.println("Press 1 to"+ Color.BLUE_BOLD_BRIGHT +" Search and view Items by category"+ Color.RESET);
        System.out.println("Press 2 to"+ Color.BLUE_BOLD_BRIGHT +" Selects Items to buy"+ Color.RESET);
        System.out.println("Press 3 to"+ Color.BLUE_BOLD_BRIGHT +" Select and view all the buyers and also their Items category wise"+ Color.RESET);
        System.out.println("Press 4 to"+ Color.BLUE_BOLD_BRIGHT +" LOGOUT AND RETURN TO HOMEPAGE"+ Color.RESET);
    }
	public void BuyerRegistration() {
		// TODO Auto-generated method stub
		
	}
	public void SearchItemCategory() {
		// TODO Auto-generated method stub
		
	}
	public void BuyItem() {
		// TODO Auto-generated method stub
		
	}
	public void BuyerByCategory() {
		// TODO Auto-generated method stub
		
	}
}
