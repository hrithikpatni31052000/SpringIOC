package com.psl.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile 
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("Config loaded");
		//Airtel air = (Airtel)context.getBean("airtel");
		//air.calling();
		//air.data();
		
		//Airtel air = context.getBean("airtel" , Airtel.class);
		//air.calling();
		//air.data();
		
		Sim sim =context.getBean("sim" , Sim.class);
		sim.calling();
		sim.data();
	}
}
