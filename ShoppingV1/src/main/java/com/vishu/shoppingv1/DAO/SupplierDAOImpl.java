package com.vishu.shoppingv1.DAO;

import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vishu.shoppingv1.model.Supplier;

@Repository("supplierDAO")
	public class SupplierDAOImpl implements SupplierDAO{
		@Autowired
		private SessionFactory sessionFactory;
		public SupplierDAOImpl(SessionFactory sessionFactory){
			this.sessionFactory=sessionFactory;
			
		}	
		@Transactional
		public void saveOrUpdate(Supplier supplier) {
			// TODO Auto-generated method stub
			sessionFactory.getCurrentSession().saveOrUpdate(supplier);
			
		}
		@Transactional
		public void delete(String id){
			Supplier SupplierToDelete = new Supplier();
			sessionFactory.getCurrentSession().delete(SupplierToDelete);
		}
		@SuppressWarnings("unchecked")
		@Transactional
		public List<Supplier> list(){
			List<Supplier> listSupplier=sessionFactory.getCurrentSession()
			.createCriteria(Supplier.class)
			.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
			return listSupplier;
		}
		@Transactional
		public Supplier get(String id) {
			// TODO Auto-generated method stub
			String hql= "from SupplierWhere0 id =" +"'"+id +"'";
			Query query =(Query) sessionFactory.getCurrentSession().createQuery(hql);
			@SuppressWarnings("unchecked")
			List<Supplier> listSupplier=(List<Supplier>) query.getResultList();
			if(listSupplier!= null && !listSupplier.isEmpty()){
				return listSupplier.get(0);
			}
			
			return null;
		}
		
		
		
	}

