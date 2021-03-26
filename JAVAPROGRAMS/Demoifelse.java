package com.ltts;

import java.util.Scanner;

public class Demoifelse {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);

	
	System.out.println("enter the candidate age");
	int age=sc.nextInt();
	if(age>=18)
	{
		System.out.println("eligible for voting");
	}
	else if(age<8)
	{
		System.out.println("too young");
	}
		else
		{
			System.out.println("not eligibile");
		}
}
}

