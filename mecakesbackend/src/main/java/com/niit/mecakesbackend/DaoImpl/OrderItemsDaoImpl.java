package com.niit.mecakesbackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mecakesbackend.Dao.OrderItemsDao;
import com.niit.mecakesbackend.model.OrderItems;


@Repository("orderItemsDao")
@EnableTransactionManagement
public class OrderItemsDaoImpl implements OrderItemsDao
{
	@Autowired
	SessionFactory sessionFactory;//referance variable 

	
	
	public OrderItemsDaoImpl(SessionFactory sessionFactory)
	{

		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean saveupdate(OrderItems orderitems)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(orderitems);
		return true;
	}

	@Transactional
	public boolean delete(String orderitem_id) {
		
		OrderItems c = new OrderItems();
			c.setOrderitem_id(orderitem_id);
			sessionFactory.getCurrentSession().delete(c);
			return true;
	}
			
			
		
	

	@Transactional
	public OrderItems get(String orderitem_id) 
	{
		String q1 = "from OrderItems where id='" + orderitem_id+ "'";
		Query w = sessionFactory.getCurrentSession().createQuery(q1);
		@SuppressWarnings("unchecked")
		List<OrderItems> list1 = (List<OrderItems>) w.list();
		if (list1 == null || list1.isEmpty()) {
			return null;
		} else {
			return list1.get(0);
		}

	}
	@Transactional
public List<OrderItems> list() {
		@SuppressWarnings("unchecked")
		List<OrderItems> orderitems= (List<OrderItems>) sessionFactory.getCurrentSession().createCriteria(OrderItems.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
     return orderitems;
	}
	
	public List<OrderItems> getOrderItemsByOrder(String orderitem_id)
	{
		String q2 = "from OrderItems where id='" + orderitem_id+ "'";
		Query w = sessionFactory.getCurrentSession().createQuery(q2);
		@SuppressWarnings("unchecked")
		List<OrderItems> list2 = (List<OrderItems>) w.list();
		if (list2 == null || list2.isEmpty()) {
			return null;
		} else {
			return list2;
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


