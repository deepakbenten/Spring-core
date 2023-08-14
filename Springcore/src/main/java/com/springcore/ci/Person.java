package com.springcore.ci;

public class Person 
{
	private String name;
	private int personId;
	private Certif certif;
	
	public Person(String name, int personId, Certif certif)
	{
		this.name=name;
		this.personId=personId;
		this.certif=certif;
	}

	@Override
	public String toString() {
		
		return this.name+" : "+ this.personId + "{ " +this.certif.name+" }";
	}
	
	

}
