package com.dukuti.mydukuti.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dukuti.mydukuti.criteria.DukutiCriteria;
import com.dukuti.mydukuti.domain.Member;
import com.dukuti.mydukuti.handlers.CreateDukutiHandler;

@RestController
@RequestMapping(value = {"/api/v1/dukuti"})

public class DukutiController {
	
	@Autowired
	private CreateDukutiHandler createDukutiHandler;
	
	@PostMapping(value="/createDukuti")
	public String createDukuti(@RequestBody DukutiCriteria criteria ) {
		return this.createDukutiHandler.handleCreateRequest(criteria.getData());
		
	}
	
	@PostMapping(value="/addMember")
	public String addMember(@RequestBody Member member ) {
		return this.createDukutiHandler.handleAddMember(member);
		
	}
	
	
	@GetMapping(value="/getDukutiName")
	public String getDukutiName() {
		return "myDukuti";
	}
	
	@GetMapping(value="/getMembers")
	public List<Member> getMembers(){
		List<Member> members = new ArrayList<Member>();
		return members;
	}
	
	

}
