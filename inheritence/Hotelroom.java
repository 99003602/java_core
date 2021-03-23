package com.ltts;

class HotelRoom {
	protected String hotelname;
	protected int numberOfSqFeet;
	protected boolean hasTV ;
	protected boolean hasWifi;
	
	public String getHotelname() {
		return hotelname;
	}

	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}

	public int getNumberOfSqFeet() {
		return numberOfSqFeet;
	}

	public void setNumberOfSqFeet(int numberOfSqFeet) {
		this.numberOfSqFeet = numberOfSqFeet;
	}

	public boolean isHasTV() {
		return hasTV;
	}

	public void setHasTV(boolean hasTV) {
		this.hasTV = hasTV;
	}

	public boolean isHasWifi() {
		return hasWifi;
	}

	public void setHasWifi(boolean hasWifi) {
		this.hasWifi = hasWifi;
	}

	public HotelRoom(String hotelname,int numberOfSqFeet,boolean hasTV,boolean hasWifi)
	{
		this.hotelname=hotelname;
		this.numberOfSqFeet=numberOfSqFeet;
		this.hasTV=hasTV;
		this.hasWifi=hasWifi;
	}
	
	public int CalculateTariff(int rpsf) {
		return numberOfSqFeet*rpsf;
	}
	
}

class  DeluxeRoom extends HotelRoom{
	protected int  ratePerSqFeet;

	public DeluxeRoom(String hotelname,int numberOfSqFeet,boolean hasTV,boolean hasWifi) {
		super(hotelname,numberOfSqFeet,hasTV,hasWifi);
		// TODO Auto-generated constructor stub
		ratePerSqFeet=10;
	}
	public int getRatePerSqFeet()
	{
		if(this.hasWifi)
			return(this.ratePerSqFeet+2);
		else
			return(this.ratePerSqFeet);
	}
}

class  DeluxeACRoom extends HotelRoom
{
	protected int ratePerSqFeet;

	public DeluxeACRoom(String hotelname, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelname, numberOfSqFeet, hasTV, hasWifi);
		// TODO Auto-generated constructor stub
		 ratePerSqFeet = 12;

	}}

class  SuiteACRoom extends HotelRoom
{
	private int ratePerSqFeet;
	
	public SuiteACRoom(String hotelname, int numberOfSqFeet, boolean hasTV, boolean hasWifi) {
		super(hotelname, numberOfSqFeet, hasTV, hasWifi);
		// TODO Auto-generated constructor stub
		ratePerSqFeet = 15;
	}
	public int getRatePerSqFeet()
	{
		if(this.hasWifi)
			return(this.ratePerSqFeet+2);
		else
			return(this.ratePerSqFeet);
	}
	
}

