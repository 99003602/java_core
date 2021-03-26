package com.ltts;

import java.util.ArrayList;
import java.util.Iterator;

public class Democollection {
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(10);
		a.add(10);
		a.add(10);;
		//System.out.println(a);
		Iterator i= a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}

}
