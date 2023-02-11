package com.dukuti.mydukuti.domain;

import java.util.List;

import lombok.Data;

@Data
public class Dukuti {
	
	private String dukutiName;
	private String startDate;
	private String endDate;
	private String dueDate;
	private List<Member> member;
	
	public String getDukutiName() {
		return dukutiName;
	}
	public void setDukutiName(String dukutiName) {
		this.dukutiName = dukutiName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getDueDate() {
		return dueDate;
	}
	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}
	public List<Member> getMember() {
		return member;
	}
	public void setMember(List<Member> member) {
		this.member = member;
	}
	
}
