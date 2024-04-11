package com.nt.comps;

public final class DTDC implements ICourier {

	public DTDC() {
		System.out.println("DTDC:: 0-param constructor");
	}
	
	@Override
	public String deliver(int oid) {
		
		return "DTDC courier is ready to deliver " + oid + " order number products";
	}

}
