//BikeFactory.java (factory Pattern)
package com.nt.factory;

import com.nt.bike.Bike;
import com.nt.bike.EletricBike;
import com.nt.bike.SportsBike;
import com.nt.bike.StandardBike;

public class BikeFactory {

	 //static factory method having factory pattern logic
	public static   Bike    getBike(String type) {
		  //create and  return one of Bike class obj  based on given data
		 if(type.equalsIgnoreCase("standard"))
			 return new StandardBike();
		 else if(type.equalsIgnoreCase("sports"))
			 return new SportsBike();
		 else if(type.equalsIgnoreCase("eletric"))
			 return  new EletricBike();
		 else
			 throw  new IllegalArgumentException("Invalid bike type");
	}
}
