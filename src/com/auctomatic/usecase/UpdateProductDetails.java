package com.auctomatic.usecase;

import java.util.Scanner;

import com.auctomatic.Ui.Color;
import com.auctomatic.dao.SellerDao;
import com.auctomatic.dao.SellerDaoImpl;
import com.auctomatic.exception.SellerException;

public class UpdateProductDetails {
	public static void main(String[] args) {
        updateProductlist();
    }

    public static void updateProductlist(){
        Scanner sc =new Scanner(System.in);
        System.out.println(Color.RED_UNDERLINED + "Enter Product Id of product you want to update");
        int productId=sc.nextInt();
        System.out.println("Enter the Updated Price");
        int price=sc.nextInt();

        String result;
        SellerDao dao=new SellerDaoImpl();
        try {
            result=dao.UpdateProductDetailsByPrice(productId,price);
            System.out.println(result);
        } catch (SellerException e) {
            result=e.getMessage();
            System.out.println(result);
        }

    }
}
