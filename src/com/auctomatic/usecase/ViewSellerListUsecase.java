package com.auctomatic.usecase;

import java.util.List;

import com.auctomatic.dao.AdminDao;
import com.auctomatic.dao.AdminDaoImpl;
import com.auctomatic.dto.Seller;
import com.auctomatic.exception.AdminException;


public class ViewSellerListUsecase {
	public static void main(String[] args) {
        viewSellerList();
    }
    public static void viewSellerList(){
        AdminDao dao=new AdminDaoImpl();
        try {
            List<Seller> list=dao.ViewSellers();
            System.out.println("-----------------------------Table of all the Sellers-------------------------------");

            System.out.println("------------------------------------------------------------------------------------");

            System.out.printf("%7s %12s %20s %25s","SellerId", "SellerName","Email", "Mobile No" );
            System.out.println();
            System.out.print("---------------------------------------------------------------------------------------");

            System.out.println();
            list.forEach(li->{
                System.out.format("%7s %12s %20s %25s",li.getSeller_ID(),li.getSeller_name(),li.getSeller_email(),li.getSeller_mobile());
                System.out.println();

            });
            System.out.println("---------------------------------------------------------------------------------------");

        } catch (AdminException e) {
            System.out.println(e.getMessage());
        }
    }
}
