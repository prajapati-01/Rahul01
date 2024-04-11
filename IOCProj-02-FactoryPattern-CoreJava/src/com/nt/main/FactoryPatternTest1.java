package com.nt.main;

import com.nt.bike.Bike;
import come.nt.factory.BikeFactory;

public class FactoryPatternTest1 {

	public static void main(String[] args) {
		//get Bike class object 
		
		Bike bike1 = BikeFactory.getBike("electric");
		bike1.start(); bike1.drive(); bike1.stop(); bike1.park();
		
		System.out.println("--------------");
		
		Bike bike2 = BikeFactory.getBike("sports");
		bike2.start(); bike2.drive(); bike2.stop(); bike2.park();
		
		System.out.println( "------------------");
		
		Bike bike3 = BikeFactory.getBike("standard");
		bike3.start(); bike3.drive(); bike3.stop(); bike3.park();
		
		
		
	}

}
