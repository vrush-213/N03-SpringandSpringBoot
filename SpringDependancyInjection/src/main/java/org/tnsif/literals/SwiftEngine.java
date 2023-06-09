package org.tnsif.literals;

public class SwiftEngine implements IEngine {
	//1.DI in the form of literals
	private String company;
	private double cost;

	public double cost() {
		
		return cost;	
	}

	public String display() {
		
		return "India";
	}
	
	
	//DI using constructor
	public SwiftEngine(String company, double cost) {
		super();
		this.company = company;
		this.cost = cost;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Origin of company:"+company+fuel;
	}
	

}
