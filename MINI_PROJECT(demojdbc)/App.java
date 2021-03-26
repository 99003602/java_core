package com.ltts.demojdbc;

import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final String QUERY = "select empid,empname from employee where empid =?";
	private static final String DELETE_EMPLOYEE_SQL = "delete from employee where empid = ?;";
    public static void main( String[] args ) throws SQLException, ClassNotFoundException
    {
    	Class.forName("com.mysql.jdbc.Driver");
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/chandan","root","1234");
    	while(true)
    	{
    	Scanner sc=new Scanner(System.in);
    	System.out.println("1.create\n2.read\n3.update\n4.delete");
    	int n=sc.nextInt();
    	
    			
    	switch (n)
    	{
    	case 1:
    		//  PreparedStatement st=con.prepareStatement("insert into employee values(?,?)");
    		
       // st.execute("create table student(studentid int(3),studentname varchar(10))");
    		/*  Statement se=con.createStatement();
    	      se.execute("create table employee(empid int(3),empname varchar(10))");*/
    	
        	
        PreparedStatement st=con.prepareStatement("insert into employee values(?,?)");
        System.out.println("enter the number of employees");
        int k=sc.nextInt();
        for(int j=0;j<k;j++)
        {
        System.out.println("enter the employee id");
        int i=sc.nextInt();
    	st.setInt(1, i );
    	 System.out.println("enter the employee name");
         String s=sc.next();
    	st.setString(2, s);
        System.out.println("table is created");
    	st.executeUpdate();
    	 }
        break;
    	case 2:
    		
    		PreparedStatement st1 = con.prepareStatement(QUERY); 
    		System.out.println("enter the id ");
    		int l=sc.nextInt();
            st1.setInt(1, l);
            System.out.println(st1);
            
            
       
   	    ResultSet rs = st1.executeQuery();
   	 
        while (rs.next()) {
       	 
            int empid = rs.getInt("empid");
            String empname = rs.getString("empname");
           
            System.out.println(empid + "," + empname + ",");
        }
        break;
        
        case 3:
            PreparedStatement st12=con.prepareStatement("insert into employee values(?,?)");
            System.out.println("enter the employee id");
            int i=sc.nextInt();
        	st12.setInt(1, i );
        	 System.out.println("enter the employee name");
             String s=sc.next();
        	st12.setString(2, s);
            System.out.println("table is updated");
        	st12.executeUpdate();
        	 
           
        	break;
        case 4:
        	PreparedStatement st11 = con.prepareStatement(DELETE_EMPLOYEE_SQL);
        	System.out.println("enter the id to delete");
        	int d=sc.nextInt();
            st11.setInt(1, d);
            // Step 3: Execute the query or update query
            int result = st11.executeUpdate();
            System.out.println("Number of records affected :: " + result);
            break;
            
         default:
        	 System.out.println("choice is incorrect");
        	 break;
       
        	 
        	
        }
    	}
    	}
    	//creating table
    //static Statement st=con.createStatement();
       // st.execute("create table employee(empid int(3),empname varchar(10))");
    	
    	
    //	st.execute("create table student(studentid int(3),studentname varchar(10))");
    	/*PreparedStatement st=con.prepareStatement("insert into employee values(?,?)");
    	
    	st.setInt(1, 002);
    	st.setString(2, "suresh");
    	st.executeUpdate();*/
    	
        //System.out.println("table is created");
      //  st.executeUpdate("insert into student values(001,'ramesh')");
        //System.out.println("rcord is created");
        //st.executeUpdate("insert into student values(102,'chandan')");
	   
}



//insert into student values(101,'ajayreddy');
