package com.nt.client;

import com.nt.ston.Printer;

public class SingletonDPTest {

	public static void main(String[] args) {
		
		//try to create multiple object by calling static factory methods for multiple time
		Printer printer1 = Printer.getInstance();
		Printer printer2 = Printer.getInstance();
		Printer printer3 = Printer.getInstance();
		System.out.println(printer1.hashCode()+" "+printer2.hashCode()+" "+printer3.hashCode());
		
		System.out.println("printer1==printer2$"+(printer1==printer2));
		System.out.println("printer2==printer3$"+(printer2==printer3));
		

	}

}
