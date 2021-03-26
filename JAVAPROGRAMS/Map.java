package com.ltts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class Map {
	public static void main(String[] args) {
		HashMap<String,String> h=new HashMap<String,String>();
	
		
		Scanner s=new Scanner(System.in);
		Scanner ch=new Scanner(System.in);
		System.out.println("create hashmap");
     
		System.out.println("enter the number of keys");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
		System.out.println("enter the key "+i);
		String keys=s.next();
		System.out.println("enter the value "+i);
		String val=ch.next();
		h.put(keys, val);
		}
       
       while(true)
       {
	    System.out.println("1.read\n2.update\n3.delete");
		Scanner sc=new Scanner(System.in);
	    int i=sc.nextInt();
	    switch (i)
	    {
	    case 1:
	    	 for (HashMap.Entry<String,String> entry : h.entrySet())
	             System.out.println("Key = " + entry.getKey() +
	                              ", Value = " + entry.getValue());
	    	// System.out.println("\n"+h);
	    	 break;
	   
	    case 2:
	    	System.out.println("enter the key to update");
	        String key=sc.next();
	        System.out.println("enter value to update");
	        String value=sc.next();
	        h.put(key, value);
	        break;
	  
	    case 3:
	    	System.out.println("enter the key to delete");
	    	String keyy=sc.next();
	    	//System.out.println("enter value to update");
		    // String valu=sc.next();
		    h.remove(keyy);
		    break;
		
	    default :
			System.out.println("invalid input");
			break;
	     }
		}
	}
}
