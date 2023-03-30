package com.auctomatic.dao;

import java.util.List;

import com.auctomatic.dto.Product;
import com.auctomatic.dto.Seller;
import com.auctomatic.dto.SoldItems;
import com.auctomatic.exception.CredentialException;
import com.auctomatic.exception.NoRecordFoundException;
import com.auctomatic.exception.SellerException;


public interface SellerDao {
	
	public Seller SellerLogin(String email, String password) throws  NoRecordFoundException, CredentialException;
	

	 public String RegisterSeller(Seller seller) throws SellerException;

	 public String CreateListofProductstoSell(List<Product> products) throws SellerException;
	 
	 public String UpdateProductDetailsByPrice(int productId, int price) throws SellerException;

	 public String DeleteProductItems(int productId) throws SellerException;

	 public List<SoldItems> SoldItemHistory(int sellerId) throws SellerException;
	
}
