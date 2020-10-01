package com.rama.policy.ms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rama.policy.ms.model.Policy;
import com.rama.policy.ms.service.PolicyService;

@RestController
public class PolicyController {
	
	@Autowired
	private PolicyService policyService;

	@RequestMapping(value ="/hello")
	public String hello() {
		return "Hello from Policy";
	}
	
	@RequestMapping(value = "/policy", method = RequestMethod.POST)
	public Policy createPolicy(@RequestBody Policy policy) {
		
		return policyService.createPolicy(policy);
		
	}
	
	@RequestMapping(value = "/policies", method = RequestMethod.GET)
	public List<Policy> getPolicies() {
		return policyService.getPolicies();
		
	}
	
	
	
	/**
	 * {
"policyType":"NewBusiness",
"policyEffectiveDate":"2021-11-01",
"policyEndDate":"2022-11-01",
"customerDetails":{
"customerId":"234"
}
}
	 */
	
	
}
