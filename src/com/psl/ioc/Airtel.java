package com.psl.ioc;

public class Airtel implements Sim
{
	@Override
	public void calling()
	{
		System.out.println("Calling using airtel");
	}
	
	@Override
	public void data()
	{
		System.out.println("Browsing internet using airtel");
	}

}
