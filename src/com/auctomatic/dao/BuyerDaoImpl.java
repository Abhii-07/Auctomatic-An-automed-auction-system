package com.auctomatic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import com.auctomatic.dto.Buyer;
import com.auctomatic.dto.SearchBuyer;
import com.auctomatic.dto.SoldItems;
import com.auctomatic.exception.BuyerException;
import com.auctomatic.exception.CredentialException;
import com.auctomatic.exception.NoRecordFoundException;
import com.auctomatic.exception.SomeThingWrongException;

public class BuyerDaoImpl implements BuyerDao{

	@Override
	public Buyer BuyerLogin(String buyer_username, String buyer_password) throws  NoRecordFoundException, SomeThingWrongException {
		// TODO Auto-generated method stub
		Buyer buyer = null;
		Connection conn = null;
		try {
			conn = DBUtils.provideConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM BUYER WEHER buyer_username = ? AND buyer_password = ?");
			ps.setString(1, buyer_username);
			ps.setString(2, buyer_password);
			//execute query
			ResultSet resultSet = ps.executeQuery();
			if(DBUtils.isResultSetEmpty(resultSet)) {
				throw new NoRecordFoundException("Invalid Username and Password");
			}
			
			//you are here means username and password combination is correct
			resultSet.next();
			LoggedINUser.loggedInUserId = resultSet.getInt("buyer_id");
		}catch(SQLException sqlEx) {
			//code to log the error in the file
			throw new SomeThingWrongException();
		}finally {
			try {
				//close the exception
				DBUtils.closeConnection(conn);				
			}catch(SQLException sqlEX) {
				throw new SomeThingWrongException();
			}
		}
		return buyer;
	}
	@Override
	public String RegisterBuyer(Buyer buyer) throws BuyerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String BuyItem(int buyerId, LocalDate date, String productName) throws BuyerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SoldItems> searchItemByCategory(String categoryName) throws BuyerException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<SearchBuyer> ViewAllBuyersDetails(String categoryName) throws BuyerException {
		// TODO Auto-generated method stub
		return null;
	}

}
