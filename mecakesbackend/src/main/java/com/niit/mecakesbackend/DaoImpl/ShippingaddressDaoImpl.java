package com.niit.mecakesbackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mecakesbackend.Dao.ShippingaddressDao;

import com.niit.mecakesbackend.model.Shippingaddress;

@Repository("ShippingaddressDao")
@EnableTransactionManagement

public class ShippingaddressDaoImpl implements ShippingaddressDao
{
	@Autowired
	SessionFactory sessionFactory;//referance variable 

	
	
	public ShippingaddressDaoImpl(SessionFactory sessionFactory)
	{

		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean saveupdate(Shippingaddress shippingaddress)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(shippingaddress);
		return true;
	}

	@Transactional
	public boolean delete(String id) {
		
		Shippingaddress c = new Shippingaddress();
			c.setId(id);
			sessionFactory.getCurrentSession().delete(c);
			return true;
	}
			
			
		
	

	@Transactional
	public Shippingaddress get(String id) 
	{
		String q1 = "from Shippingaddress where id='" + id+ "'";
		Query w = sessionFactory.getCurrentSession().createQuery(q1);
		@SuppressWarnings("unchecked")
		List<Shippingaddress> list1 = (List<Shippingaddress>) w.list();
		if (list1 == null || list1.isEmpty()) {
			return null;
		} else {
			return list1.get(0);
		}

	}
	@Transactional
public List<Shippingaddress> list() {
		@SuppressWarnings("unchecked")
		List<Shippingaddress> shippingaddress= (List<Shippingaddress>) sessionFactory.getCurrentSession().createCriteria(Shippingaddress.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
     return shippingaddress;
	}

	@Override
	public List<Shippingaddress> getAddByUser1(String uid)
	{

		String q3 = "from Shippingaddress where id='" + uid+ "'";
		Query w = sessionFactory.getCurrentSession().createQuery(q3);
		@SuppressWarnings("unchecked")
		List<Shippingaddress> list3 = (List<Shippingaddress>) w.list();
		if (list3 == null || list3.isEmpty()) {
			return null;
		} else {
			return list3;
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
