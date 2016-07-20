package com.vishu.shoppingv1.DAO;

import java.util.List;

import com.vishu.shoppingv1.model.Category;



public interface CategoryDAO {

	public List<Category> list();
	public Category get(String id);
	public void saveOrUpdate(Category category);
	public void delete(String id);
	public List<Category> listCategory();
	

}
