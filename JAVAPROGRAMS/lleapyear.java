package com.ltts;

import java.util.Scanner;

public class lleapyear {
	
		
		static int checkLeapYear(int y)
		{
			if(y>0)
			{
				if(y%4==0)
				{
					

					return 1;
				
				}
				
				return 0;
			}
			
		return -1;
		
		
		}
		public static void main(String[] args) {

			int year;
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the year");
			year=sc.nextInt();
			int a=checkLeapYear(year);
			if(a==1)
			{
				System.out.println("yes");
			}
			else if(a==0)
			{
				System.out.println("no");
			}
			else
			{
				System.out.println("invalid input");
			}
		}
		
	}


