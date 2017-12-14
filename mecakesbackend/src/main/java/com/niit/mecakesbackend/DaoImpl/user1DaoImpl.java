package com.niit.mecakesbackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mecakesbackend.Dao.user1Dao;
import com.niit.mecakesbackend.model.Authentication;
import com.niit.mecakesbackend.model.BillingAddress;
import com.niit.mecakesbackend.model.Cart;
import com.niit.mecakesbackend.model.user1;

@Repository("user1Dao")
@EnableTransactionManagement
public class user1DaoImpl implements user1Dao {
	@Autowired
	SessionFactory sessionFactory;//referance variable 

	
	
	public user1DaoImpl(SessionFactory sessionFactory) {

		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean saveupdate(user1 user) {
		Cart cart=new Cart();
		user.setCart(cart);
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		
		BillingAddress billingAddress=new BillingAddress();
		user.setBillingAddress(billingAddress);
		
		sessionFactory.getCurrentSession().saveOrUpdate(billingAddress);
		Authentication authentication=new Authentication();
		user.setAuthentication(authentication);
		sessionFactory.getCurrentSession().saveOrUpdate(authentication);
		return true;
	}

	@Transactional
	public boolean delete(String uid) {
		
			user1 u = new user1();
			u.setUid(uid);
			sessionFactory.getCurrentSession().delete(u);
			return true;
	}
			
			
		
	

	@Transactional
	public user1 get(String id) {
		String q1 = "from user1 where uid='" + id + "'";
		Query w = sessionFactory.getCurrentSession().createQuery(q1);
		@SuppressWarnings("unchecked")
		List<user1> list1 = (List<user1>) w.list();
		if (list1 == null || list1.isEmpty()) {
			return null;
		} else {
			return list1.get(0);
		}

	}
	@Transactional
public List<user1> list() {
		@SuppressWarnings("unchecked")
		List<user1> user = (List<user1>) sessionFactory.getCurrentSession().createCriteria(user1.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
     return user;
	}
@Transactional
   public user1 isvalid(String email,String password)
   {
	   String q2 = "from user1 where email='" +email+"' and password='"+password+"'";
		Query w = sessionFactory.getCurrentSession().createQuery(q2);
		@SuppressWarnings("unchecked")
		List<user1> list1 = (List<user1>) w.list();
		if (list1 == null || list1.isEmpty())
		{
			return null;
		} else
		{
			return list1.get(0);
	    }

   }
   public user1 getEmail(String email)
   {
	   String q3 = "from user1 where email=";
		Query w = sessionFactory.getCurrentSession().createQuery(q3);
		@SuppressWarnings("unchecked")
		List<user1> list1 = (List<user1>) w.list();
		if (list1 == null || list1.isEmpty())
		{
			return null;
		} else
		{
			return list1.get(0);
	    }
	   
   }

}




