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

import com.br.franklin.universidade.entities.Curso;
import com.br.franklin.universidade.repositories.CursoRepository;

@RestController
@RequestMapping(value = "/Curso")
public class CursoController {

	@Autowired
	private CursoRepository cursoRepository;
	
	@GetMapping
	public ResponseEntity<List<Curso>> findAll(){
		List<Curso> lista = cursoRepository.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{codigodocurso}")
	public ResponseEntity<Curso> findById(@PathVariable Integer codigodocurso){
		Curso result = cursoRepository.findById(codigodocurso).get();
		return ResponseEntity.ok().body(result);
	}
	
	@PostMapping
	public ResponseEntity<Curso> Insert(@RequestBody Curso curso) {
		Curso inserir = cursoRepository.save(curso);
		return ResponseEntity.ok().body(inserir);
	}
	
	@DeleteMapping(value = "/{codigodocurso}")
	public void deleteById(@PathVariable Integer codigodocurso) {
		if (cursoRepository.existsById(codigodocurso)) {
			cursoRepository.deleteById(codigodocurso);
		}
	}
	
	@DeleteMapping
	public void deleteAll(@RequestBody Curso curso) {
		cursoRepository.delete(curso);
	}
	
	@PutMapping
	public ResponseEntity<Curso> update(@RequestBody Curso curso){
		Curso atualizar = cursoRepository.save(curso);
		return ResponseEntity.ok().body(atualizar);
	}

}
