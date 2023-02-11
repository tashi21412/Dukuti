package com.dukuti.mydukuti.entities;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name= "MEMEBER")
public class MemberEntity {
	@Id
	@Column(name="ID")
	private String memberId;
	
	
	@Column(name="NAME")
	private String name;
	
	@Column(name = "NUMBER")
	private String number;
	
	@Column(name = "ADDRESS")
	private String address;
	
}
