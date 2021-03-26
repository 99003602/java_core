package exceptions;

import java.util.Scanner;

public class exception1 {
	public static void main(String[] args) {
		try
		{
	    Scanner sc=new Scanner(System.in);
		String run=sc.next();
		int runs= Integer.parseInt(run); 
		String over=sc.next();
		int overs= Integer.parseInt(over); 
		float Run_rate=runs/overs;
		System.out.println(Run_rate);
		}
		catch(Exception e)
		{
			System.out.println(e.getClass());
		}
	}
	
}
