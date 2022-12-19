package com.br.franklin.universidade.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.br.franklin.universidade.entities.Aluno;
import com.br.franklin.universidade.repositories.AlunoRepository;

@RestController
@RequestMapping(value = "/Aluno")
public class AlunoController {

	@Autowired
	private AlunoRepository alunoRepository;
	

	@GetMapping
	public ResponseEntity<List<Aluno>> findAll(){
		List<Aluno> lista = alunoRepository.findAll();
	return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{matricula}")
	public ResponseEntity<Aluno> findById(@PathVariable Integer matricula){
		Aluno result = alunoRepository.findById(matricula).get();
	return ResponseEntity.ok().body(result);	
	}
	
	@PostMapping
	public ResponseEntity<Aluno> Insert(@RequestBody Aluno aluno) {
		Aluno inserir = alunoRepository.save(aluno);
		return ResponseEntity.ok().body(inserir);
	}
	
	@DeleteMapping(value = "/{matricula}")
	public void deleteById(@PathVariable Integer matricula){
		if (alunoRepository.existsById(matricula)) {
			alunoRepository.deleteById(matricula);
		}
	}
	
	@DeleteMapping
	public void deleteAll(@RequestBody Aluno aluno) {
		alunoRepository.delete(aluno);
	}
	
	@PutMapping
	public ResponseEntity<Aluno> update(@RequestBody Aluno aluno){
		Aluno atualizar = alunoRepository.save(aluno);
		return ResponseEntity.ok().body(atualizar);
	}
	
}
