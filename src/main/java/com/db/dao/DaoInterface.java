package com.db.dao;

import java.util.List;

import com.product.model.ProductModel;

public interface DaoInterface {
	List<ProductModel> findAll();
    List<ProductModel> findById();
    List<ProductModel> findByName();
    boolean insertEmployee(ProductModel pm);
    boolean updateEmployee(ProductModel pm);
    boolean deleteEmployee(ProductModel pm);

}
