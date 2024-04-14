package com.nt.bike;

public class SportsBike implements Bike {

	@Override
	public void start() {
		System.out.println("SportsBike(KTM-Duke):: Bike STarted");
	}

	@Override
	public void drive() {
		System.out.println("SportsBike(KTM-Duke):: Bike is in driving");

	}

	@Override
	public void stop() {
		System.out.println("SportsBike(KTM-Duke):: Bike is stopped");

	}

	@Override
	public void park() {
		System.out.println("SportsBike(KTM-Duke). Bike is parked");

	}

}
