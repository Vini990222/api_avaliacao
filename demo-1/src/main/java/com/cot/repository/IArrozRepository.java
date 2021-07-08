package com.cot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cot.domain.Arroz;



@Repository
public interface IArrozRepository extends JpaRepository<Arroz, Long>{
	
	
}
