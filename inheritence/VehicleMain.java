package com.ltts;

import java.util.Scanner;

public class VehicleMain
{
	public static void main(String[] args) 
	{
		vehicle v=new vehicle();
		Twowheeler t=new Twowheeler();
		Fourwheeler f=new Fourwheeler();
		
		
		System.out.println("1.Fourwheeler\r\n 2. twowheeler");
		System.out.println("enter vehicle type");
		int x = 0;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		
		
		int z;
		switch (x)
		{
		case 1: 
			
			/*v.setMake("***VOlvo***");
			v.setVehiclenumber("TN01BR9689");
			v.setFueltype("diesel");
			v.setFuelcapacity(40);
			v.setCc(1960);
			f.setAudioSystem("Beats");
			f.setNumberOfDoors(5);*/
			System.out.println("Vehicle Make:");
			v.setMake(sc.next());
			System.out.println("Vehicle Number:");
			v.setVehiclenumber(sc.next());
			System.out.println("Fuel Type:");
			System.out.println("1:petrol \r\n 2:diesel");
			Scanner s=new Scanner(System.in);
			z=sc.nextInt();
			switch (z)
			{
			case 1:v.setFueltype("petrol");
			break;
			case 2:v.setFueltype("diesel");
			break;
			}
			System.out.println("Fuel Capacity: ");
			v.setFuelcapacity(sc.nextInt());
			System.out.println("cc:");
			v.setCc(sc.nextInt());
			System.out.println("Audio System: ");
			f.setAudioSystem(sc.next());
			System.out.println("NumberOfDoors");
			f.setNumberOfDoors(sc.nextInt());
			
			
			v.displaymake();
			System.out.println("__displayBasicInfo__");
			v.displayBasicInfo();
			System.out.println("__displayDetailInfo__");
			f.displayDetailInfo();
		break;
		case 2: 
			/*v.setMake("suzuki");
			v.setVehiclenumber(":TN60Z1234 ");
			v.setFueltype("petrol");
			v.setFuelcapacity(15);
			v.setCc(150);
			t.setKickStartAvailable(true);*/
			System.out.println("Vehicle Make:");
			v.setMake(sc.next());
			System.out.println("Vehicle Number:");
			v.setVehiclenumber(sc.next());
			System.out.println("Fuel Type:");
			System.out.println("1:petrol \r\n 2:diesel");
			Scanner s1=new Scanner(System.in);
			z=s1.nextInt();
			switch (z)
			{
			case 1:v.setFueltype("petrol");
			break;
			case 2:v.setFueltype("diesel");
			break;
			}
			System.out.println("Fuel Capacity: ");
			v.setFuelcapacity(sc.nextInt());
			System.out.println("cc:");
			v.setCc(sc.nextInt());
			System.out.println("KickStartAvailable");
			t.setKickStartAvailable(true);
			
			v.displaymake();
			System.out.println("__displayBasicInfo__");
			v.displayBasicInfo();
			System.out.println("__displayDetailInfo__");
			t.displayDetailInfo();
		break;
		}
		
		
	}

	
}
