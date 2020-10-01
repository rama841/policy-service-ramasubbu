package com.rama.policy.ms.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "policyservicems")
public class Policy {
	
	@Id
	private String policyId;
	private String policyType;
	private Date policyEffectiveDate;
	private Date policyEndDate;
	private Customer CustomerDetails;

	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public String getPolicyType() {
		return policyType;
	}
	public void setPolicyType(String policyType) {
		this.policyType = policyType;
	}
	public Date getPolicyEffectiveDate() {
		return policyEffectiveDate;
	}
	public void setPolicyEffectiveDate(Date policyEffectiveDate) {
		this.policyEffectiveDate = policyEffectiveDate;
	}
	public Date getPolicyEndDate() {
		return policyEndDate;
	}
	public void setPolictEndDate(Date policyEndDate) {
		this.policyEndDate = policyEndDate;
	}
	public Customer getCustomerDetails() {
		return CustomerDetails;
	}
	public void setCustomerDetails(Customer customerDetails) {
		CustomerDetails = customerDetails;
	}

}
