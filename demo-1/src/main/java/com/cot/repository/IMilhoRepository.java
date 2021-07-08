package com.cot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cot.domain.Milho;



@Repository
public interface IMilhoRepository extends JpaRepository<Milho, Long>{
	
	

}
