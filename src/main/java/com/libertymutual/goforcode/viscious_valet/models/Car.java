package com.libertymutual.goforcode.viscious_valet.models;

public class Car {

	private String license; // instatnce fields for the object

	private String make;

	private String color;

	private String model;

	private String state;

	private String name;

	private String phone;

	public Car(String make, String license, String color, String model, String state, String name, String phone) { // parameters
		this.make = make;
		this.license = license;
		this.color = color;
		this.model = model;
		this.state = state;
		this.name = name;
		this.phone = phone;
		 
	}

	public String getLicense() {
		return license;
	}

	public String getMake() {
		return make;
	}

	public String getColor() {
		return color;
	}

	public String getModel() {
		return model;
	}

	public String getState() {
		return state;
	}

	public String getName() {
		return name;
	}

	public String getPhone() {
		return phone;
	}

}
