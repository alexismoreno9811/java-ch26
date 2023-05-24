package com.mundoanimal;

public class Animal {
	private String name = "---";
	private String type = "---";
	private double sizeInMts = 0.0;
	private double weightInKg = 0.0;
	private boolean alive = true;
	
	public Animal() {
		
	}
	
	public Animal (String name) {
		this();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getSizeInMts() {
		return sizeInMts;
	}

	public void setSizeInMts(double sizeInMts) {
		this.sizeInMts = sizeInMts;
	}

	public double getWeightInKg() {
		return weightInKg;
	}

	public void setWeightInKg(double weightInKg) {
		this.weightInKg = weightInKg;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	public String eat(String food) {
		return this.name + " está comiento: " + food;
	}
	
	public String sleep(int minutes) {
		return this.name + " duerme " + minutes + " minutos.";
	}
	
}
