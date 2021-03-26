package com.ltts;

class Parent1
{
	void display1()
	{
		System.out.println("parent 1");
	}
}
interface Parent2
{
	void display2();//abstract method
}

class child extends Parent1 implements Parent2
{
	public void display2()
	{
		System.out.println("implemented");
	}
}


public class Demoinheriteencr 
{
	public static void main(String[] args) 
	{
		child c=new child();
		c.display1();
		c.display2();
	}
 
}
