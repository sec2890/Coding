package com.steven.web.models;

public abstract class Animal {
	
	//The Attributes
	protected String name;
	protected String breed;
	protected Double weight;
	
	public Animal(String name, String breed, Double weight) {
		this.name = name;
		this.breed = breed;
		this.weight = weight;
	}

	//The Getters
	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public Double getWeight() {
		return weight;
	}

	//The Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

}
	