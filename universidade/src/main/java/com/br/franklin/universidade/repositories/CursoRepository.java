package com.br.franklin.universidade.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.franklin.universidade.entities.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer>{

}
