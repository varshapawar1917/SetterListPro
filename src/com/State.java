package com;

import java.util.List;

public class State {
	private List<String> cities;
	String sname;
	public List getCities() {
		return cities;
	}
	public void setCities(List<String> cities) {
		this.cities = cities;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public void display()
	{
		System.out.println("Cities"+" "+cities+" "+ getSname());
	}
	

}
