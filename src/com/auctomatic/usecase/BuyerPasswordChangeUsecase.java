package com.auctomatic.usecase;

import java.util.Scanner;

import com.auctomatic.Ui.Color;
import com.auctomatic.dao.BuyerDao;
import com.auctomatic.dao.BuyerDaoImpl;
import com.auctomatic.dao.SellerDao;
import com.auctomatic.dao.SellerDaoImpl;
import com.auctomatic.exception.SellerException;

public class BuyerPasswordChangeUsecase {
	public static void main(String[] args) {
		buyerPasswordChange();
    }

    public static void buyerPasswordChange(){
        Scanner sc =new Scanner(System.in);
        System.out.println(Color.CYAN_BACKGROUND_BRIGHT + "Enter Username:  " + Color.RESET);
        String buyer_username = sc.next();
        System.out.println(Color.CYAN_BACKGROUND_BRIGHT + "Enter New Password:  " + Color.RESET);
        String buyer_password = sc.next();
        System.out.println(Color.CYAN_BACKGROUND_BRIGHT + "Re-enter New Password:  " + Color.RESET);
        String buyer_passwordRe = sc.next();

        String result;
        BuyerDao dao=new BuyerDaoImpl();
        try {
            result = dao.changePassword(buyer_username,buyer_password);
            System.out.println(result);
        } catch (SellerException e) {
            result=e.getMessage();
            System.out.println(result);
        }

    }
}
