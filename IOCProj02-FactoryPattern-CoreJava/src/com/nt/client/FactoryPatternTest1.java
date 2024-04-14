package com.nt.client;

import com.nt.bike.Bike;
import com.nt.factory.BikeFactory;

public class FactoryPatternTest1 {

	public static void main(String[] args) {
		//get Bike class object
		 Bike bike1=BikeFactory.getBike("standard");
		 bike1.start(); bike1.drive(); bike1.stop(); bike1.park();
		 
		 System.out.println("___________________");
		 
		  Bike bike2=BikeFactory.getBike("sports");
		 bike2.start(); bike2.drive(); bike2.stop(); bike2.park();

	}

}
