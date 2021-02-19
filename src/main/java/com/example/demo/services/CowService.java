package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.models.Cow;
import com.example.demo.repository.CowRepository;

public class CowService {
	private CowRepository cowRepository;
	
	@Autowired
	public CowService(CowRepository cowRepository) {
		this.cowRepository = cowRepository;
	}
	
	public void addCow(Cow cow) {
		// this should save our cow to the database
		cowRepository.save(cow);
	}

}