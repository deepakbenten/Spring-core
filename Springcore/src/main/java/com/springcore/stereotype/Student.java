package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
//@Scope("prototype")
public class Student 
{
	@Value("Deepak kumar")
	private String stdName;
	@Value("Ramgarh Cantt")
	private String stdCity;
	@Value("#{temp}")
	private List<String> address;
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getStdCity() {
		return stdCity;
	}
	public void setStdCity(String stdCity) {
		this.stdCity = stdCity;
	}
	
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [stdName=" + stdName + ", stdCity=" + stdCity + ", address=" + address + "]";
	}
	
	

}
