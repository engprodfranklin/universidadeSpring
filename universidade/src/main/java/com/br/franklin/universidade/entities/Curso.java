package com.br.franklin.universidade.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;

@Entity
@Table(name = "tb_curso")
public class Curso implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigodocurso;
	
	@Column(length = 50, nullable = true)
	private String nomecurso;
	
	@Column(length = 5)
	private Integer duracaocurso;
	
	@Column(length = 20)
	private String datapublicacao;
	
	public Curso() {}

	public Integer getCodigodocurso() {
		return codigodocurso;
	}

	public void setCodigodocurso(Integer codigodocurso) {
		this.codigodocurso = codigodocurso;
	}

	public String getNomecurso() {
		return nomecurso;
	}

	public void setNomecurso(String nomedocurso) {
		this.nomecurso = nomedocurso;
	}

	public Integer getDuracaocurso() {
		return duracaocurso;
	}

	public void setDuracaocurso(Integer duracaocurso) {
		this.duracaocurso = duracaocurso;
	}

	public String getDatapublicacao() {
		return datapublicacao;
	}

	public void setDatapublicacao(String datapublicacao) {
		this.datapublicacao = datapublicacao;
	}

}
