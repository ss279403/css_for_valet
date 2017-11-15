package com.libertymutual.goforcode.viscious_valet.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.libertymutual.goforcode.viscious_valet.models.Car;
import com.libertymutual.goforcode.viscious_valet.models.Lot;

@Controller
public class AppController {

	private Lot carLot;

	public AppController() {
		carLot = new Lot();
	}

	@RequestMapping("/")
	public ModelAndView showApp(String license, String state, String color, String make, String model, String name,
			String phone) {
		// if license is not null and the length of the license is greater than 0
		// create a new instance of the car class from the values submitted
		if (license != null && license.length() > 0) {
			Car clientCar = new Car(make, license, color, model, state, name, phone); // an instance

			// park the car in the lot. need to add a method to the Lot class and call the
			// method.
			carLot.driveCarOnto(clientCar);

		}

		ModelAndView mv = new ModelAndView();
		mv.setViewName("app");

		// add the carLot so that I can see the list of cars in the view

		mv.addObject("lot", carLot);

		return mv;

	}

	@RequestMapping("/remove")
	public ModelAndView removeCar(int carIndex) {
		carLot.removeCarFromLot(carIndex);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("app");
		mv.addObject("lot", carLot);
		return mv;
	}

}//two parts to a variable name. what it is going to be and what do we want to call it
