package com.vishu.shoppingv1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.vishu.shoppingv1.DAO.SupplierDAO;
import com.vishu.shoppingv1.model.Supplier;

public class SupplierTest {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
		context.scan("com.vishu.shoppingv1");
		context.refresh();
		SupplierDAO supplierDAO=(SupplierDAO)context.getBean("supplierDAO");
		Supplier supplier=(Supplier)context.getBean("supplier");
		supplier.setId("2");
		supplier.setName("Vishu");
		supplier.setAddress("always first ");
		supplierDAO.saveOrUpdate(supplier);
		
		
	}
}
