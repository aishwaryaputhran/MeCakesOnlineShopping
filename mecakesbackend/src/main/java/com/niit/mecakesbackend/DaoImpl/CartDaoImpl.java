package com.niit.mecakesbackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mecakesbackend.Dao.CartDao;

import com.niit.mecakesbackend.model.Cart;

@Repository("CartDao")
@EnableTransactionManagement

public class CartDaoImpl implements CartDao
{
	@Autowired
	SessionFactory sessionFactory;//referance variable 

	
	
	public CartDaoImpl(SessionFactory sessionFactory)
	{

		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean saveupdate(Cart cart)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(cart);
		return true;
	}

	@Transactional
	public boolean delete(Cart cart)
	{
		sessionFactory.getCurrentSession().delete(cart);
			return true;
	}
			
			
		
	

	@Transactional
	public Cart get(String cart_id) 
	{
		String q1 = "from Cart where id='" + cart_id+ "'";
		Query w = sessionFactory.getCurrentSession().createQuery(q1);
		@SuppressWarnings("unchecked")
		List<Cart> list1 = (List<Cart>) w.list();
		if (list1 == null || list1.isEmpty()) {
			return null;
		} else {
			return list1.get(0);
		}

	}
	@Transactional
public List<Cart> list() {
		@SuppressWarnings("unchecked")
		List<Cart> cart= (List<Cart>) sessionFactory.getCurrentSession().createCriteria(Cart.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
     return cart;
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
