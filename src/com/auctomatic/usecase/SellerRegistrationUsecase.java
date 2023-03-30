package com.auctomatic.usecase;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.auctomatic.dao.SellerDao;
import com.auctomatic.dao.SellerDaoImpl;
import com.auctomatic.dto.Seller;
import com.auctomatic.dto.SellerImpl;
import com.auctomatic.exception.SellerException;

public class SellerRegistrationUsecase {
	
	public static void main(String[] args) {
        SellerRegistraion();
    }

    public static void SellerRegistraion(){
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
            SellerDao dao =new SellerDaoImpl();

            Seller seller =new SellerImpl();
            
            
            seller.setSeller_name(name);
            seller.setSeller_email(email);
            seller.setSeller_username(username);
            seller.setSeller_password(password);
            seller.setSeller_mobile(mobile);

            try {
                result = dao.RegisterSeller(seller);
                System.out.println(result);
            } catch (SellerException ex) {
                result=ex.getMessage();
                System.out.println(result);
            }

        }catch (InputMismatchException i){
            System.out.println("Exception : Invalid Input Data Type");
        }

    }
}
