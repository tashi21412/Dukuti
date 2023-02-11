package com.dukuti.mydukuti.criteria;

import java.util.List;

import com.dukuti.mydukuti.domain.Dukuti;

import lombok.Data;

@Data
public class DukutiCriteria {
	
	//in data I will send dukuti json object
	private Dukuti data;

	public Dukuti getData() {
		return data;
	}

	public void setData(Dukuti data) {
		this.data = data;
	}
}
