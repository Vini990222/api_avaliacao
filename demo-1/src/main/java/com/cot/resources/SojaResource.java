package com.cot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cot.domain.Soja;
import com.cot.repository.ISojaRepository;


public class SojaResource {
	//repository tem os métodos CRUD.
	//importar refs. ctrl + SHIFT + o.

	

	@Autowired //injeção de dependência do nosso repository
	private ISojaRepository repository;
	
	
	@GetMapping
	public ResponseEntity<List<Soja>> listSoja() {
		return ResponseEntity.
				status(HttpStatus.OK).
				body(repository.findAll());
	}
	
	@PostMapping()
	public void salvarSoja(@RequestBody Soja s ) {
		repository.save(s);
	}
}