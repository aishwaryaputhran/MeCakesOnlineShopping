package com.niit.mecakesbackend.Dao;

import java.util.List;

import com.niit.mecakesbackend.model.Card;


public interface CardDao
{
	public boolean saveupdate(Card card);  //true if succesful else false
	  
	  public boolean delete(String card_id);
	  
	  public Card get(String card_id);
	  
	  public List<Card> list();   //return list of cateogry
}
