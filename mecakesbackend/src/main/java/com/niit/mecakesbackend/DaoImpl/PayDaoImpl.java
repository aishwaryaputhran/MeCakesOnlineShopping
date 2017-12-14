package com.niit.mecakesbackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mecakesbackend.Dao.PayDao;

import com.niit.mecakesbackend.model.Pay;

@Repository("PayDao")
@EnableTransactionManagement

public class PayDaoImpl implements PayDao
{
	@Autowired
	SessionFactory sessionFactory;//referance variable 

	
	
	public PayDaoImpl(SessionFactory sessionFactory)
	{

		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean saveupdate(Pay pay)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(pay);
		return true;
	}

	@Transactional
	public boolean delete(String payment_id) {
		
		Pay c = new Pay();
			c.setPayment_id(payment_id);
			sessionFactory.getCurrentSession().delete(c);
			return true;
	}
			
			
		
	

	@Transactional
	public Pay get(String payment_id) 
	{
		String q1 = "from Pay where id='" + payment_id+ "'";
		Query w = sessionFactory.getCurrentSession().createQuery(q1);
		@SuppressWarnings("unchecked")
		List<Pay> list1 = (List<Pay>) w.list();
		if (list1 == null || list1.isEmpty()) {
			return null;
		} else {
			return list1.get(0);
		}

	}
	@Transactional
public List<Pay> list() {
		@SuppressWarnings("unchecked")
		List<Pay> pay= (List<Pay>) sessionFactory.getCurrentSession().createCriteria(Pay.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
     return pay;
	}

	//@Override
	//public boolean saveupdate(BillingAddress billingAddress)
	//{
		// TODO Auto-generated method stub
	//	return false;
	//}

	//@Override
	//public BillingAddress get(String bid) {
		// TODO Auto-generated method stub
		//return null;
	//}




}
