package com.auctomatic.usecase;

import java.util.Scanner;

import com.auctomatic.dao.BuyerDao;
import com.auctomatic.dao.BuyerDaoImpl;
import com.auctomatic.dto.Buyer;
import com.auctomatic.exception.CredentialException;
import com.auctomatic.exception.NoRecordFoundException;
import com.auctomatic.exception.SomeThingWrongException;

public class BuyerLoginUsecase {
	public static boolean BuyerLogin() throws CredentialException, NoRecordFoundException, SomeThingWrongException {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Email-");
        String buyer_username=sc.next();
        System.out.println("Enter Password-");
        String buyer_passowrd=sc.next();

        Buyer result;
        BuyerDao dao = new BuyerDaoImpl();
        result=dao.BuyerLogin(buyer_username,buyer_passowrd);
        System.out.println(result);
        return true;
    }
    public static void main(String[] args) throws CredentialException, NoRecordFoundException, SomeThingWrongException {
        boolean result = BuyerLogin();
    }
    
//    Scanner sc =new Scanner(System.in);
//    System.out.println("Enter Email-");
//    String email=sc.next();
//    System.out.println("Enter Password-");
//    String password=sc.next();
//
//    String result;
//    AdminDao dao=new AdminDaoImpl();
//    try {
//        result=dao.AdminLogin(email,password);
//        System.out.println(result);
//        return true;
//    } catch (CredentialException e) {
//        result = e.getMessage();
//        System.out.println(result);
//        return false;
//    }
}
