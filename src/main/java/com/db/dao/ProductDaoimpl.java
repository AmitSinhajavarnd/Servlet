package com.db.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.exam.Dbutility.DBUtility;
import com.product.model.ProductModel;
public class ProductDaoimpl implements DaoInterface  {
	DBUtility db = new DBUtility();
	PreparedStatement ps;
	ResultSet rs;

	
	public int save(ProductModel pm) throws SQLException {
		String sql="insert into product_management(product_name,price,vendor,quantity,waranty) value (?,?,?,?,?)";
		ps = db.Create(sql);
		ps.setString(1, pm.getPname());
		ps.setInt(2, pm.getPrice());
		ps.setString(3, pm.getVendor());
		ps.setInt(4, pm.getQuantity());
		ps.setInt(5, pm.getWarranty());
		return db.update(ps);
	}
	
	public int update(ProductModel pm) throws SQLException{
		String sql="update product_management set product_name=?,price=?,vendor=?,quantity=?,waranty=? where product_id=?";
		ps = db.Create(sql);
		ps.setString(1, pm.getPname());
		ps.setInt(2, pm.getPrice());
		ps.setString(3, pm.getVendor());
		ps.setInt(4, pm.getQuantity());
		ps.setInt(5, pm.getWarranty());
		ps.setInt(6, pm.getId());
		return db.update(ps);
	}
	
	public int delete(ProductModel pm) throws SQLException {
		String sql = "delete from product_management where product_id=?";
		ps = db.Create(sql);
		ps.setInt(1, pm.getId());
		
		return db.update(ps);
	}
	
	public List<ProductModel> getall() throws SQLException {
		String sql = "select * from product_management";
		ps = db.Create(sql);
		rs = db.query(ps);
		List<ProductModel> products = new ArrayList();
		
		while(rs.next()) {
			ProductModel p = new ProductModel();
			p.setId(rs.getInt("product_id"));
			p.setPname(rs.getString("product_name"));
			p.setPrice(rs.getInt("price"));
			p.setVendor(rs.getString("vendor"));
			p.setQuantity(rs.getInt("quantity"));
			p.setWarranty(rs.getInt("waranty"));
			products.add(p);
			
		}
		
		return products;	
	}
	
	public ProductModel findById(int id) throws SQLException {

		String sql = "select * from product_management where product_id=?";
		ps = db.Create(sql);
		ps.setInt(1, id);
		rs = db.query(ps);
		
		ProductModel p = new ProductModel();
		if(rs.next()) {
		p.setId(rs.getInt("product_id"));
		p.setPname(rs.getString("product_name"));
		p.setPrice(rs.getInt("price"));
		p.setVendor(rs.getString("vendor"));
		p.setQuantity(rs.getInt("quantity"));
		p.setWarranty(rs.getInt("waranty"));
		
		}
		return  p;
		
	}

	@Override
	public List<ProductModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductModel> findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductModel> findByName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean insertEmployee(ProductModel pm) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateEmployee(ProductModel pm) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteEmployee(ProductModel pm) {
		// TODO Auto-generated method stub
		return false;
	}
}
