package com.vishu.shoppingv3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vishu.shoppinv3DAO.CategoryDAO;

public class CategoryTest {
	public static void main(String[]args){
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context=  new  AnnotationConfigApplicationContext();
		context.scan("com.vishu");
		context.refresh();
		Category category =  (Category) context.getBean("category");
		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		category.setId("1");
		category.setName("sravan");
		category.setDescription("happy");
		categoryDAO.saveOrUpdate(category);
	}

}
