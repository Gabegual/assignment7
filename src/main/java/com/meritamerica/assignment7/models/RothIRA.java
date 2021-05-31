package com.meritamerica.assignment7.models;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "RothIRA")
@Table(name = "RothIRA")
public class RothIRA extends IRA{
	
	double interestRate = 0.0500;
	
	public RothIRA() {
		super();
		
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

}
