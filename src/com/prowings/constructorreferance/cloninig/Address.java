package com.prowings.constructorreferance.cloninig;

public class Address implements Cloneable{

	private int hNo;
	private String city;
	
	public Address() {
		super();
 	}

	public Address(int hNo, String city) {
		super();
		this.hNo = hNo;
		this.city = city;
	}

	public int gethNo() {
		return hNo;
	}

	public void sethNo(int hNo) {
		this.hNo = hNo;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [hNo=" + hNo + ", city=" + city + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
 		return super.clone();
	}
	

	
	
	
}
