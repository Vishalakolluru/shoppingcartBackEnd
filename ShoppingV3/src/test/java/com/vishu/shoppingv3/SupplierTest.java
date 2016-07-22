package com.vishu.shoppingv3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.vishu.shoppinv3DAO.SupplierDAO;

public class SupplierTest {
	public static void main(String[]args){
		@SuppressWarnings("resource")
		AnnotationConfigApplicationContext context=  new  AnnotationConfigApplicationContext();
		context.scan("com.vishu");
		context.refresh();
		Supplier supplier =  (Supplier) context.getBean("supplier");
		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
		supplier.setId("1");
		supplier.setName("sravan");
		supplier.setAddress("happy");
		supplierDAO.saveOrUpdate(supplier);
	}

}
