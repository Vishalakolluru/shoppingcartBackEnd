package com.vishu.shoppingv3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vishu.shoppinv3DAO.ProductDAO;

public class ProductTest {
	public static void main(String[]args){
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context=  new  AnnotationConfigApplicationContext();
		context.scan("com.vishu");
		context.refresh();
		Product product =  (Product) context.getBean("product");
		ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
		product.setId("1");
		product.setName("sravan");
		product.setDescription("happy");
		product.setPrice(15000);
		productDAO.saveOrUpdate(product);
	}

}
