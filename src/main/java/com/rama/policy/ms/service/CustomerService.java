package com.rama.policy.ms.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.rama.policy.ms.model.Customer;

@Service
public class CustomerService {

	public Customer getCustomerDetails(String customerId) {
		
		RestTemplate restTemplate = new RestTemplate();
		
		ResponseEntity<Customer> response = restTemplate.getForEntity("http://localhost:8081/mongoCustomer/"+customerId, Customer.class);
		
		Customer customer = response.getBody();
		
		return customer;
		
	}

}
