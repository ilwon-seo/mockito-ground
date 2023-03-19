package com.openai.chatgptgen;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CustomerServiceTest {

	@Mock
	private CustomerDao mockCustomerDao;

	@InjectMocks
	private CustomerService customerService;

	@Test
	public void testGetCustomerById() {
		// Define the behavior of the mock object
		Customer expectedCustomer = new Customer("123", "John Doe");
		when(mockCustomerDao.findById("123")).thenReturn(expectedCustomer);

		// Call the method we want to test
		Customer actualCustomer = customerService.getCustomerById("123");

		// Verify that the method returned the expected object
		assertEquals(expectedCustomer, actualCustomer);
	}
}
