package com.niit.mecakesbackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mecakesbackend.Dao.CartItemDao;
import com.niit.mecakesbackend.model.Cart;
import com.niit.mecakesbackend.model.CartItem;



@Repository("cartItemDao")
@EnableTransactionManagement

public class CartItemDaoImpl implements CartItemDao
{

	@Autowired
	SessionFactory sessionFactory;//referance variable 

	
	
	public CartItemDaoImpl(SessionFactory sessionFactory)
	{

		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean saveupdate(CartItem CartItem)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(CartItem);
		return true;
	}

	@Transactional
	public boolean delete(String cartitem_id)
	{	
			sessionFactory.getCurrentSession().delete(cartitem_id);
			return true;
	}
			
			
		
	

	@Transactional
	public CartItem get(String cartitem_id) 
	{
		String q1 = "from CartItem where cartitem_id='" + cartitem_id+ "'";
		Query w = sessionFactory.getCurrentSession().createQuery(q1);
		@SuppressWarnings("unchecked")
		List<CartItem> list1 = (List<CartItem>) w.list();
		if (list1 == null || list1.isEmpty()) {
			return null;
		} else {
			return list1.get(0);
		}

	}
	@Transactional
public List<CartItem> list() {
		@SuppressWarnings("unchecked")
		List<CartItem> cartitem= (List<CartItem>) sessionFactory.getCurrentSession().createCriteria(Cart.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
     return cartitem;
	}

	
	@Transactional
	public CartItem getlistall(String cart_id,String product_id)
	{
		String q3="from CartItem where cart_id='"+cart_id+"'and product_id='"+product_id+"'";
		Query w = sessionFactory.getCurrentSession().createQuery(q3);
		@SuppressWarnings("unchecked")
		List<CartItem> list3 = (List<CartItem>) w.list();
		if (list3 == null || list3.isEmpty()) {
			return null;
		} else {
			return list3.get(0);
		}

	}
	
	@Transactional
	public  List<CartItem>getlist(String cart_id)
	 {
				String q4 = "from Product where cart_id='" +cart_id+ "'";
				Query w = sessionFactory.getCurrentSession().createQuery(q4);
				@SuppressWarnings("unchecked")
				List<CartItem> list4 = (List<CartItem>) w.list();
				if (list4 == null || list4.isEmpty())
				{
					return null;
				} else
				{
					return list4;
				}

			
	      }

	@Override
	public List<CartItem> getlistByProduct(String product_id)
	{
		String q5= "from Product where product_id='" +product_id+ "'";
		Query w = sessionFactory.getCurrentSession().createQuery(q5);
		@SuppressWarnings("unchecked")
		List<CartItem> list5 = (List<CartItem>) w.list();
		if (list5 == null || list5.isEmpty())
		{
			return null;
		} else
		{
			return list5;
		}

	
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


	
