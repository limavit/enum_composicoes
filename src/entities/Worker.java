package entities;

import entities.enums.Worklevel;

public class Worker {
	private String name;
	private Worklevel level;
	private Double baseSalary;
	
	public Worker () {
		
	}

	public Worker(String name, Worklevel level, Double baseSalary) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
	}
	

}
