package com.auctomatic.Ui;

import com.auctomatic.exception.CredentialException;
import com.auctomatic.exception.NoRecordFoundException;
import com.auctomatic.exception.SomeThingWrongException;
import com.auctomatic.usecase.BuyItemUsecase;
import com.auctomatic.usecase.BuyerLoginUsecase;
import com.auctomatic.usecase.BuyerPasswordChangeUsecase;
import com.auctomatic.usecase.BuyerRegistrationUsecase;
import com.auctomatic.usecase.ViewAllItemsForSaleUsecase;



public class BuyerMain {
	public static boolean BuyerLogin() throws SomeThingWrongException{
        BuyerLoginUsecase login=new BuyerLoginUsecase();
        boolean result = login.BuyerLogin();
        return result;
    }
    public static void BuyerHomeWindow() {
    	System.out.println();
        System.out.println("Press 1 to"+ Color.BLUE_BOLD_BRIGHT +" Change Password "+ Color.RESET);
        System.out.println("Press 2 to"+ Color.BLUE_BOLD_BRIGHT +" View All Items For Sale "+ Color.RESET);
        System.out.println("Press 3 to"+ Color.BLUE_BOLD_BRIGHT +" Buy Products" + Color.RESET);
        System.out.println("|");
        System.out.println("Press 4 to"+ Color.RED_BRIGHT +" LOGOUT "+ Color.RESET);
        System.out.println("Press 5 to"+ Color.RED_BRIGHT +" DELETE ACCOUNT "+ Color.RESET);
    }
	public void BuyerRegistration() {
		 BuyerRegistrationUsecase register = new BuyerRegistrationUsecase();
		 register.BuyerRegistraion();
	}
	
	public void ChangePassword() {
		BuyerPasswordChangeUsecase buyer = new BuyerPasswordChangeUsecase();
		buyer.buyerPasswordChange();
	}
	
	public static void BuyItem(){
        BuyItemUsecase buyItemUseCase=new BuyItemUsecase();
        buyItemUseCase.buyitem();
    }
	public void  ViewAllItemsForSale() {
		// TODO Auto-generated method stub
		ViewAllItemsForSaleUsecase buyer = new ViewAllItemsForSaleUsecase();
		buyer.viewAllItemsOnSale();
	}
	public void DeleteAccount() {
		// TODO Auto-generated method stub
	}
}
