package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Cow;
import com.example.demo.services.CowService;


@RestController
@RequestMapping(path="api/v1/cow")
public class CowController {
	
	private final CowService cowService;
	
	@Autowired
	public CowController(CowService cowService) {
		this.cowService = cowService;
	}
	
	@PostMapping // this will let us add new cows
	Cow newCow(@RequestBody Cow cow) {
		return cowService.addCow(cow);
	}
	
	@GetMapping // this will return all of the cows
	List<Cow> getAllCows() {
		return cowService.getCows();
	}
	
	@GetMapping("/{id}")
	List <Cow> singleCow(@PathVariable int id) {
		return cowService.findCow(id);
	}
	
	@PutMapping("/{id}")
	

}
