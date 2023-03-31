package com.auctomatic.usecase;

import java.util.List;
import java.util.Scanner;

import com.auctomatic.Ui.Color;
import com.auctomatic.dao.BuyerDao;
import com.auctomatic.dao.BuyerDaoImpl;
import com.auctomatic.dto.SoldItems;
import com.auctomatic.exception.BuyerException;
import com.auctomatic.exception.SellerException;

public class ViewAllItemsForSaleUsecase {
    public static void main(String[] args) {
        viewAllItemsOnSale();
    }

    public static void viewAllItemsOnSale() {

    	Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Category Name: ");
        String category =sc.next();
        BuyerDao dao=new BuyerDaoImpl();
        try {
            List<SoldItems> list= dao.viewAllItemsForSale(category);

            System.out.println("---------------------------------------------------------------------------------");

            System.out.printf(Color.RED_BACKGROUND_BRIGHT + "%5s %15s %10s %15s %15s", "Id", "ProductName","SellerId","CategoryName","Price" + Color.RESET);
            System.out.println();
            System.out.print("---------------------------------------------------------------------------------");

            System.out.println();
            list.forEach(li->{
                System.out.format("%5s %15s %10s %15s %15.2f",li.getProductId(),li.getProductName(),li.getSellerName(),li.getCategoryName(),li.getPrice());
                System.out.println();

            });
            System.out.println("---------------------------------------------------------------------------------");

        } catch (BuyerException e) {
            System.out.println( e.getMessage());
        }
    }
}
