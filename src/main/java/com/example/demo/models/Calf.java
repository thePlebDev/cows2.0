package com.example.demo.models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

public class Calf {
	
	@Id
	@SequenceGenerator(name="calf_sequence", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="calf_sequence")
	private Long id;
	private int tagNumber;
	private String details;
	
	
	

}
