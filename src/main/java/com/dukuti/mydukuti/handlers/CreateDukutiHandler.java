package com.dukuti.mydukuti.handlers;

import org.springframework.stereotype.Component;

import com.dukuti.mydukuti.domain.Dukuti;
import com.dukuti.mydukuti.domain.Member;

import lombok.Data;

@Data
@Component
public class CreateDukutiHandler {
	public String handleCreateRequest(Dukuti dukuti) {
		return dukuti.getDukutiName();
	}

	public String handleAddMember(Member member) {
		// TODO Auto-generated method stub
		
		return "Added";
	}
}
