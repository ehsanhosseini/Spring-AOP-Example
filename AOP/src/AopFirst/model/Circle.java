package AopFirst.model;

import javax.management.RuntimeErrorException;

public class Circle {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
		System.out.println("Circle setter called ");
		throw(new RuntimeException());
	}
	
	public String setNameReturn(String name) {
		this.name = name;
		
		System.out.println("Circle setter called ");
		return name;
	}

}
