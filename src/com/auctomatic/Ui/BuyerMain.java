package com.auctomatic.Ui;

import com.auctomatic.exception.CredentialException;
import com.auctomatic.exception.NoRecordFoundException;
import com.auctomatic.exception.SomeThingWrongException;
import com.auctomatic.usecase.BuyerLoginUsecase;
import com.auctomatic.usecase.BuyerPasswordChangeUsecase;
import com.auctomatic.usecase.BuyerRegistrationUsecase;


public class BuyerMain {
	public static boolean BuyerLogin() throws SomeThingWrongException{
        BuyerLoginUsecase login=new BuyerLoginUsecase();
        boolean result = login.BuyerLogin();
        return result;
    }
    public static void BuyerHomeWindow() {
    	System.out.println();
        System.out.println("Press 1 to"+ Color.BLUE_BOLD_BRIGHT +" Update Details "+ Color.RESET);
        System.out.println("Press 2 to"+ Color.BLUE_BOLD_BRIGHT +" Change Password "+ Color.RESET);
        System.out.println("Press 3 to"+ Color.BLUE_BOLD_BRIGHT +" View All Items For Sale "+ Color.RESET);
        System.out.println("Press 4 to"+ Color.BLUE_BOLD_BRIGHT +" Buy Products" + Color.RESET);
        System.out.println("Press 5 to"+ Color.BLUE_BOLD_BRIGHT +" Return Products"+ Color.RESET);
        System.out.println("|");
        System.out.println("Press 6 to"+ Color.RED_BRIGHT +" LOGOUT "+ Color.RESET);
        System.out.println("Press 7 to"+ Color.RED_BRIGHT +" DELETE ACCOUNT "+ Color.RESET);
    }
	public void BuyerRegistration() {
		 BuyerRegistrationUsecase register = new BuyerRegistrationUsecase();
		 register.BuyerRegistraion();
	}
	
	public void ChangePassword() {
		BuyerPasswordChangeUsecase buyer = new BuyerPasswordChangeUsecase();
		buyer.buyerPasswordChange();
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
