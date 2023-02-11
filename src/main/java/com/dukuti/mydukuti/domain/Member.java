package com.dukuti.mydukuti.domain;

import lombok.Data;

@Data
public class Member {
	private String name;
	private int number;
	private String address;
	
	public Member() {}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
