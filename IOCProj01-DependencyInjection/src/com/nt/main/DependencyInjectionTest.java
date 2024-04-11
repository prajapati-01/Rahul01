//DependencyInjectionTest.java
package com.nt.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.nt.config.AppConfig;
import com.nt.sbeans.WishMessageGenerator;

public class DependencyInjectionTest {

	public static void main(String[] args) {
		//create IOC container 
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	/*	
     	//get Target spring bean class obj from the container
		Object obj = ctx.getBean("wmg"); //here obj (Object class ref variable) is refering WishMessageGenerator class obj
		//type casting to WishMessageGenerator class
		WishMessageGenerator generator = (WishMessageGenerator)obj;*/
		
		//get Target spring bean class obj from the container
		WishMessageGenerator generator = ctx.getBean("wmg",WishMessageGenerator.class); //get bean with generics
		
		//invoke b.method
		String resultMsg=generator.showWishMessage("Rahul");
		System.out.println(resultMsg);
		
		//close the container
		ctx.close();
	
	}

}
