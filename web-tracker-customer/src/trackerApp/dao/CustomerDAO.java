package trackerApp.dao;
import java.util.List;

import trackerApp.entity.*;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int id);

	public void delete(Customer customer);
}
