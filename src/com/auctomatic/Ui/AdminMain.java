package com.auctomatic.Ui;

import com.auctomatic.exception.CredentialException;
import com.auctomatic.usecase.AdminLoginUsecase;

import usecases.DailyDisputeReportUseCase;
import usecases.DailySellingReportUsecase;
import usecases.ResolveDisputeUseCase;
import usecases.ViewBuyerListUseCase;
import usecases.ViewSellerListUseCase;

public class AdminMain {
	public static boolean AdminLogin() throws CredentialException{
        AdminLoginUsecase login=new AdminLoginUsecase();
        boolean result = login.adminLogin();
        return result;
    }
	
	public static void AdminOptions() {
        System.out.println("Press 1 to"+ Color.BLUE_BOLD_BRIGHT +" View the registered buyer list"+ Color.RESET);
        System.out.println("Press 2 to"+ Color.BLUE_BOLD_BRIGHT +" View the registered Seller list"+ Color.RESET);
        System.out.println("Press 3 to"+ Color.BLUE_BOLD_BRIGHT +" View the daily selling report"+ Color.RESET);
        System.out.println("Press 4 to"+ Color.BLUE_BOLD_BRIGHT +" View the daily dispute report"+ Color.RESET);
        System.out.println("Press 5 to"+ Color.BLUE_BOLD_BRIGHT +" Solve the dispute report"+ Color.RESET);
        System.out.println("Press 6 to"+ Color.BLUE_BOLD_BRIGHT +" LOGOUT AND RETURN TO HOMEPAGE"+ Color.RESET);
    }

	public void viewBuyers() {
		// TODO Auto-generated method stub
		
	}

	public void viewSellers() {
		// TODO Auto-generated method stub
		
	}

	public void dailySellingReport() {
		// TODO Auto-generated method stub
		
	}

	public void dailyDisputeReport() {
		// TODO Auto-generated method stub
		
	}

	public void solveDispute() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
