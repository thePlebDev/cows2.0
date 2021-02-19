package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Cow;
import com.example.demo.services.CowService;


@RestController("/api/v1/cow")
public class CowController {
	
	private final CowService cowService;
	
	@Autowired
	public CowController(CowService cowService) {
		this.cowService = cowService;
	}
	
	@PostMapping
	Cow newCow(@RequestBody Cow cow) {
		return cowService.addCow(cow);
	}

}
