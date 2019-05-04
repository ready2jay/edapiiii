package com.usa.nj.gov.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement(name = "ind-info")
@XmlAccessorType(XmlAccessType.FIELD)
public class IndInfoRequest {
	private int indvId;
	private Long ssn;
	private String firstName;
	private String lastName;
	private int age;
	private double monthlyIncome;
	private String plan;
	private int noOfKids;
	public int getIndvId() {
		return indvId;
	}
	public void setIndvId(int indvId) {
		this.indvId = indvId;
	}
	public Long getSsn() {
		return ssn;
	}
	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getMonthlyIncome() {
		return monthlyIncome;
	}
	public void setMonthlyIncome(double monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public int getNoOfKids() {
		return noOfKids;
	}
	public void setNoOfKids(int noOfKids) {
		this.noOfKids = noOfKids;
	}
}
