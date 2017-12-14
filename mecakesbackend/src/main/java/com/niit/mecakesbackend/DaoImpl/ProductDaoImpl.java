package com.niit.mecakesbackend.DaoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.mecakesbackend.Dao.ProductDao;

import com.niit.mecakesbackend.model.Product;

@Repository("ProductDao")
@EnableTransactionManagement

public class ProductDaoImpl implements ProductDao
{
	@Autowired
	SessionFactory sessionFactory;//referance variable 

	
	
	public ProductDaoImpl(SessionFactory sessionFactory)
	{

		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public boolean saveupdate(Product product)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		return true;
	}

	@Transactional
	public boolean delete(Product Product) {
		
			sessionFactory.getCurrentSession().delete(Product);
			return true;
	}
			
			
		
	

	@Transactional
	public Product get(String product_id) 
	{
		String q1 = "from Product where id='" + product_id+ "'";
		Query w = sessionFactory.getCurrentSession().createQuery(q1);
		@SuppressWarnings("unchecked")
		List<Product> list1 = (List<Product>) w.list();
		if (list1 == null || list1.isEmpty()) {
			return null;
		} else {
			return list1.get(0);
		}

	}
	@Transactional
public List<Product> list() {
		@SuppressWarnings("unchecked")
		List<Product> product= (List<Product>) sessionFactory.getCurrentSession().createCriteria(Product.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
     return product;
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
	@Transactional
	public  List<Product>getProductByCategory(String cid)
	 {
				String q1 = "from Product where cid='" +cid+ "'";
				Query w = sessionFactory.getCurrentSession().createQuery(q1);
				@SuppressWarnings("unchecked")
				List<Product> list1 = (List<Product>) w.list();
				if (list1 == null || list1.isEmpty())
				{
					return null;
				} else
				{
					return list1;
				}

			
	      }
	@Transactional
	public  List<Product>getProductBySupplier1(String sid)
	 {
				String q1 = "from Product where sid='" +sid+ "'";
				Query w = sessionFactory.getCurrentSession().createQuery(q1);
				@SuppressWarnings("unchecked")
				List<Product> list1 = (List<Product>) w.list();
				if (list1 == null || list1.isEmpty())
				{
					return null;
				} else
				{
					return list1;
				}

			
	      }  

}
