package com.auctomatic.usecase;


import java.util.List;
import java.util.Scanner;

import com.auctomatic.dao.AdminDao;
import com.auctomatic.dao.AdminDaoImpl;
import com.auctomatic.dto.Product;
import com.auctomatic.exception.AdminException;

public class DailyDisputeReportUsecase {
    public static void main(String[] args) {
        dailyDisputeReport();
    }
    public static void dailyDisputeReport(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter date you want to find dispute list of");
        String date=sc.next();
        AdminDao dao=new AdminDaoImpl();
        try {
            List<Product> list= dao.DailyDisputeReport(date);
            System.out.println("------------------------------Date Wise Dispute Report----------------------------------");

            System.out.println("---------------------------------------------------------------------------------------------");

            System.out.printf("%7s %18s %7s %7s %12s","Id", "ProductName","SellerId","CategoryId","Price");
            System.out.println();
            System.out.print("----------------------------------------------------------------------------------------------");

            System.out.println();
            list.forEach(li->{
                System.out.format("%7s %18s %7s %7s %17s",li.getProduct_ID(),li.getProduct_name(),li.getSeller_ID(),li.getCategory(),li.getPrice());
                System.out.println();

            });
            System.out.println("-------------------------------------------------------------------------------------------------");

        } catch (AdminException e) {
            System.out.println( e.getMessage() );
        }
    }
}
