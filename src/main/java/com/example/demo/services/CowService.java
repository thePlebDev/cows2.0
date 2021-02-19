package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Cow;
import com.example.demo.repository.CowRepository;


@Service
public class CowService {
	private CowRepository cowRepository;
	
	@Autowired
	public CowService(CowRepository cowRepository) {
		this.cowRepository = cowRepository;
	}
	
	public Cow addCow(Cow cow) {
		// this should save our cow to the database
		return cowRepository.save(cow);
	}

}
