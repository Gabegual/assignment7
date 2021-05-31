package com.meritamerica.assignment7.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "RolloverIRA")
@Table(name = "RolloverIRA")
public class RolloverIRA extends IRA{
	
	double interestRate = 0.0500;

	public RolloverIRA() {
		super();
		
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
	

}
