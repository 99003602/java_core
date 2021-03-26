package com.ltts;

class InvalidAgeException extends Exception
{
	InvalidAgeException()
	{
	System.out.println("you are under below age");
	}
}

public class userexception {
public static void main(String[] args) throws InvalidAgeException{
	int age=17;
	if(age>=18)
	{
		throw new InvalidAgeException();
		
	}
	else
	{
		System.out.println("candidate eligible for vote");
	}
}
}
