package com.eglobal.tramites.entity;
// default package
// Generated 11/01/2021 10:39:43 PM by Hibernate Tools 4.3.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CEstados generated by hbm2java
 */
@Entity
@Table(name = "c_estados")
public class CEstados implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codEstado;
	private String nomEstado;
	private Integer darId;

	

	public CEstados() {
	}

	public CEstados(String codEstado) {
		this.codEstado = codEstado;
	}

	public CEstados(String codEstado, String nomEstado, Integer darId) {
		this.codEstado = codEstado;
		this.nomEstado = nomEstado;
		this.darId = darId;
	}

	@Id
	@Column(name = "cod_estado", unique = true, nullable = false, length = 2)
	public String getCodEstado() {
		return this.codEstado;
	}

	public void setCodEstado(String codEstado) {
		this.codEstado = codEstado;
	}

	@Column(name = "nom_estado", length = 20)
	public String getNomEstado() {
		return this.nomEstado;
	}

	public void setNomEstado(String nomEstado) {
		this.nomEstado = nomEstado;
	}

	@Column(name = "dar_id")
	public Integer getDarId() {
		return this.darId;
	}

	public void setDarId(Integer darId) {
		this.darId = darId;
	}

}
