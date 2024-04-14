package com.nt.bike;

public class EletricBike implements Bike {

	@Override
	public void start() {
		System.out.println("EletricBike(Ather):: Bike STarted");
	}

	@Override
	public void drive() {
		System.out.println("EletricBike(Ather):: Bike is in driving");

	}

	@Override
	public void stop() {
		System.out.println("EletricBike(Ather):: Bike is stopped");

	}

	@Override
	public void park() {
		System.out.println("EletricBike(Ather). Bike is parked");

	}

}
