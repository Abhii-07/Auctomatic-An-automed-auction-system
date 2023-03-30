package com.auctomatic.usecase;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.auctomatic.Ui.Color;
import com.auctomatic.dao.SellerDao;
import com.auctomatic.dao.SellerDaoImpl;
import com.auctomatic.dto.Product;
import com.auctomatic.dto.ProductImpl;

public class AddItemsCase {
	public static void main(String[] args) {
		AddItems();
    }
    public static void AddItems(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("_ _ _ _ _ _ Enter the number of products you want to insert in auction list _ _ _ _ _ _ ");
            int N = sc.nextInt();
            List<Product> list = new ArrayList<>();

            for (int i = 0; i < N; i++) {
                System.out.println("Product ID-" + (i + 100));
                
                Product product = new ProductImpl();
                
                System.out.println("Enter Product Name: ");
                String name = sc.next();
                product.setProduct_name(name);
                
                System.out.println("Select Category From: " + Color.CYAN + " Clothing | Electronics | Grocery | Miscellaneous "+ Color.RESET );
                String category = sc.next();
                product.setCategory(category);
                
                System.out.println("Enter Product Description: ");
                String productDescription = sc.next();
                product.setDescription(productDescription);
                
                System.out.println("Enter Price-");
                int price = sc.nextInt();
                product.setPrice(price);
                
                System.out.println("Enter Your Seller ID: ");
                int seller_id = sc.nextInt();
                product.setSeller_ID(seller_id);
                
                
                product.setStatus(0);
                list.add(product);
                System.out.println("---------------------------------------------------------------------------------");
            }

            SellerDao sellerDao = new SellerDaoImpl();
            String result;
            try {
                result = sellerDao.CreateListofProductstoSell(list);
                System.out.println(result);
            } catch (Exception e) {
                result = e.getMessage();
                System.out.println(result);
            }
        }catch (InputMismatchException i){
            System.out.println("Exception : Invalid Input Data Type");
        }


    }
}
