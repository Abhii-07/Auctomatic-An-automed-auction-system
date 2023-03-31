package com.auctomatic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.auctomatic.Ui.Color;
import com.auctomatic.dto.Buyer;
import com.auctomatic.dto.BuyerImpl;
import com.auctomatic.dto.Product;
import com.auctomatic.dto.SearchBuyerImpl;
import com.auctomatic.dto.Seller;
import com.auctomatic.dto.SellerImpl;
import com.auctomatic.exception.AdminException;
import com.auctomatic.exception.CredentialException;




public class AdminDaoImpl implements AdminDao{

	@Override
	public String AdminLogin(String username, String password) throws CredentialException {
		// TODO Auto-generated method stub
		String result="Invalid email/password";

		 if (username.equals("admin") && password.equals("admin")) {
			 System.out.println();
			 result= Color.BLUE_BACKGROUND_BRIGHT + " Welcome Admin -Login Successful " + Color.RESET;
		 }else{
			 throw new CredentialException(result);
		 }
		 return result;
	}

	@Override
	public List<Buyer> ViewBuyers() throws AdminException {
		// TODO Auto-generated method stub
		List<Buyer> list=new ArrayList<>();

        try(Connection conn=DBUtils.provideConnection()) {
            PreparedStatement ps=conn.prepareStatement("SELECT * FROM BUYER");
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Buyer buyerDTO=new BuyerImpl();
                buyerDTO.setBuyer_ID(rs.getInt("buyer_ID"));
                buyerDTO.setBuyer_name(rs.getString("buyer_name"));
                buyerDTO.setBuyer_email(rs.getString("buyer_email"));
                buyerDTO.setBuyer_mobile(rs.getString("buyer_mobile"));
                list.add(buyerDTO);
            }
            if(list.size()==0){
                throw new AdminException("No data in Buyers List");
            }
        }catch (SQLException e){
            e.printStackTrace();
            throw new AdminException(e.getMessage());
        }
        return list;
	}

	@Override
	public List<Seller> ViewSellers() throws AdminException {
		// TODO Auto-generated method stub
		List<Seller> list=new ArrayList<>();

        try(Connection conn=DBUtils.provideConnection()) {
            PreparedStatement ps=conn.prepareStatement("SELECT * FROM SELLER");
            ResultSet rs=ps.executeQuery();
            while (rs.next()){
                Seller sellerDTO=new SellerImpl();
                sellerDTO.setSeller_ID(rs.getInt("seller_ID"));
                sellerDTO.setSeller_name(rs.getString("seller_name"));
                sellerDTO.setSeller_email(rs.getString("seller_email"));
                sellerDTO.setSeller_mobile(rs.getString("seller_mobile"));
                list.add(sellerDTO);
            }
            if(list.size()==0){
                throw new AdminException("No data in Sellers List");
            }
        }catch (SQLException e){
            e.printStackTrace();
            throw new AdminException(e.getMessage());
        }
        return list;
	}

	@Override
	public List<SearchBuyerImpl> DailySellingReport(String date) throws AdminException {
		// TODO Auto-generated method stub
		List<SearchBuyerImpl> list=new ArrayList<>();

        try(Connection conn=DBUtils.provideConnection()) {

            PreparedStatement ps=conn.prepareStatement("SELECT \r\n"
            		+ "    DATE_FORMAT(purchase_date, '%Y-%m-%d') AS Date,\r\n"
            		+ "    COUNT(product_ID) AS Total_Sold,\r\n"
            		+ "    SUM(price) AS Total_Sales\r\n"
            		+ "FROM \r\n"
            		+ "    product\r\n"
            		+ "WHERE \r\n"
            		+ "    sold_status = 1\r\n"
            		+ "GROUP BY \r\n"
            		+ "    Date\r\n"
            		+ "ORDER BY \r\n"
            		+ "    Date DESC;\r\n"
            		+ "");

            ps.setString(1, String.valueOf(date));

            ResultSet rs=ps.executeQuery();
            while (rs.next()){
            	Buyer buyer =new BuyerImpl();
//            	buyer.setBuyerId(rs.getInt("buyerId"));
//            	buyer.setBuyerName(rs.getString("buyerName"));
//            	buyer.setEmail(rs.getString("email"));
//            	buyer.setCategoryName(rs.getString("categoryName"));
//            	buyer.setProductName(rs.getString("productName"));
//            	buyer.setSellerId(rs.getInt("sellerId"));
//            	buyer.setPrice(rs.getInt("price"));
                list.add((SearchBuyerImpl) buyer);
            }
            if(list.size()==0){
                throw new AdminException("No Item Sold on Date- "+date);
            }
        }catch (SQLException e){
            e.printStackTrace();
            throw new AdminException(e.getMessage());
        }
        return list;
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
