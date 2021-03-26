package exceptions;

import java.util.Scanner;

class CustomException extends Exception
{
    CustomException()
    {
        System.out.println("CustomException: InvalidAgeRangeException");
    }
}

public class exception3
{
	public static void main(String[] args) throws CustomException
	{
	    String name;
	    int age;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the player name");
	    name=sc.next();
	    System.out.println("enter the player age");
	    age=sc.nextInt();
	    if(age<19)
	    {
	    	throw new CustomException();
	    }
	    else
	    {
	    	System.out.println("name: "+name);
	    	System.out.println("age: "+age);
	    }
	    
	}
}

