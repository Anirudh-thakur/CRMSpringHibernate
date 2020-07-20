package trackerApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import trackerApp.entity.Customer;
@Service
public interface CustomerService {

	public List<Customer> getCustomer();

	public void saveCustomer(Customer customer);
}
