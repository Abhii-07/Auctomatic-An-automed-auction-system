package com.auctomatic.Ui;

import java.sql.SQLException;

import com.auctomatic.exception.CredentialException;
import com.auctomatic.usecase.AdminLoginUsecase;
import com.auctomatic.usecase.DailySellingReportUsecase;
import com.auctomatic.usecase.SalesReportLastWeekUsecase;
import com.auctomatic.usecase.ViewBuyerListUsecase;
import com.auctomatic.usecase.ViewSellerListUsecase;





public class AdminMain {
	public static boolean AdminLogin() throws CredentialException{
        AdminLoginUsecase login=new AdminLoginUsecase();
        boolean result = login.adminLogin();
        return result;
    }
	
	public static void AdminOptions() {
        System.out.println("Press 1 to"+ Color.BLUE_BOLD_BRIGHT +" View the Registered Buyer list"+ Color.RESET);
        System.out.println("Press 2 to"+ Color.BLUE_BOLD_BRIGHT +" View the Registered Seller list"+ Color.RESET);
        System.out.println("Press 3 to"+ Color.BLUE_BOLD_BRIGHT +" View the Daily selling report"+ Color.RESET);
        System.out.println("Press 4 to"+ Color.BLUE_BOLD_BRIGHT +" View the Weekly selling report"+ Color.RESET);
        System.out.println("Press 5 to"+ Color.BLUE_BOLD_BRIGHT +" LOGOUT AND RETURN TO HOMEPAGE"+ Color.RESET);
    }

	public void viewBuyers() {
		// TODO Auto-generated method stub
		 ViewBuyerListUsecase viewBuyerListUseCase=new ViewBuyerListUsecase();
		 viewBuyerListUseCase.viewBuyerList();
	}

	public void viewSellers() {
		// TODO Auto-generated method stub
		ViewSellerListUsecase viewSellerListUseCase=new ViewSellerListUsecase();
        viewSellerListUseCase.viewSellerList();
	}

	public void dailySellingReport() {
		// TODO Auto-generated method stub
		DailySellingReportUsecase dailySellingReportUsecase=new DailySellingReportUsecase();
        dailySellingReportUsecase.dailySellingReport();
	}
	
	public void weeklySellingReport() throws SQLException {
		// TODO Auto-generated method stub
		SalesReportLastWeekUsecase salesReportLastWeekUsecase=new SalesReportLastWeekUsecase();
		salesReportLastWeekUsecase.getSalesReportLastSevenDays();
	}


	
	
	
}
