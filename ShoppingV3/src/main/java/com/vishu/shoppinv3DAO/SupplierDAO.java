package com.vishu.shoppinv3DAO;

import java.util.List;

import com.vishu.shoppingv3.Supplier;

public interface SupplierDAO {
		public List<Supplier> list();
		
		public Supplier get(String id);
		
		public  void saveOrUpdate(Supplier supplier);
		
		public void delete(String string);
		public List<Supplier> listSupplier();

	}



