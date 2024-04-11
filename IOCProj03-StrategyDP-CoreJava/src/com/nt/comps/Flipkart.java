package com.nt.comps;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {
	
	//HAS -property
	private ICourier courier;
	
	public Flipkart() {
		System.out.println("Flipkart:: 0-param constructor");
	}
	
	//setter method for assignment
	public void setCourier(ICourier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier=courier;
	}
	
	//b.method
	public String shopping(String items[], double prices[]) {
		System.out.println("Flipkart.shopping()");
		//calculate bill amount
		double billAmt=0.0;
		for(double p:prices) {
			billAmt=billAmt+p;
		}
		//generate order id randomly
		int oid= new Random().nextInt(10000);
		//deliver the order using courier
		String msg= courier.deliver(oid);
		return Arrays.toString(items)+"are shopped having bill amount"+billAmt+"-->"+ msg;
	}

}
