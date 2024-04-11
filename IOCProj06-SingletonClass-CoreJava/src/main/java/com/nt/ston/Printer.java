package com.nt.ston;

public class Printer {
	//private static ref variable to that single obj
	private static Printer INSTANCE;
	
	private Printer() {
		System.out.println("Printer:: 0-param constructor");
	}
	
	//public static factory method having singleton logic
	public static Printer getInstance() {
		//singleton logic 
		if(INSTANCE==null)
			INSTANCE= new Printer();
		return INSTANCE;
			
		
	}
	
	public void printMessage(String msg) {
		System.out.println(msg);
	}

}
