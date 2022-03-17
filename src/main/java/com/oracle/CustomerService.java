package com.oracle;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	public CustomerService() {
	}
	
	public List<Customer> getAllCustomers()
	{
		System.out.println("In CustomerService Class getAllCustomers()");
		Customer c1 = new Customer("Rajesh1", "Kumar", "1234567890", "abc@xyz.com");
		Customer c2 = new Customer("Rajesh2", "Kumar", "1234567890", "abc@xyz.com");
		Customer c3 = new Customer("Rajesh3", "Kumar", "1234567890", "abc@xyz.com");
		return Arrays.asList(c1,c2,c3);
	}
}