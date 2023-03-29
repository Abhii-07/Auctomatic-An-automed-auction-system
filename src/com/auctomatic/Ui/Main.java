package com.auctomatic.Ui;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.auctomatic.exception.SomethingWentWrong;


public class Main {
	public static void appOpening() throws SomethingWentWrong{
        try{
            Scanner sc = new Scanner(System.in);
            System.out.print(Color.CYAN_BOLD_BRIGHT);
    		System.out.println("+-------------------------------------------+\r\n"
    				+ "|  Welcome to Auctomatic - The Auction App  | \r\n"
    				+ "+-------------------------------------------+");
    		System.out.print(Color.RESET);
    		
    		
            System.out.println(Color.BLUE_BOLD_BRIGHT+"Choose User Type : " + Color.RESET);
            System.out.println("Press 1 to" +Color.RED_BOLD_BRIGHT + " Admin "+ Color.RESET);
            System.out.println("Press 2 to" +Color.RED_BOLD_BRIGHT + " User "+ Color.RESET);
            
   
            String choice = sc.nextLine();

            if(choice.equals("1")){
                AdminMain adminMain = new AdminMain();
                Boolean resulta = AdminMain.AdminLogin();

                int countAdminLogin = 1;

                while(!resulta) {
                	countAdminLogin++;
                    System.out.println((4-countAdminLogin) + " Attempts remaining");
                    resulta = adminMain.AdminLogin();

                    if(countAdminLogin ==3 && resulta ==false) {
                        System.out.println("Maximum Limit Crossed : Try Again Later");
                        break;

                    }
                }
                if(resulta) {

                    while(true) {

                        adminMain.AdminHomeWindow();

                        String choiceAdmin = sc.nextLine();

                        if(choiceAdmin.equals("1")) {
                            adminMain.viewBuyers();
                        }else if(choiceAdmin.equals("2")) {
                            adminMain.viewSellers();
                        }else if (choiceAdmin.equals("3")) {
                            adminMain.dailySellingReport();
                        }else if(choiceAdmin.equals("4")){
                            adminMain.dailyDisputeReport();
                        }else if(choiceAdmin.equals("5")){
                            adminMain.solveDispute();
                        }else if(choiceAdmin.equals("6")){
                            System.out.println("LOGOUT SUCCESSFUL !");
                            break;
                        }else {
                            System.out.println("CHOOSE CORRECT INPUT RANGE FROM 1 TO 6");
                        }
                    }
                    appOpening();
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------------------------------");

                }else {
                    appOpening();
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------------------------------");
                }
            } else if(choice.equals("2")){
                UserMain userMain = new UserMain();
                Boolean resultu = UserMain.userLogin();

                int countUserLogin = 1;

                while(!resultu) {
                    countUserLogin++;
                    System.out.println((4-countUserLogin) + " Attempts remaining");
                    resultu = userMain.userLogin();

                    if(countUserLogin == 3 && resultu == false) {
                        System.out.println("Maximum Limit Crossed : Try Again Later");
                        break;
                    }
                }

                if(resultu) {
                    while(true) {

                        userMain.userHomeWindow();

                        String choiceUser = sc.nextLine();

                        if(choiceUser.equals("1")) {
                            userMain.viewAuctions();
                        }else if(choiceUser.equals("2")) {
                            userMain.bidAuction();
                        }else if(choiceUser.equals("3")) {
                            userMain.viewWonAuctions();
                        }else if(choiceUser.equals("4")) {
                            userMain.viewLostAuctions();
                        }else if(choiceUser.equals("5")) {
                            userMain.addAuction();
                        }else if(choiceUser.equals("6")) {
                            System.out.println("LOGOUT SUCCESSFUL !");
                            break;
                        }else {
                            System.out.println("CHOOSE CORRECT INPUT RANGE FROM 1 TO 6");
                        }
                    }
                    appOpening();
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------------------------------");
                } else {
                    appOpening();
                    System.out.println();
                    System.out.println("-----------------------------------------------------------------------------------------------------");
                }
            }

        }catch (SomethingWentWrong e){
            System.out.println( e.getMessage() );
        }
    }
	public static void main(String[] args) throws SomethingWentWrong {
		// TODO Auto-generated method stub
		appOpening();
	}

}
