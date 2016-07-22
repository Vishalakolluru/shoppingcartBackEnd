package com.vishu.shoppinv3DAO;

import java.util.List;

import com.vishu.shoppingv3.Category;

public interface CategoryDAO {
		public List<Category> list();
		
		public Category get(String id);
		
		public  void saveOrUpdate(Category category);
		
		public void delete(String string);
		public List<Category> listCategory();

	}



