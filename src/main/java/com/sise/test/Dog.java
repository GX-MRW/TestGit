package com.sise.test;

public class Dog {
	private String name;
	

	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Dog(String name) {
		super();
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Dog [name=" + name + "]";
	}
	
}
