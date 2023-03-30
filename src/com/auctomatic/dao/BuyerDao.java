package com.auctomatic.dao;

import java.time.LocalDate;
import java.util.List;

import com.auctomatic.dto.Buyer;
import com.auctomatic.dto.SearchBuyer;
import com.auctomatic.dto.SoldItems;
import com.auctomatic.exception.BuyerException;
import com.auctomatic.exception.CredentialException;
import com.auctomatic.exception.NoRecordFoundException;


public interface BuyerDao {
	public Buyer BuyerLogin(String buyer_email, String buyer_password) throws NoRecordFoundException, CredentialException;

    public String RegisterBuyer(Buyer buyer) throws BuyerException;
    
    public String BuyItem(int buyerId, LocalDate date,String productName) throws BuyerException;
    
    public List<SoldItems> searchItemByCategory(String categoryName) throws BuyerException;
    
    public List<SearchBuyer> ViewAllBuyersDetails(String categoryName) throws BuyerException;
}
