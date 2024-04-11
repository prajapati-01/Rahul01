package com.nt.factory;

import com.nt.comps.BlueDart;
import com.nt.comps.DTDC;
import com.nt.comps.Flipkart;
import com.nt.comps.ICourier;


public class FlipkartFactory {
	
	//static factory method
	public static Flipkart getInstance(String courierType) {
		//create one of the dependent class obj based on the given courier type
		ICourier courier=null;
		  if(courierType.equalsIgnoreCase("dtdc"))
			  courier= new DTDC();
		  else if(courierType.equalsIgnoreCase("bDart"))
			  courier=new BlueDart();
		  else 
			  throw new IllegalArgumentException("invalid courier type");
		  //create the target class object 
		  Flipkart fpkt=new Flipkart();
		  fpkt.setCourier(courier); //assiging the dependent to target
		  return fpkt;
	}

}
