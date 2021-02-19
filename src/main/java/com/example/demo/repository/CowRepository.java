package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.models.Cow;

public interface CowRepository extends JpaRepository<Cow,Long>{
	
	// SELECT * FROM COW WHERE tagNumber = ?1
	@Query("SELECT c FROM Cow c WHERE c.tagNumber = ?1")
	List<Cow> findCowByTagNumber(int tagNumber);
	
	

}
