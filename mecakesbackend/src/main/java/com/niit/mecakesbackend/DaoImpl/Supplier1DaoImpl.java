package com.niit.mecakesbackend.DaoImpl;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mecakesbackend.Dao.Supplier1Dao;
import com.niit.mecakesbackend.model.Supplier1;

@Repository("Supplier1Dao")
@EnableTransactionManagement


public class Supplier1DaoImpl implements Supplier1Dao
{
	@Autowired
	SessionFactory sessionFactory;//referance variable 

	
	
	public Supplier1DaoImpl(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean saveupdate(Supplier1 supplier) {
		sessionFactory.getCurrentSession().saveOrUpdate(supplier);
		return true;
	}

	@Transactional
	public boolean delete(Supplier1 supplier) {
		
		
			sessionFactory.getCurrentSession().delete(supplier);
			return true;
	}


	@Transactional
	public Supplier1 get(String sid) {
		String q1 = "from Supplier1 where sid='" + sid + "'";
		Query w = sessionFactory.getCurrentSession().createQuery(q1);
		@SuppressWarnings("unchecked")
		List<Supplier1> list1 = (List<Supplier1>) w.list();
		if (list1 == null || list1.isEmpty()) {
			return null;
		} else {
			return list1.get(0);
		}

	}
	@Transactional
public List<Supplier1> list() {
		@SuppressWarnings("unchecked")
		List<Supplier1> supplier= (List<Supplier1>) sessionFactory.getCurrentSession().createCriteria(Supplier1.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
     return supplier;
	}

}
