package com.vishu.shoppinv3DAO;

import java.util.List;

import com.vishu.shoppingv3.User;

public interface UserDAO {
		public List<User> list();
		
		public User get(String id);
		
		public  void saveOrUpdate(User user);
		
		public void delete(String string);
		public List<User> listUser();

	}



