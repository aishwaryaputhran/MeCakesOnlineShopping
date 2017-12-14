package com.niit.mecakesbackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;


import com.niit.mecakesbackend.Dao.CardDao;

import com.niit.mecakesbackend.model.Card;

@Repository("CardDao")
@EnableTransactionManagement

public class CardDaoImpl implements CardDao
{
	@Autowired
	SessionFactory sessionFactory;//referance variable 

	
	
	public CardDaoImpl(SessionFactory sessionFactory)
	{

		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean saveupdate(Card card)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(card);
		return true;
	}

	@Transactional
	public boolean delete(String card_id) {
		
		Card c = new Card();
			c.setCard_id(card_id);
			sessionFactory.getCurrentSession().delete(c);
			return true;
	}
			
			
		
	

	@Transactional
	public Card get(String card_id) {
		String q1 = "from Card where id='" + card_id+ "'";
		Query w = sessionFactory.getCurrentSession().createQuery(q1);
		@SuppressWarnings("unchecked")
		List<Card> list1 = (List<Card>) w.list();
		if (list1 == null || list1.isEmpty()) {
			return null;
		} else {
			return list1.get(0);
		}

	}
	@Transactional
public List<Card> list() {
		@SuppressWarnings("unchecked")
		List<Card> card = (List<Card>) sessionFactory.getCurrentSession().createCriteria(Card.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
     return card;
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


