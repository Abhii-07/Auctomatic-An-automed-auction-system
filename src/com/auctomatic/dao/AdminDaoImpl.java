package com.auctomatic.dao;

import java.util.List;

import com.auctomatic.dto.Buyer;
import com.auctomatic.dto.Product;
import com.auctomatic.dto.SearchBuyerImpl;
import com.auctomatic.dto.Seller;
import com.auctomatic.exception.AdminException;
import com.auctomatic.exception.CredentialException;

public class AdminDaoImpl implements AdminDao{

	@Override
	public String AdminLogin(String username, String password) throws CredentialException {
		// TODO Auto-generated method stub
		String result="Invalid email/password";

		 if (username.equals("admin") && password.equals("admin")) {
			 result="Welcome Admin -Login Successful";
		 }else{
			 throw new CredentialException(result);
		 }
		 return result;
	}

	@Override
	public List<Buyer> ViewBuyers() throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Seller> ViewSellers() throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SearchBuyerImpl> DailySellingReport(String date) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> DailyDisputeReport(String date) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String SolveDispute(int categoryId, int productId) throws AdminException {
		// TODO Auto-generated method stub
		return null;
	}

}
