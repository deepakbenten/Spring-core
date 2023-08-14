package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp 
{
	private String name;
	private List<String> phones;
	private Set<String> Addreses;
	private Map<String, String> Courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddreses() {
		return Addreses;
	}
	public void setAddreses(Set<String> addreses) {
		Addreses = addreses;
	}
	public Map<String, String> getCourses() {
		return Courses;
	}
	public void setCourses(Map<String, String> courses) {
		Courses = courses;
	}
	public Emp(String name, List<String> phones, Set<String> addreses, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		Addreses = addreses;
		Courses = courses;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
