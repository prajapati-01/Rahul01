package come.nt.factory;

import com.nt.bike.Bike;
import com.nt.bike.ElectricBike;
import com.nt.bike.SportsBike;
import com.nt.bike.StandardBike;

public class BikeFactory {
	
	//static factory method having factory pattern logic
	public static Bike getBike(String type){
		//create and return one of the Bike class obj based on the given data
		if(type.equalsIgnoreCase("standard"))
			return new StandardBike();
		else if(type.equalsIgnoreCase("sports"))
			return new SportsBike();
		else if(type.equalsIgnoreCase("electric"))
			return new ElectricBike();
		else
			throw new IllegalArgumentException("invalid bike type");
		
	}

}
