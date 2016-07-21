package com.capgemini.gestorproyectos.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.capgemini.gestorproyectos.util.JSONDateDeserializer;
import com.capgemini.gestorproyectos.util.JSONDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class EntregaDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idEntrega",unique=true)
	private int idEntrega;
	private  Date fechaEntrega;
	private String comentarios;
	private ProyectoDTO proyecto;
	public int getIdEntrega() {
		return idEntrega;
	}
	public void setIdEntrega(int idEntrega) {
		this.idEntrega = idEntrega;
	}
	@JsonSerialize(using=JSONDateSerializer.class)
	public Date getFechaEntrega() {
		return fechaEntrega;
	}
	@JsonDeserialize(using=JSONDateDeserializer.class)
	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}
	public String getComentarios() {
		return comentarios;
	}
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	public ProyectoDTO getProyecto() {
		return proyecto;
	}
	public void setProyecto(ProyectoDTO proyecto) {
		this.proyecto = proyecto;
	}
	public EntregaDTO(int idEntrega, Date fechaEntrega, String comentarios, ProyectoDTO proyecto) {
		super();
		this.idEntrega = idEntrega;
		this.fechaEntrega = fechaEntrega;
		this.comentarios = comentarios;
		this.proyecto = proyecto;
	}
	public EntregaDTO(){}
	

}
