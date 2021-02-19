package com.example.demo.services;

import java.util.List;

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

	public List<Cow> getCows() {
		// this will get all the cows
		return cowRepository.findAll();
	}

	public List<Cow> findCow(int id) {
		List <Cow> cowOptional = cowRepository.findCowByTagNumber(id);
		if(cowOptional.isEmpty()) {
			throw new IllegalStateException("no animals with that tag number found");
		}
		
		return cowOptional;
	}

}
