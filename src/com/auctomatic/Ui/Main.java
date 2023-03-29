package com.auctomatic.Ui;

import java.util.Scanner;



public class Main {
	public static void appOpening() {
            Scanner sc = new Scanner(System.in);
            System.out.print(Color.CYAN_BOLD_BRIGHT);
    		System.out.println("+-------------------------------------------+\r\n"
    				+ "|  Welcome to Auctomatic - The Auction App  | \r\n"
    				+ "+-------------------------------------------+");
    		System.out.print(Color.RESET);
    		
    		
            System.out.println(Color.BLUE_BOLD_BRIGHT+"Choose User Type : " + Color.RESET);
            System.out.println("Press 1 to" +Color.RED_BOLD_BRIGHT + " Admin "+ Color.RESET);
            System.out.println("Press 2 to" +Color.RED_BOLD_BRIGHT + " User "+ Color.RESET);
            
   
            
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		appOpening();
	}

}
