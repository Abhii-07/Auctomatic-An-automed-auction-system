package com.auctomatic.usecase;


import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.auctomatic.dao.AdminDao;
import com.auctomatic.dao.AdminDaoImpl;
import com.auctomatic.dto.SearchBuyerImpl;
import com.auctomatic.exception.AdminException;


public class DailySellingReportUsecase {
    public static void main(String[] args) {
        dailySellingReport();
    }
    public static void dailySellingReport(){
    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter date you want to find list of sold items (yyyy-MM-dd)");
        String dateStr=sc.next();
        LocalDate date = LocalDate.parse(dateStr);

        AdminDao dao=new AdminDaoImpl();
        try {
            List<SearchBuyerImpl> list= dao.DailySellingReport(dateStr);
            int totalSold = list.size();
            int totalSales = list.stream().mapToInt(SearchBuyerImpl::getPrice).sum();

            System.out.println("+------------+------------+-------------+");
            System.out.println("| Date       | Total_Sold | Total_Sales |");
            System.out.println("+------------+------------+-------------+");
            System.out.printf("| %10s | %10d | %11d |%n", date, totalSold, totalSales);
            System.out.println("+------------+------------+-------------+");

        } catch (AdminException e) {
            System.out.println( e.getMessage() );
        }
    }
}
