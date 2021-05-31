package com.meritamerica.assignment7.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "IRA")
@Table(name = "IRA")
public abstract class IRA extends BankAccount{
	
	
	double interestRate = 0.0500;
	
	public IRA() {
		super();
		
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	

}
