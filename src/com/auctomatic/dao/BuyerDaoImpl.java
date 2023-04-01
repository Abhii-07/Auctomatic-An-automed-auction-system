package com.auctomatic.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.auctomatic.Ui.Color;
import com.auctomatic.dto.Buyer;
import com.auctomatic.dto.BuyerImpl;
import com.auctomatic.dto.SearchBuyer;
import com.auctomatic.dto.SoldItems;
import com.auctomatic.dto.SoldItemsImpl;
import com.auctomatic.exception.BuyerException;
import com.auctomatic.exception.CredentialException;
import com.auctomatic.exception.NoRecordFoundException;
import com.auctomatic.exception.SellerException;


public class BuyerDaoImpl implements BuyerDao{

	@Override
	public Buyer BuyerLogin(String buyer_username, String buyer_password) throws  NoRecordFoundException, CredentialException {
		// TODO Auto-generated method stub
		Buyer buyer = null;
		Connection conn = null;
		try {
			conn = DBUtils.provideConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM BUYER WHERE buyer_username = ? AND buyer_password = ?");
			ps.setString(1, buyer_username);
			ps.setString(2, buyer_password);
			//execute query
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int buyerId = rs.getInt("buyer_ID");
				String buyerName = rs.getString("buyer_name");
				String buyerEmail = rs.getString("buyer_email");
				String buyerUsername = rs.getString("buyer_username");
				String buyerPassword =  rs.getString("buyer_password");
				String buyerMobile =  rs.getString("buyer_mobile");
				buyer = new BuyerImpl(buyerId,buyerName,buyerEmail,buyerUsername,buyerPassword,buyerMobile);
			}else {
				throw new CredentialException("Couldn't find the Buyer!");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return buyer;
	}
	@Override
	public String RegisterBuyer(Buyer buyer) throws BuyerException {
		// TODO Auto-generated method stub
		String result="Registration Filed....Try Agin";

        try(Connection conn=DBUtils.provideConnection()) {
            PreparedStatement ps=conn.prepareStatement("insert into buyer (buyer_name,buyer_email,buyer_username,buyer_password,buyer_mobile) values (?,?,?,?,?)");

            ps.setString(1, buyer.getBuyer_name());
            ps.setString(2, buyer.getBuyer_email());
            ps.setString(3, buyer.getBuyer_username());
            ps.setString(4, buyer.getBuyer_password());
            ps.setString(5, buyer.getBuyer_mobile());

           int x= ps.executeUpdate();
           if(x>0){
               result="Registered Successfully";
           }else{
               throw new BuyerException(result);
           }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return result;
	}
	
	@Override
	public String changePassword(String buyer_username,String buyer_password) throws SellerException {
	    // TODO Auto-generated method stub
	    String result;

	    try (Connection conn = DBUtils.provideConnection()) {
	        PreparedStatement ps = conn.prepareStatement("UPDATE BUYER SET buyer_password = ? where buyer_username = ?");

	        ps.setString(1, buyer_password);
	        ps.setString(2, buyer_username);

	        int row = ps.executeUpdate();
	        if (row > 0) {
	            result = Color.GREEN_BOLD_BRIGHT + "Password Changed Successfully" + Color.RESET;
	        } else {
	            throw new SellerException(Color.RED_BRIGHT +"No Buyer found with username- " + buyer_username + Color.RESET);
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        throw new SellerException(e.getMessage());
	    } catch (NullPointerException e) {
	        e.printStackTrace();
	        throw new SellerException("Error: Null value passed as parameter.");
	    }

	    return result;
	}
	
	@Override
	public List<SoldItems> viewAllItemsForSale(String category) throws BuyerException {
		// TODO Auto-generated method stub
		try(Connection conn = DBUtils.provideConnection())  {
	        PreparedStatement ps = conn.prepareStatement("SELECT * FROM PRODUCT WHERE category = ? AND sold_status = 0");
	        ps.setString(1, category);
	        ResultSet rs = ps.executeQuery();

	        List<SoldItems> itemsList = new ArrayList<>();
	        while (rs.next()) {
	            SoldItems item = new SoldItemsImpl();
	            item.setProductId(rs.getInt("product_ID"));
	            item.setProductName(rs.getString("product_name"));
	            item.setPrice(rs.getDouble("price"));
	            item.setCategoryName(rs.getString("category"));
	            itemsList.add(item);
	        }

	        return itemsList;
	    } catch (SQLException e) {
	        throw new BuyerException("Error retrieving items for sale");
	    }
	}

	@Override
	public String BuyItem(int buyer_ID, LocalDate purchase_date, String product_name) throws BuyerException {
		// TODO Auto-generated method stub
		String result = null;

        try(Connection conn=DBUtils.provideConnection()) {
            PreparedStatement ps=conn.prepareStatement("UPDATE PRODUCT SET sold_status = 1 ,buyer_ID = ? , purchase_date = ? where product_name=?");

            ps.setInt(1, buyer_ID);
            ps.setDate(2, Date.valueOf(purchase_date));
            ps.setString(3, product_name);


            int x= ps.executeUpdate();
            if(x > 0){
                result="Item Bought Successfully - Will be delivered in 3 - 4 Bussiness days!";
            }else{
                throw new BuyerException("No Product found with productName- "+ product_name );
            }


        }catch (SQLException e){
            e.printStackTrace();
        }

        return result;
	}
	

	@Override
	public List<SearchBuyer> ViewAllBuyersDetails(String categoryName) throws BuyerException {
		// TODO Auto-generated method stub
		return null;
	}

}
