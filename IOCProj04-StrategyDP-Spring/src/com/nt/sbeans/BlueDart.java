//BlueDart.java(dependent class1)
package com.nt.sbeans;


import org.springframework.stereotype.Component;

@Component("bDart")
public final class BlueDart implements ICourier {

public BlueDart() {
		System.out.println("BlueDart:: 0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {    //oid is order id
		
		return "BlueDart courier is ready to deliver" + oid + "order number products";
	}

}
