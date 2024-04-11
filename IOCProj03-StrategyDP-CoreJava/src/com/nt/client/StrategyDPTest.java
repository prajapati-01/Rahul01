package com.nt.client;

import com.nt.comps.Flipkart;
import com.nt.factory.FlipkartFactory;

public class StrategyDPTest {

	public static void main(String[] args) {
		Flipkart fpkt=FlipkartFactory.getInstance("dtdc");
		String resultMsg=fpkt.shopping(new String[] {"shirt","trouser"},
				new double[] {2000.0,5000.0});
		System.out.println( resultMsg );

	}

}
