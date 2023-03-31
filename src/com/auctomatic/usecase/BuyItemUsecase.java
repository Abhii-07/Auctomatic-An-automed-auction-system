package com.auctomatic.usecase;

import java.time.LocalDate;
import java.util.Scanner;

import com.auctomatic.dao.BuyerDao;
import com.auctomatic.dao.BuyerDaoImpl;
import com.auctomatic.exception.BuyerException;


public class BuyItemUsecase {
	public static void main(String[] args) {
        buyitem();
    }

    public static void buyitem(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the buyer ID: ");
        int buyerID = sc.nextInt();
        System.out.println("Enter the product name: ");
        String productName = sc.next();
        LocalDate date= LocalDate.now();

        String result;
        BuyerDao dao=new BuyerDaoImpl();
        try {
            result= dao.BuyItem(buyerID,date,productName);
            System.out.println(result);
        } catch (BuyerException e) {
            result=e.getMessage();
            System.out.println(result);
        }

    }
}
