package com.niit.mecakesbackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mecakesbackend.Dao.BillingAddressDao;
import com.niit.mecakesbackend.model.BillingAddress;


@Repository("BillingAddressDao")
@EnableTransactionManagement

public class BillingAddressDaoImpl  implements BillingAddressDao
{
	@Autowired
	SessionFactory sessionFactory;//referance variable 

	
	
	public BillingAddressDaoImpl(SessionFactory sessionFactory)
	{

		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean saveupdate(BillingAddress billingAddress)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(billingAddress);
		return true;
	}

	@Transactional
	public boolean delete(String bid) {
		
		BillingAddress c = new BillingAddress();
			c.setBid(bid);
			sessionFactory.getCurrentSession().delete(c);
			return true;
	}
			
			
		
	

	@Transactional
	public BillingAddress get(String bid) {
		String q1 = "from BillingAddress where id='" + bid + "'";
		Query w = sessionFactory.getCurrentSession().createQuery(q1);
		@SuppressWarnings("unchecked")
		List<BillingAddress> list1 = (List<BillingAddress>) w.list();
		if (list1 == null || list1.isEmpty()) {
			return null;
		} else {
			return list1.get(0);
		}

	}
	@Transactional
public List<BillingAddress> list() {
		@SuppressWarnings("unchecked")
		List<BillingAddress> billingAddress = (List<BillingAddress>) sessionFactory.getCurrentSession().createCriteria(BillingAddress.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
     return billingAddress;
	}

	@Override
	public BillingAddress getByUser1(String uid) 
	{
		String q3 = "from BillingAddress where id='" + uid + "'";
		Query w = sessionFactory.getCurrentSession().createQuery(q3);
		@SuppressWarnings("unchecked")
		List<BillingAddress> list3 = (List<BillingAddress>) w.list();
		if (list3 == null || list3.isEmpty()) {
			return null;
		} else {
			return list3.get(0);
		}
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



