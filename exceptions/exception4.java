package exceptions;

import java.util.ArrayList;
import java.util.Scanner;

class TeamNameNotFoundCustomException extends Exception
{
	TeamNameNotFoundCustomException()
	{
		System.out.println("TeamNameNotFoundCustomException: Entered team is not a part of IPL Season 13");
	}
}
public class exception4 {
	public static void main(String[] args) throws TeamNameNotFoundCustomException 
	{
		ArrayList<String> a=new ArrayList<String>();
		a.add("Royal Challengers Bengaluru");
		a.add("Delhi Capitals");
		a.add("Mumbai Indians");
		a.add("Rajasthan Royals");
		a.add("Kolkata Knight Riders");
		a.add("Kings XI Punjab");
		a.add("Sun Risers Hyderabad");
		a.add("Chennai Super Kings");
		System.out.println("Enter the expected winner team of IPL Season 13");
		Scanner sc1=new Scanner(System.in);
		String wt=sc1.nextLine();
		if(!(a.contains(wt)))
		{
		    throw new TeamNameNotFoundCustomException();
		}
		System.out.println("Enter the expected runner Team of IPL Season 13:");
		String rt=sc1.nextLine();
		if(!(a.contains(rt)))
		{
		    throw new TeamNameNotFoundCustomException();
		}
	
		System.out.println("Expected IPL Season 13 winner: "+wt);
		System.out.println("Expected IPL Season 13 runner: "+rt);
		}
		
		
		
	}
	


