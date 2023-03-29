package com.auctomatic.Ui;

import com.auctomatic.usecase.SellerLoginUsecase;

public class SellerMain {
	public static boolean SellerLogin(){
		SellerLoginUsecase login=new SellerLoginUsecase();
        boolean result=login.SellerLogin();
        return result;
    }
    public static void SellerHomeWindow() {
        System.out.println("Press 1 to"+ Color.CYAN_BOLD_BRIGHT +" Create list of items to sell"+ Color.RESET);
        System.out.println("Press 2 to"+ Color.CYAN_BOLD_BRIGHT +" Update Item price"+ Color.RESET);
        System.out.println("Press 3 to"+ Color.CYAN_BOLD_BRIGHT +" Remove items from the list"+ Color.RESET);
        System.out.println("Press 4 to"+ Color.CYAN_BOLD_BRIGHT +" View the sold Item history"+ Color.RESET);
        System.out.println("Press 5 to"+ Color.CYAN_BOLD_BRIGHT +" LOGOUT AND RETURN TO HOMEPAGE"+ Color.RESET);
    }
	public void SellerRegistration() {
		// TODO Auto-generated method stub
		
	}
	public void createListofProducts() {
		// TODO Auto-generated method stub
		
	}
	public void updateProductList() {
		// TODO Auto-generated method stub
		
	}
	public void deleteProductItem() {
		// TODO Auto-generated method stub
		
	}
	public void soldItemHistory() {
		// TODO Auto-generated method stub
		
	}
}
