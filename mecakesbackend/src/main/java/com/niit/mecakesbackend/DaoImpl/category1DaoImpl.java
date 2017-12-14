package com.niit.mecakesbackend.DaoImpl;

	import java.util.List;

	import org.hibernate.Criteria;
	import org.hibernate.Query;
	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
	import org.springframework.transaction.annotation.EnableTransactionManagement;
	import org.springframework.transaction.annotation.Transactional;

import com.niit.mecakesbackend.Dao.category1Dao;

	import com.niit.mecakesbackend.model.category1;

	@Repository("category1Dao")
	@EnableTransactionManagement
	
	public class category1DaoImpl implements category1Dao 
	{
		@Autowired
		SessionFactory sessionFactory;//referance variable 

		
		
		public category1DaoImpl(SessionFactory sessionFactory)
		{

			this.sessionFactory = sessionFactory;
		}

		@Transactional
		public boolean saveupdate(category1 category) {
			sessionFactory.getCurrentSession().saveOrUpdate(category);
			return true;
		}

		@Transactional
		public boolean delete(category1 category) {
			
				sessionFactory.getCurrentSession().delete(category);
				return true;
		}
				
				
			
		

		@Transactional
		public category1 get(String cid) {
			String q1 = "from category1 where id='" + cid + "'";
			Query w = sessionFactory.getCurrentSession().createQuery(q1);
			@SuppressWarnings("unchecked")
			List<category1> list1 = (List<category1>) w.list();
			if (list1 == null || list1.isEmpty()) {
				return null;
			} else {
				return list1.get(0);
			}

		}
		@Transactional
	public List<category1> list() {
			@SuppressWarnings("unchecked")
			List<category1> category = (List<category1>) sessionFactory.getCurrentSession().createCriteria(category1.class)
					.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
	     return category;
		}

	}

