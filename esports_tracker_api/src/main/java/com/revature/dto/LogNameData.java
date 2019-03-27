package com.revature.dto;

public class LogNameData {
	private String name;

	public LogNameData(String name) {
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
		return "LogNameData [name=" + name + "]";
	}
	
	
}
