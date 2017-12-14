package com.niit.mecakesbackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mecakesbackend.Dao.OrderDao;

import com.niit.mecakesbackend.model.Order;

@Repository("OrderDao")
@EnableTransactionManagement


public class OrderDaoImpl implements OrderDao
{

	@Autowired
	SessionFactory sessionFactory;//referance variable 

	
	
	public OrderDaoImpl(SessionFactory sessionFactory)
	{

		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean saveupdate(Order order)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(order);
		return true;
	}

	@Transactional
	public boolean delete(String order_id) {
		
		Order c = new Order();
			c.setOrder_id(order_id);
			sessionFactory.getCurrentSession().delete(c);
			return true;
	}
			
			
		
	

	@Transactional
	public Order get(String order_id) 
	{
		String q1 = "from Order where id='" + order_id+ "'";
		Query w = sessionFactory.getCurrentSession().createQuery(q1);
		@SuppressWarnings("unchecked")
		List<Order> list1 = (List<Order>) w.list();
		if (list1 == null || list1.isEmpty()) {
			return null;
		} else {
			return list1.get(0);
		}

	}
	@Transactional
public List<Order> list() {
		@SuppressWarnings("unchecked")
		List<Order> order= (List<Order>) sessionFactory.getCurrentSession().createCriteria(Order.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
     return order;
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
