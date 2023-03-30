package com.auctomatic.Ui;

import java.util.Scanner;

import com.auctomatic.dto.Product;
import com.auctomatic.exception.SomeThingWrongException;
import com.auctomatic.usecase.AddItemsCase;
import com.auctomatic.usecase.SellerLoginUsecase;
import com.auctomatic.usecase.SellerRegistrationUsecase;
import com.auctomatic.usecase.UpdateProductDetails;


public class SellerMain {
	
	public static boolean SellerLogin() throws SomeThingWrongException{
		SellerLoginUsecase login=new SellerLoginUsecase();
        boolean result=login.SellerLogin();
        return result;
    }
    public static void SellerHomeWindow() {
    	System.out.println();
        System.out.println("Press 1 to"+ Color.BLUE_BOLD_BRIGHT +" Add Items to Sell "+ Color.RESET);
        System.out.println("Press 2 to"+ Color.CYAN_BOLD_BRIGHT +" Update Details of Item "+ Color.RESET);
        System.out.println("Press 3 to"+ Color.CYAN_BOLD_BRIGHT +" Delete Item "+ Color.RESET);
        System.out.println("Press 4 to"+ Color.CYAN_BOLD_BRIGHT +" See Transaction Report of Items Sold " + Color.RESET);
        System.out.println("Press 5 to"+ Color.CYAN_BOLD_BRIGHT +" See Transaction Report of Items Returned"+ Color.RESET);
        System.out.println();
        System.out.println("Press 6 to"+ Color.RED_BRIGHT +" LOGOUT "+ Color.RESET);
        System.out.println("Press 7 to"+ Color.RED_BRIGHT +" DELETE ACCOUNT "+ Color.RESET);
    }
	public void SellerRegistration() {
		SellerRegistrationUsecase register = new SellerRegistrationUsecase();
		register.SellerRegistraion();
	}
	public void AddItems() {
		// TODO Auto-generated method stub
		AddItemsCase addItemsCase=new AddItemsCase();
		addItemsCase.AddItems();
		
	}
	public void updateItem() {
		// TODO Auto-generated method stub
		UpdateProductDetails updateProductDetails=new UpdateProductDetails();
		updateProductDetails.updateProductlist();
	}
	public void deleteItem() {
		// TODO Auto-generated method stub
		
	}
	public void soldItemsReport() {
		// TODO Auto-generated method stub
		
	}
	
	public void returnedItemsReport() {
		// TODO Auto-generated method stub
		
	}
	public void sellerDelete() {
		// TODO Auto-generated method stub
		
	}
	
}
