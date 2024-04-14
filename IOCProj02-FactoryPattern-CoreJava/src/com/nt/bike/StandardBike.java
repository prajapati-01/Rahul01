package com.nt.bike;

public class StandardBike implements Bike {

	@Override
	public void start() {
		System.out.println("StandardBike(Honda-Shine):: Bike STarted");
	}

	@Override
	public void drive() {
		System.out.println("StandardBike(Honda-Shine):: Bike is in driving");

	}

	@Override
	public void stop() {
		System.out.println("StandardBike(Honda-Shine):: Bike is stopped");

	}

	@Override
	public void park() {
		System.out.println("StandardBike(Honda-Shine). Bike is parked");

	}

}
