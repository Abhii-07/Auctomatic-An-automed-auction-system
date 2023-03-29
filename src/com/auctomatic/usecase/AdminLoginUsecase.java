package com.auctomatic.usecase;

import java.util.Scanner;

import com.auctomatic.dao.AdminDao;
import com.auctomatic.dao.AdminDaoImpl;
import com.auctomatic.exception.CredentialException;

public class AdminLoginUsecase {
	 public static boolean adminLogin() throws CredentialException{
	        Scanner sc =new Scanner(System.in);
	        System.out.println("Enter Email-");
	        String email=sc.next();
	        System.out.println("Enter Password-");
	        String password=sc.next();

	        String result;
	        AdminDao dao=new AdminDaoImpl();
	        result=dao.AdminLogin(email,password);
			System.out.println(result);
			return true;
	    }
}
