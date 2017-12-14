package com.niit.mecakesbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.niit.mecakesbackend.Dao.AuthenticationDao;
import com.niit.mecakesbackend.Dao.BillingAddressDao;
import com.niit.mecakesbackend.Dao.CardDao;
import com.niit.mecakesbackend.Dao.CartDao;
import com.niit.mecakesbackend.Dao.CartItemDao;
import com.niit.mecakesbackend.Dao.OrderDao;
import com.niit.mecakesbackend.Dao.OrderItemsDao;
import com.niit.mecakesbackend.Dao.PayDao;
import com.niit.mecakesbackend.Dao.ProductDao;
import com.niit.mecakesbackend.Dao.ShippingaddressDao;
import com.niit.mecakesbackend.Dao.Supplier1Dao;
import com.niit.mecakesbackend.Dao.category1Dao;
import com.niit.mecakesbackend.Dao.user1Dao;
import com.niit.mecakesbackend.DaoImpl.AuthenticationDaoImpl;
import com.niit.mecakesbackend.DaoImpl.BillingAddressDaoImpl;
import com.niit.mecakesbackend.DaoImpl.CardDaoImpl;
import com.niit.mecakesbackend.DaoImpl.CartDaoImpl;
import com.niit.mecakesbackend.DaoImpl.CartItemDaoImpl;
import com.niit.mecakesbackend.DaoImpl.OrderDaoImpl;
import com.niit.mecakesbackend.DaoImpl.OrderItemsDaoImpl;
import com.niit.mecakesbackend.DaoImpl.PayDaoImpl;
import com.niit.mecakesbackend.DaoImpl.ProductDaoImpl;
import com.niit.mecakesbackend.DaoImpl.ShippingaddressDaoImpl;
import com.niit.mecakesbackend.DaoImpl.Supplier1DaoImpl;
import com.niit.mecakesbackend.DaoImpl.category1DaoImpl;
import com.niit.mecakesbackend.DaoImpl.user1DaoImpl;
import com.niit.mecakesbackend.model.Authentication;
import com.niit.mecakesbackend.model.BillingAddress;
import com.niit.mecakesbackend.model.Card;
import com.niit.mecakesbackend.model.Cart;
import com.niit.mecakesbackend.model.CartItem;
import com.niit.mecakesbackend.model.Order;
import com.niit.mecakesbackend.model.OrderItems;
import com.niit.mecakesbackend.model.Pay;
import com.niit.mecakesbackend.model.Product;
import com.niit.mecakesbackend.model.Shippingaddress;
import com.niit.mecakesbackend.model.Supplier1;
import com.niit.mecakesbackend.model.category1;
import com.niit.mecakesbackend.model.user1;

@Configuration
@ComponentScan("com.niit.*")
@EnableTransactionManagement

