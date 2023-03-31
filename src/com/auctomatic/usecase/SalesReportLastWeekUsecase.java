package com.auctomatic.usecase;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.auctomatic.dao.AdminDao;
import com.auctomatic.dao.AdminDaoImpl;
import com.auctomatic.dto.SearchBuyerImpl;
import com.auctomatic.exception.AdminException;

public class SalesReportLastWeekUsecase {
	 public static void main(String[] args) throws SQLException {
		 getSalesReportLastSevenDays();
	    }
	    public static void getSalesReportLastSevenDays() throws SQLException{
	    	Scanner sc=new Scanner(System.in);
	    	AdminDao dao=new AdminDaoImpl();
	    	List<SearchBuyerImpl> list= dao.viewSalesReportLastSevenDays();
	    	System.out.println("---------------------------------Weekly Selling Report-------------------------------------");
	    	System.out.println("--------------------------------------------------------------------------------------------");

	    	System.out.printf("%7s %15s %20s %20s %15s %7s %12s", "Id", "BuyerName","email","ProductName","CategoryName","SellerID","Price");
	    	System.out.println();
	    	System.out.print("--------------------------------------------------------------------------------------------");

	    	System.out.println();
	    	list.forEach(li->{
	    		System.out.format("%7s %15s %20s %20s %15s %7s %15s",li.getBuyer_ID(),li.getBuyer_name(),li.getBuyer_email(),li.getProduct_name(),li.getCategory_name(),li.getSeller_ID(),li.getPrice());
	    		System.out.println();
	    	});
	    	System.out.println("--------------------------------------------------------------------------------------------");
	    }
}
