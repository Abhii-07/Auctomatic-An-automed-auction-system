package com.auctomatic.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.auctomatic.Ui.Color;
import com.auctomatic.dto.Buyer;
import com.auctomatic.dto.BuyerImpl;
import com.auctomatic.dto.Product;
import com.auctomatic.dto.Seller;
import com.auctomatic.dto.SellerImpl;
import com.auctomatic.dto.SoldItems;
import com.auctomatic.exception.BuyerException;
import com.auctomatic.exception.CredentialException;
import com.auctomatic.exception.NoRecordFoundException;
import com.auctomatic.exception.SellerException;



public class SellerDaoImpl implements SellerDao{

	@Override
	public Seller SellerLogin(String seller_username, String seller_password) throws NoRecordFoundException, CredentialException {
		// TODO Auto-generated method stub
		Seller seller = null;
		Connection conn = null;
		try {
			conn = DBUtils.provideConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM SELLER WHERE seller_username = ? AND seller_password = ?");
			ps.setString(1, seller_username);
			ps.setString(2, seller_password);
			//execute query
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				int sellerId = rs.getInt("seller_ID");
				String sellerName = rs.getString("seller_name");
				String sellerEmail = rs.getString("seller_email");
				String sellerUsername = rs.getString("seller_username");
				String sellerPassword =  rs.getString("seller_password");
				String sellerMobile =  rs.getString("seller_mobile");
				seller = new SellerImpl(sellerId,sellerName,sellerEmail,sellerUsername,sellerPassword,sellerMobile);
			}else {
				throw new CredentialException("Couldn't find the Buyer!");
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return seller;
	}

	@Override
	public String RegisterSeller(Seller seller) throws SellerException {
		// TODO Auto-generated method stub
		String result="Registration Filed....Try Agin";

        try(Connection conn=DBUtils.provideConnection()) {
            PreparedStatement ps=conn.prepareStatement("insert into SELLER (seller_name,seller_email,seller_username,seller_password,seller_mobile) values (?,?,?,?,?)");

            ps.setString(1, seller.getSeller_name());
            ps.setString(2, seller.getSeller_email());
            ps.setString(3, seller.getSeller_username());
            ps.setString(4, seller.getSeller_password());
            ps.setString(5, seller.getSeller_mobile());

           int row = ps.executeUpdate();
           if(row > 0){
               result = Color.MAGENTA_BACKGROUND_BRIGHT + "Seller Registered Successfully!";
           }else{
               throw new SellerException(result);
           }

        }catch (SQLException e){
            e.printStackTrace();
        }

        return result;
	}

	@Override
	public String CreateListofProductstoSell(List<Product> products) throws SellerException {
		// TODO Auto-generated method stub
		String result="Not Listed";

        try(Connection conn=DBUtils.provideConnection()){
            int count=0;
            
            for(int i=0;i<products.size();i++){
                String product_name = products.get(i).getProduct_name();
                String category = products.get(i).getCategory();
                int price = products.get(i).getPrice();
                int seller_ID = products.get(i).getSeller_ID();
                int sold_status = 0;
                String description = products.get(i).getDescription();
                
                PreparedStatement ps = null;
                try {
                	String sql = "INSERT INTO PRODUCT (product_name,category,price,seller_ID,sold_status,description) values(?,?,?,?,?,?)";
                    ps = conn.prepareStatement(sql);
                    ps.setString(1, product_name);
                    ps.setString(2, category);
                    ps.setInt(3, price);
                    ps.setInt(4, seller_ID);
                    ps.setInt(5, sold_status);
                    ps.setString(6, description);
                    
                    int x = ps.executeUpdate();
                    count++;
                } catch (SQLException e) {
                    System.out.println("Mismatch in data");
                }
            };
            if(count>0){
                result="Products Inserted in Auction List Successfully";
            }else{
                throw new SellerException(result);
            }
        }catch (SQLException e){
            e.printStackTrace();
            throw new SellerException(e.getMessage());
        }
        return result;
	}

	@Override
	public String UpdateProductDetailsByPrice(int productId, int price) throws SellerException {
		// TODO Auto-generated method stub
		String result;

        try(Connection conn = DBUtils.provideConnection()) {
            PreparedStatement ps=conn.prepareStatement("UPDATE PRODUCT SET PRICE = ? where product_ID = ?");

            ps.setInt(1,price );
            ps.setInt(2,productId);

            int row= ps.executeUpdate();
            if(row > 0){
                result="Updated Price Successfully";
            }else{
                throw new SellerException("No Product found with productId- "+ productId );
            }


        }catch (SQLException e){
            e.printStackTrace();
            throw new SellerException(e.getMessage());
        }

        return result;
	}

	@Override
	public String DeleteProductItems(int product_ID) throws SellerException {
		// TODO Auto-generated method stub
		String result;

        try(Connection conn=DBUtils.provideConnection()) {
        	String sql = "DELETE FROM PRODUCT WHERE product_ID = ?";
            PreparedStatement ps=conn.prepareStatement(sql);

            ps.setInt(1, product_ID);

            int x= ps.executeUpdate();
            if(x>0){
                result= Color.RED_BACKGROUND_BRIGHT + "Deleted Successfully" + Color.RESET;
            }else{
                throw new SellerException("No Product found with productId- " + product_ID );
            }


        }catch (SQLException e){
            e.printStackTrace();
            throw new SellerException(e.getMessage());
        }

        return result;
	}

//	@Override
//	public List<SoldItems> SoldItemReport(int sellerId) throws SellerException {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