public class ApplicationContext {
	
@Bean("dataSource")  //create a object without new keyword
public DataSource getDataSource() //for single factory pattern working
{
	DriverManagerDataSource dataSource=new DriverManagerDataSource();
	dataSource.setDriverClassName("org.h2.Driver");
	dataSource.setUrl("jdbc:h2:tcp://localhost/~/test1");
	dataSource.setUsername("sa");
	dataSource.setPassword("sa");
	
//	Properties connectionProperties=new Properties();
//	connectionProperties.setProperty("hibernate.connection.pool_size", "10");
//	connectionProperties.setProperty("hibernate.hbm2ddl.auto", "update");
//	connectionProperties.setProperty("hibernate.show_sql", "true");
//	connectionProperties.setProperty("hibernate.dialect", "org.hibernate.dialect");
return dataSource;
}
private Properties getHibernateProperties()
{
	Properties properties=new Properties();
	properties.put("hibernate.connection.pool_size", "10"); //size
	properties.put("hibernate.hbm2ddl.auto", "update"); //to restore the data
	properties.put("hibernate.show_sql","true"); //shows the sql query in console(black text)
	properties.put("hibernate.dialect", "org.hibernate.dialect.H2Dialect"); //to which db we r connecting to
	return properties;
}
@Autowired
@Bean("sessionFactory")
public SessionFactory getSessionFactory(DataSource dataSource)
{
	LocalSessionFactoryBuilder sessionBuilder=new LocalSessionFactoryBuilder(dataSource);
	sessionBuilder.addProperties(getHibernateProperties());
	sessionBuilder.addAnnotatedClass(category1.class);
	sessionBuilder.addAnnotatedClass(Product.class);
	sessionBuilder.addAnnotatedClass(Supplier1.class);
	sessionBuilder.addAnnotatedClass(user1.class);
	sessionBuilder.addAnnotatedClass(Cart.class);
	sessionBuilder.addAnnotatedClass(BillingAddress.class);
	sessionBuilder.addAnnotatedClass(Shippingaddress.class);
	sessionBuilder.addAnnotatedClass(Card.class);
	sessionBuilder.addAnnotatedClass(Pay.class);
	sessionBuilder.addAnnotatedClass(CartItem.class);
	sessionBuilder.addAnnotatedClass(Order.class);	
	sessionBuilder.addAnnotatedClass(OrderItems.class);	
	sessionBuilder.addAnnotatedClass(Authentication.class);
   // sessionBuilder.buildMapping(net.viralpatel.hibernate.UserDetails2);
	return sessionBuilder.buildSessionFactory();
}
@Autowired
@Bean("transactionManager")
public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
{
	HibernateTransactionManager transactionManager=new HibernateTransactionManager(sessionFactory);
	return transactionManager;
}
@Autowired
@Bean(name="user1Dao")
public user1Dao getuser1Dao(SessionFactory sessionFactory)
{
	return new user1DaoImpl(sessionFactory);
}

@Autowired
@Bean(name="category1Dao")
public category1Dao getcategory1Dao(SessionFactory sessionFactory)
{
	return new category1DaoImpl(sessionFactory);
}

@Autowired
@Bean(name=" cartItemDao")
public CartItemDao getCartItemDao(SessionFactory sessionFactory)
{
	return new CartItemDaoImpl(sessionFactory);
}




@Autowired
@Bean("supplier1Dao")
public Supplier1Dao getSupplier1Dao(SessionFactory sessionFactory)
{
	return new Supplier1DaoImpl(sessionFactory);
}
@Autowired
@Bean("productDao")
public ProductDao getProductDao(SessionFactory sessionFactory)
{
	return new ProductDaoImpl(sessionFactory);
}
//@Autowired
//@Bean("user1Dao")
//public user1Dao getuser1Dao(SessionFactory sessionFactory)
//{
//	return new user1DaoImpl(sessionFactory);
//}

@Autowired
@Bean("shippingaddressDao")
public ShippingaddressDao getShippingaddressDao(SessionFactory sessionFactory)
{
	return new ShippingaddressDaoImpl(sessionFactory);
}
@Autowired
@Bean("payDao")
public PayDao getPayDao(SessionFactory sessionFactory)
{
	return new PayDaoImpl(sessionFactory);
}

@Autowired
@Bean("cardDao")
public CardDao getCardDao1(SessionFactory sessionFactory)
{
	return new CardDaoImpl(sessionFactory);
}

@Autowired
@Bean("billingAddressDao")
public BillingAddressDao getBillingAddressDao(SessionFactory sessionFactory)
{
	return new  BillingAddressDaoImpl(sessionFactory);
}
@Autowired
@Bean("cartDao")
public CartDao getCartDao1(SessionFactory sessionFactory)
{
	return new CartDaoImpl(sessionFactory);
}
@Autowired
@Bean(name="orderDao")
public OrderDao getorderDao(SessionFactory sessionFactory)
{
	return new OrderDaoImpl(sessionFactory);
}
@Autowired
@Bean(name="orderItemsDao")
public OrderItemsDao getOrderitemsDao(SessionFactory sessionFactory)
{
	return new OrderItemsDaoImpl(sessionFactory);
}
@Autowired
@Bean(name="authenticationDao")
public AuthenticationDao getauthenticationDao(SessionFactory sessionFactory)
{
	return new AuthenticationDaoImpl(sessionFactory);
}

}

