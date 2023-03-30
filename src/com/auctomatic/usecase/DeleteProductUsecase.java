package com.auctomatic.usecase;

import java.util.Scanner;

import com.auctomatic.Ui.Color;
import com.auctomatic.dao.SellerDao;
import com.auctomatic.dao.SellerDaoImpl;
import com.auctomatic.exception.SellerException;


public class DeleteProductUsecase {
	public static void main(String[] args) {
        deleteProductitem();
    }

    public static void deleteProductitem(){
        Scanner sc =new Scanner(System.in);
        System.out.println(Color.CYAN_BACKGROUND_BRIGHT + "Enter Product Id: " + Color.RESET);
        int product_ID=sc.nextInt();

        String result;
        SellerDao dao=new SellerDaoImpl();
        try {
            result= dao.DeleteProductItems(product_ID);
            System.out.println(result);
        } catch (SellerException e) {
            result=e.getMessage();
            System.out.println(result);
        }

    }
}
