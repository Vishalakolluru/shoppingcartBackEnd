package com.vishu.shoppinv3DAO;

import java.util.List;

import org.hibernate.Criteria;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vishu.shoppingv3.Product;

@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO  {

	public List<Product> list() {
		
		
		return null;
	}
	@Autowired

	private SessionFactory sessionFactory;

	public ProductDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	
	}
@Transactional
	public Product get(String id) {
		// TODO Auto-generated method stub
		// sessionFactory.getCurrentSession().get(Product.class,id);
				String hql = "from Product where productId=" + "'" + id + "'";
				Query query = sessionFactory.getCurrentSession().createQuery(hql);
				@SuppressWarnings("unchecked")
				List<Product> listProduct = query.list();
				if (listProduct != null && !listProduct.isEmpty()) {
					return listProduct.get(0);
				}
				return null;
	}
	
@Transactional
	public void saveOrUpdate(Product product) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().saveOrUpdate(product);

		
	}
@Transactional
	public void delete(String Id) {
		// TODO Auto-generated method stub
		Product ProductToDelete = new Product();
		ProductToDelete.setId(Id);
		sessionFactory.getCurrentSession().delete(ProductToDelete);
		
	}
@Transactional
	public List<Product> listProduct() {
		// TODO Auto-generated method stub
		@SuppressWarnings("unchecked")
		List<Product> listProduct = sessionFactory.getCurrentSession().createCriteria(Product.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listProduct;
		
	}
	
		
}
