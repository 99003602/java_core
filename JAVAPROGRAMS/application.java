package com.ltts;

import java.util.ArrayList;
import java.util.Scanner;

public class application {
	public static void main(String[] args) {
		Scanner ch=new Scanner(System.in);
		ArrayList<String> a=new ArrayList<String>();
		System.out.println("enter the number of key words");
		int n=ch.nextInt();
		for(int i=0;i<n;i++)
		{
		a.add(ch.next());
		}
		
	}
	
}
