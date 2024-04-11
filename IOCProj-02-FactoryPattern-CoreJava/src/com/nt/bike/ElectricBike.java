package com.nt.bike;

public class ElectricBike implements Bike {

	@Override
	public void start() {
	System.out.println("ElectricBike(Ather)::Bike started");

	}

	@Override
	public void drive() {
		System.out.println("ElectricBike(Ather)::Bike is in driving");

	}

	@Override
	public void stop() {
		System.out.println("ElectricBike(Ather)::Bike is stoped");

	}

	@Override
	public void park() {
		System.out.println("ElectricBike(Ather)::Bike is parked");

	}

}
