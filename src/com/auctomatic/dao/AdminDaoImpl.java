package com.auctomatic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.auctomatic.Ui.Color;
import com.auctomatic.dto.Buyer;
import com.auctomatic.dto.BuyerImpl;
import com.auctomatic.dto.Product;
import com.auctomatic.dto.SearchBuyer;
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

            PreparedStatement ps=conn.prepareStatement("SELECT b.buyer_Id, b.buyer_name, b.buyer_email, p.product_name, c.category_name, s.seller_ID, p.price FROM product p INNER JOIN category c ON p.category = c.category_name INNER JOIN seller s ON p.seller_ID = s.seller_ID INNER JOIN buyer b ON p.buyer_Id = b.buyer_Id WHERE p.purchase_date = ?");

            ps.setString(1, String.valueOf(date));

            ResultSet rs=ps.executeQuery();
            while (rs.next()){
            	SearchBuyer searchBuyerDTO=new SearchBuyerImpl();
                searchBuyerDTO.setBuyer_ID(rs.getInt("buyer_ID"));
                searchBuyerDTO.setBuyer_name(rs.getString("buyer_name"));
                searchBuyerDTO.setBuyer_email(rs.getString("buyer_email"));
                searchBuyerDTO.setCategory_name(rs.getString("category_name"));
                searchBuyerDTO.setProduct_name(rs.getString("product_name"));
                searchBuyerDTO.setSeller_ID(rs.getInt("seller_ID"));
                searchBuyerDTO.setPrice(rs.getInt("price"));
                list.add((SearchBuyerImpl) searchBuyerDTO);
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
	public List<SearchBuyerImpl> viewSalesReportLastSevenDays() throws SQLException {
        List<SearchBuyerImpl> sales = new ArrayList<>();
        Calendar calendar = Calendar.getInstance();
        java.sql.Date endDate = new java.sql.Date(calendar.getTime().getTime());
        calendar.add(Calendar.DAY_OF_YEAR, -7);
        java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

        try (Connection conn = DBUtils.provideConnection()) {
            String sql = "SELECT b.buyer_Id, b.buyer_name, b.buyer_email, p.product_name, c.category_name, s.seller_ID, p.price FROM product p INNER JOIN category c ON p.category = c.category_name INNER JOIN seller s ON p.seller_ID = s.seller_ID INNER JOIN buyer b ON p.buyer_Id = b.buyer_Id WHERE p.purchase_date BETWEEN ? AND ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setDate(1, startDate);
            ps.setDate(2, endDate);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                SearchBuyerImpl sale = new SearchBuyerImpl();
                sale.setBuyer_ID(rs.getInt("buyer_ID"));
                sale.setBuyer_name(rs.getString("buyer_name"));
                sale.setBuyer_email(rs.getString("buyer_email"));
                sale.setCategory_name(rs.getString("category_name"));
                sale.setProduct_name(rs.getString("product_name"));
                sale.setSeller_ID(rs.getInt("seller_ID"));
                sale.setPrice(rs.getInt("price"));
                sales.add(sale);
            }
        }

        return sales;
    }

}
