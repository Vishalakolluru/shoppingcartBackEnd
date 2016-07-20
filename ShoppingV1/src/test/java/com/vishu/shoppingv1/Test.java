package com.vishu.shoppingv1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vishu.shoppingv1.DAO.CategoryDAO;
import com.vishu.shoppingv1.model.Category;
public class Test {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("com.vishu.shoppingv1");
		context.refresh();
		Category category = (Category) context.getBean("category");
		CategoryDAO categoryDAO=(CategoryDAO)context.getBean("categoryDAO");
		
		category.setId("1");
		category.setName("Vishu");
		category.setDescription("always first ");
		categoryDAO.saveOrUpdate(category);
		
		
		if(categoryDAO.get("cat-004")!=null)
		{
			System.out.println("Category Exist");
		}
		else{
			System.out.println("Category doesnt exist");
		}
		
		//categoryDAO.delete("cat-003");
		
		System.out.println(categoryDAO.listCategory());
		
	}
}
