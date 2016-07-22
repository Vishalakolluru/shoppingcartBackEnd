package com.vishu.shoppinv3DAO;

import java.util.List;

import com.vishu.shoppingv3.Product;

public interface ProductDAO {
		public List<Product> list();
		
		public Product get(String id);
		
		public  void saveOrUpdate(Product product);
		
		public void delete(String string);
		public List<Product> listProduct();

	}



