package com.niit.mecakesbackend.Dao;

import java.util.List;

import com.niit.mecakesbackend.model.category1;

public interface category1Dao
{
  public boolean saveupdate(category1 category);  //true if succesful else false
  
  public boolean delete(category1 category);
  
  public category1 get(String cid);
  
  public List<category1> list();   //return list of cateogry
}
