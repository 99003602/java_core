package exceptions;

import java.util.Scanner;

public class exception2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try
		{
		System.out.println("enter thre number of overs");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("enter number of runs scored in each over");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the over numvber");
		int on=sc.nextInt()-1;
		System.out.println("runs scored in this over = "+arr[on]);
		}
		catch(Exception e)
		{
		    System.out.println(e.getClass());
		}
		
		}
	
}
