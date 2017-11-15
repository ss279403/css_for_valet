package com.libertymutual.goforcode.viscious_valet.models;

import java.util.ArrayList;

public class Lot {

	private ArrayList<Car> carList; // declared a variable (just like private int variable)
	private int capacity = 5;

	public Lot() {
		carList = new ArrayList<Car>(); // this is creating the list and adding it to carList (set it to an initial
										// value)
		
	}
	
	public void removeCarFromLot(int index) {
		carList.remove(index - 1);
	}
	
	public void driveCarOnto(Car clientCar) {
		if (isLotFull() == false) {
			carList.add(clientCar);
		}
	}

	
	public boolean isLotFull() {
		if (carList.size() < capacity) {
			return false;
		} else {
			return true;
		}
	}


	// if lot is full then write a method to declare to html if true or false

	public ArrayList<Car> getCarList() {
		return carList;
	}
}



