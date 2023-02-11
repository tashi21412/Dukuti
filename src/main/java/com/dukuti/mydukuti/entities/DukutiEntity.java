package com.dukuti.mydukuti.entities;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name="DUKUTI")
public class DukutiEntity {

	@Id
	@Column(name="ID")
	private String dukutiGroupId;
	
	@Column(name="DUKUTI_GRP_NM")
	private String dukutiGroupName;
	
	@Column(name="START_DATE")
	private String startDate;
	
	@Column(name="END_DATE")
	private String endDate;
	
	//@JoinColumn(name)
	
	
}
