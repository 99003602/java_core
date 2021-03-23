package com.ltts;

import java.util.Scanner;

public class HotelRoomMain {


public static void main(String[] args) {
	
	DeluxeRoom d=new DeluxeRoom("taj", 3200, true, true);
	DeluxeACRoom a=new DeluxeACRoom("akshaya", 3200, true, true);
	SuiteACRoom s=new SuiteACRoom("surabhi", 3200, false, true);
	
	System.out.println("1:DeluxeRoom\r\n2:DeluxeACRoom\r\n3:SuiteACRoom");
	Scanner sc=new Scanner(System.in);
	int x = sc.nextInt();
	switch (x)
	{
	case 1:
		System.out.println(d.getHotelname());
		System.out.println(d.getNumberOfSqFeet());
		System.out.println("Room cost:"+d.CalculateTariff(d.getRatePerSqFeet()));
		break;
	case 2:System.out.println(a.getHotelname());
	System.out.println(a.getNumberOfSqFeet());
	System.out.println("Room cost:"+a.CalculateTariff(a.ratePerSqFeet));
	break;
	case 3:System.out.println(s.getHotelname());
	System.out.println(s.getNumberOfSqFeet());
	System.out.println("Room cost:"+s.CalculateTariff(s.getRatePerSqFeet()));
	break;
		

}
}}
