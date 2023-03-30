package com.auctomatic.usecase;

import java.util.List;

import com.auctomatic.dao.AdminDao;
import com.auctomatic.dao.AdminDaoImpl;
import com.auctomatic.dto.Buyer;
import com.auctomatic.exception.AdminException;


public class ViewBuyerListUsecase {
	public static void main(String[] args) {
        viewBuyerList();
    }
    public static void viewBuyerList(){
        AdminDao dao=new AdminDaoImpl();
        try {
            List<Buyer> list=dao.ViewBuyers();
            System.out.println("-------------------------------Table of all the Buyers----------------------------------");

            System.out.println("------------------------------------------------------------------------------------");

            System.out.printf("%7s %14s %20s %25s", "BuyerId", "BuyerName","Email", "Mobile" );
            System.out.println();
            System.out.print("--------------------------------------------------------------------------------------");

            System.out.println();
            list.forEach(li->{
                System.out.format("%7s %14s %20s %25s",li.getBuyerId(),li.getBuyerName(),li.getEmail(),li.getMobile());
                System.out.println();

            });
            System.out.println("-------------------------------------------------------------------------------------");

        } catch (AdminException e) {
            System.out.println( e.getMessage() );
            
            
            
            
        }
    }
}
