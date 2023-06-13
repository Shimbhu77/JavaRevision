package com.OOPs.Encapsulation;

public class Person {

	private String name;
	private int age;
	private boolean isMarried;

	public void setName(String name)
	{
		this.name=name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setIsMarried(boolean value)
	{
		this.isMarried=value;
	}
	
	public boolean getIsMarried()
	{
		return isMarried;
	}
	
	
}

