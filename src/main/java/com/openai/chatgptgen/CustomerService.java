package com.openai.chatgptgen;

public class CustomerService {
	private CustomerDao customerDao;

	public CustomerService(CustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	public Customer getCustomerById(String id) {
		return customerDao.findById(id);
	}
}
