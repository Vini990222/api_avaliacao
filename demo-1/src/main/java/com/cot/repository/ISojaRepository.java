package com.cot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cot.domain.Soja;

@Repository
public interface ISojaRepository extends JpaRepository<Soja, Long>{

}
	
	
