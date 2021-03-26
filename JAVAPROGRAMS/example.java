package com.ltts;

abstract class example {
abstract void displayInfo();
void showInfo()
{
	System.out.println("concrete method");
}
}

class test extends example
{

	void displayInfo() {
		System.out.println();
		// TODO Auto-generated method stub
		
	}

}

/*public class DemoInheritence
{
	public static void main(String[] args) {
		
	}
}*/