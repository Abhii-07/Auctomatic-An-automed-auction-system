package com.auctomatic.dao;

import java.util.List;

import com.auctomatic.dto.Buyer;
import com.auctomatic.dto.Product;
import com.auctomatic.dto.SearchBuyerImpl;
import com.auctomatic.dto.Seller;
import com.auctomatic.exception.AdminException;
import com.auctomatic.exception.CredentialException;

public interface AdminDao {

	String AdminLogin(String username, String password) throws CredentialException;
	
	public List<Buyer> ViewBuyers() throws AdminException;

    public List<Seller> ViewSellers() throws AdminException;

    public List<SearchBuyerImpl> DailySellingReport(String date) throws AdminException;

    public List<Product> DailyDisputeReport(String date) throws AdminException;

    public String SolveDispute(int categoryId,int productId) throws AdminException;
}
	

