package com.ltts;

import java.util.Scanner;

public class Demoif {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the candidate age");
	int age=sc.nextInt();
	if(age>=18)
	{
		System.out.println("eligible for voting");
	}
}
}
