package com.ltts;

import java.util.Scanner;



class vehicle {
	protected String make;
	protected String vehiclenumber;
	protected String fueltype;
	protected int fuelcapacity;
	protected int cc;
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getVehiclenumber() {
		return vehiclenumber;
	}
	public void setVehiclenumber(String vehiclenumber) {
		this.vehiclenumber = vehiclenumber;
	}
	public String getFueltype() {
		return fueltype;
	}
	public void setFueltype(String fueltype) {
		this.fueltype = fueltype;
	}
	public int getFuelcapacity() {
		return fuelcapacity;
	}
	public void setFuelcapacity(int fuelcapacity) {
		this.fuelcapacity = fuelcapacity;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int i) {
		this.cc = i;
	}
	public void vehicle(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc)
	{
	
	}
	void displaymake()
	{
		System.out.println(make);
	}
	void displayBasicInfo()
	{
		System.out.println("vehiclenumber:"+vehiclenumber);
		System.out.println("fuelcapacity:"+fuelcapacity);
		System.out.println("fueltype:"+fueltype);
		System.out.println("cc:"+cc);
		
	}
	void displayDetailInfo()
	{
	}
}

class Twowheeler extends vehicle
{
	private boolean kickStartAvailable;
	void displayDetailInfo()
	{
		System.out.println(kickStartAvailable);
	}
	public boolean isKickStartAvailable() {
		return kickStartAvailable;
	}
	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}
}

class Fourwheeler extends vehicle{
	private String audioSystem;
	private int numberOfDoors;
	void displayDetailInfo()
	{
		System.out.println(audioSystem);
		System.out.println(numberOfDoors);
	}
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
}


