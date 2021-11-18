package com.psl.ioc;

public class Jio implements Sim
{
	@Override
	public void calling()
	{
		System.out.println("Calling using jio");
	}
	
	@Override
	public void data()
	{
		System.out.println("Browsing internet using jio");
	}

}
