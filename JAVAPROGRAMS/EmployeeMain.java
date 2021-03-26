package com.ltts;


import java.util.ArrayList;
import java.util.Collections;

 class employee  implements Comparable<employee>{
	private int EmpId;
	private String EmployeeName;
	private float salary;
	
	public employee( int EmpId,String EmployeeName,float salary)
	{
		this.EmpId=EmpId;
		this.EmployeeName=EmployeeName;
		this.salary=salary;
	}

	public int getEmpId() {
		return EmpId;
	}

	public void setEmpId(int empId) {
		EmpId = empId;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public int compareTo(employee e) {
		return(EmployeeName.compareTo(e.EmployeeName));
	}
}



public class EmployeeMain {
	public static void main(String[] args)
	{
		ArrayList<employee> a=new ArrayList<employee>();
		a.add(new employee(1,"arun",12000));
		a.add(new employee(2,"ajay",11500));
		a.add(new employee(3,"akash",9000));
		a.add(new employee(4,"arjun",18000));
		a.add(new employee(5,"abhi",15000));
		for(employee e:a)
		{
			System.out.println("ID:"+e.getEmpId());
			System.out.println("Employee Name:"+e.getEmployeeName());
			System.out.println("Salary:"+e.getSalary());
		}
		
		Collections.sort(a);
		System.out.println("\n------------After Sorting---------");
		for(employee e:a)
		{
			System.out.println("ID:"+e.getEmpId());
			System.out.println("Employee Name:"+e.getEmployeeName());
			System.out.println("Salary:"+e.getSalary());
		}
	}

}
