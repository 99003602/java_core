package com.ltts;

import java.util.Scanner;

public class Demoswitch {
	public static void main(String[] args) {
		
		Scanner df=new Scanner(System.in);
		System.out.println("enter number");
		int x=df.nextInt();
		switch (x) {
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("tuesday");
			break;
		case 4:
			System.out.println("wednesday");
			break;
		case 5:
			System.out.println("thursday");
			break;
		case 6:
			System.out.println("friday");
			break;
		case 7:
			System.out.println("saturday");
			break;
		default:
			System.out.println("error");
		}
	
}
}