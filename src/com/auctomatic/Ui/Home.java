package com.auctomatic.Ui;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import com.auctomatic.exception.CredentialException;
import com.auctomatic.exception.NoRecordFoundException;
import com.auctomatic.exception.SomeThingWrongException;

public class Home {
	public static void appOpening() throws CredentialException, SQLException, NoRecordFoundException, SomeThingWrongException {
		try {
			
			Scanner sc = new Scanner(System.in);
			System.out.print(Color.CYAN_BOLD_BRIGHT);
			System.out.println("+-------------------------------------------+\r\n"
					+ "|  Welcome to Auctomatic - The Auction App  | \r\n"
					+ "+-------------------------------------------+");
			System.out.print(Color.RESET);
		
		
			System.out.println(Color.BLUE_BOLD_BRIGHT+"Choose User Type : " + Color.RESET);
			System.out.println("Press 1 to" +Color.RED_BOLD_BRIGHT + " Admin "+ Color.RESET);
			System.out.println("Press 2 to" +Color.RED_BOLD_BRIGHT + " User " + Color.RESET);
			System.out.println("Press 0 to" +Color.RED_BOLD_BRIGHT + " Exit " + Color.RESET);
			String role_choice = sc.nextLine();
			
			if(role_choice.equals("1")){
	            AdminMain adminMain=new AdminMain();
	            Boolean resulta=AdminMain.AdminLogin();
	
	            int countadminLogin =1;
	
	            while(!resulta) {
	                countadminLogin++;
	                System.out.println((4-countadminLogin) +" Attempts remaining");
	                resulta = adminMain.AdminLogin();
	
	                if(countadminLogin ==3 && resulta ==false) {
	                    System.out.println("Maximum Limit Crossed : Try Again Later");
	                    break;
	
	                }
	            }
	            if(resulta) {
	
	                while(true) {
	
	                    adminMain.AdminOptions();
	
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
	        }else if(role_choice.equals("2")){
	        	System.out.println();
	        	System.out.println(Color.RED_BOLD_BRIGHT + "Choose the operation: " + Color.RESET);
	        	System.out.println();
	        	System.out.println("Press 1 to" +Color.RED_BOLD_BRIGHT + " Register as Buyer." + Color.RESET);
	            System.out.println("Press 2 to" +Color.RED_BOLD_BRIGHT + " Login as Buyer."+ Color.RESET);
	            System.out.println("Press 3 to" +Color.RED_BOLD_BRIGHT + " Register as Seller." + Color.RESET);
	            System.out.println("Press 4 to" +Color.RED_BOLD_BRIGHT + " Login as Seller."+ Color.RESET);
	            System.out.println("Press 0 to" +Color.RED_BOLD_BRIGHT + " Exit " + Color.RESET);
	            String choice = sc.nextLine();
	            
	            if(choice.equals("1")) {
		            BuyerMain buyerMain = new BuyerMain();
		            buyerMain.BuyerRegistration();
		            appOpening();
		            System.out.println();
		            System.out.println("-----------------------------------------------------------------------------------------------------");
	            }
	            else if(choice.equals("2")) {
	            	BuyerMain buyerMain=new BuyerMain();
		            Boolean resultb = buyerMain.BuyerLogin();
		
		            int countbuyerLogin = 1;
		
		            while(!resultb) {
		                countbuyerLogin++;
		                System.out.println( +(4-countbuyerLogin) + " Attempts remaining");
		                resultb = buyerMain.BuyerLogin();
		
		                if(countbuyerLogin ==3 && resultb ==false) {
		                    System.out.println( Color.RED_BRIGHT+"Maximum Limit Crossed : Try Again Later"+ Color.RESET);
		                    break;
		
		                }
		            }
		            if(resultb) {
		
		                while(true) {
		
		                    buyerMain.BuyerHomeWindow();
		
		                    String choiceAdmin = sc.nextLine();
		
		                    if(choiceAdmin.equals("1")) {
		                    	buyerMain.ChangePassword();
		                    }else if(choiceAdmin.equals("2")) {
		                    	buyerMain.ChangePassword();
		                    }else if (choiceAdmin.equals("3")) {
		                    	buyerMain.ViewAllItemsForSale();
		                    }else if (choiceAdmin.equals("4")) {
		                    	buyerMain.BuyItem();
		                    }else if (choiceAdmin.equals("5")) {
		                        System.out.println( Color.BLUE + "LOGOUT SUCCESSFUL!" + Color.RESET);
		                        break;
		                    }else if(choiceAdmin.equals("6")){
		                    	buyerMain.ChangePassword();
		                        System.out.println( Color.RED + "Deleted SUCCESSFUL!" + Color.RESET);
		                        break;
		                    }else {
		                        System.out.println("CHOOSE CORRECT INPUT RANGE FROM 1 TO 7" );
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
	            }
				else if(choice.equals("3")) {
					SellerMain sellerMain=new SellerMain();
		            sellerMain.SellerRegistration();
		            System.out.println("-----------------------------------------------------------------------------------------------------");
		            appOpening();
				}
				else if(choice.equals("4")) {
					SellerMain sellerMain=new SellerMain();
		            Boolean results=sellerMain.SellerLogin();
		
		            int countsellerLogin =1;
		
		            while(!results) {
		                countsellerLogin++;
		                System.out.println((4-countsellerLogin) +" Attempts remaining");
		                results = sellerMain.SellerLogin();
		
		                if(countsellerLogin ==3 && results ==false) {
		                    System.out.println("Maximum Limit Crossed : Try Again Later");
		                    break;
		
		                }
		            }
		            if(results) {
		
		                while(true) {
		                	System.out.println();
		                    sellerMain.SellerHomeWindow();
		
		                    String choiceAdmin = sc.nextLine();
		
		                    if(choiceAdmin.equals("1")) {
		                        sellerMain.AddItems();
		                    }else if(choiceAdmin.equals("2")) {
		                        sellerMain.updateItem();
		                    }else if (choiceAdmin.equals("3")) {
		                        sellerMain.deleteItem();
		                    }else if (choiceAdmin.equals("4")) {
		                        sellerMain.soldItemsReport();
		                    }else if (choiceAdmin.equals("5")) {
		                        sellerMain.returnedItemsReport();
		                    }else if (choiceAdmin.equals("6")) {
		                        System.out.println( Color.BLUE + "LOGOUT SUCCESSFUL!" + Color.RESET);
		                        break;
		                    }else if(choiceAdmin.equals("7")){
		                    	sellerMain.sellerDelete();
		                        System.out.println( Color.BLUE + "Deleted SUCCESSFUL!" + Color.RESET);
		                        break;
		                    }else {
		                        System.out.println("CHOOSE CORRECT INPUT RANGE FROM 1 TO 7" );
		                    }
		                }
		                System.out.println();
		                System.out.println("-----------------------------------------------------------------------------------------------------");
		                appOpening();
		
		            }else {
		                System.out.println();
		                System.out.println("-----------------------------------------------------------------------------------------------------");
		                appOpening();
		            }
				}
	            
	            
	
	        }else if(role_choice.equals("0")) {
	            System.out.println( "APPLICATION CLOSED : EXITED");
	            System.exit(0);
	
	        }else {
	            System.out.println("CHOOSE CORRECT INPUT RANGE FROM 1 TO 2");
	            appOpening();
	        }
	
	
	
	    }catch (InputMismatchException e){
	        System.out.println( e.getMessage() );
	    }catch (NoSuchElementException e) {
	        System.out.println(e.getMessage());
	    }
	            
            
    }
	public static void main(String[] args) throws CredentialException, SQLException, NoRecordFoundException, SomeThingWrongException {
		// TODO Auto-generated method stub
		appOpening();
	}

}
