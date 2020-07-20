package trackerApp.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import trackerApp.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	//need to inject session factory 
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Customer> getCustomers() {
		//Get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		//Create Query
		Query<Customer> theQuery = currentSession.createQuery("from Customer order by firstName",Customer.class);
		
		
		//Execute query and get result list 
		List<Customer> customers = theQuery.getResultList();
		
		return customers;
	}

	@Override
	public void saveCustomer(Customer customer) {
		//Get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		//Save customer
		currentSession.save(customer);
	}


}
