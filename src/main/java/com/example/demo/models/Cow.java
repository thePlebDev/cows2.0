package com.example.demo.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Cow {

	@Id
	@GeneratedValue//specifies that this is going to be a auto generated value;
	private Long id;
	
	private int tagNumber;
	private String details;
	
	
	public Cow(int tagNumber, String details) {
		this.tagNumber = tagNumber;
		this.details = details;
	}
	public Cow() {}
	
	
	public int getTagNumber() {
		return tagNumber;
	}
	public void setTagNumber(int tagNumber) {
		this.tagNumber = tagNumber;
	}
	
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	
	
}
