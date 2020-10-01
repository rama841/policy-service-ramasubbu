package com.rama.policy.ms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rama.policy.ms.model.Customer;
import com.rama.policy.ms.model.Policy;
import com.rama.policy.ms.repository.PolicyRepository;

@Service
public class PolicyService {

	@Autowired
	private CustomerService customerService;
	
	@Autowired
	private PolicyRepository policyRepository;
	
	public Policy createPolicy(Policy policy) {
		
		Customer customer;
		//The original master method call
		customer = customerService.getCustomerDetails(policy.getCustomerDetails().getCustomerId());
		
		// Excercise 3 - Usage of getForObject
 		//customer = customerService.getCustomerDetailsByObject(policy.getCustomerDetails().getCustomerId());
		
		// Excercise 3 - Usage of exchange
		//customer = customerService.getCustomerDetailsByExchange(policy.getCustomerDetails().getCustomerId());
		
		policy.setCustomerDetails(customer);
		policyRepository.save(policy);
		return null;
	}

	public List<Policy> getPolicies() {
		
		return policyRepository.findAll();
		
	}
}
