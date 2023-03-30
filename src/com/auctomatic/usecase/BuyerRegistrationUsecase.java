package com.auctomatic.usecase;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

import com.auctomatic.Ui.BuyerMain;
import com.auctomatic.dao.BuyerDao;
import com.auctomatic.dao.BuyerDaoImpl;
import com.auctomatic.dto.Buyer;
import com.auctomatic.dto.BuyerImpl;
import com.auctomatic.exception.BuyerException;
import com.auctomatic.exception.SomeThingWrongException;

public class BuyerRegistrationUsecase {
    public static void main(String[] args) {
        BuyerRegistraion();
    }

    public static void BuyerRegistraion(){
        try {
        	Scanner sc = new Scanner(System.in);
	        System.out.println("Enter Name");
	        String name = sc.nextLine();
	        System.out.println("Enter Email");
	        String email = sc.nextLine();
	        System.out.println("Enter Username");
	        String username = sc.nextLine();
	        System.out.println("Enter Password");
	        String password = sc.nextLine();
	        System.out.println("Enter Mobile");
	        String mobile = sc.nextLine();
	        
            String result;
            BuyerDao dao =new BuyerDaoImpl();

            Buyer buyer =new BuyerImpl();

            buyer.setBuyer_name(name);
	        buyer.setBuyer_email(email);
	        buyer.setBuyer_username(username);
	        buyer.setBuyer_password(password);
	        buyer.setBuyer_mobile(mobile);

            try {
                result = dao.RegisterBuyer(buyer);
                System.out.println(result);
            } catch (BuyerException ex) {
                result=ex.getMessage();
                System.out.println(result);
            }

        }catch (InputMismatchException i){
            System.out.println( "Exception : Invalid Input Data Type" );
        }

    }
}
