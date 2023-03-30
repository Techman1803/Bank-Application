package com.example.Insurance.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table

public class Insurance {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	@Column(name="insurance_id")
	private int InsuranceId;
	
	@Column(name="policy_no")
	private String PolicyNo;
	
	@Column(name="customer_id")
	private int customerId;
	
	@Column(name="insurance_type")
	private String InsuranceType;
	
	@Column(name="end_date")
	private LocalDate EndDate;

	public int getInsuranceId() {
		return InsuranceId;
	}

	public void setInsuranceId(int insuranceId) {
		InsuranceId = insuranceId;
	}

	public String getPolicyNo() {
		return PolicyNo;
	}

	public void setPolicyNo(String policyNo) {
		PolicyNo = policyNo;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getInsuranceType() {
		return InsuranceType;
	}

	public void setInsuranceType(String insuranceType) {
		InsuranceType = insuranceType;
	}

	public LocalDate getEndDate() {
		return EndDate;
	}

	public void setEndDate(LocalDate endDate) {
		EndDate = endDate;
	}
	
	
}
