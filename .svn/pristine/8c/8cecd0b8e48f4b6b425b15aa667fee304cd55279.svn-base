package com.capgemini.gestorproyectos.model;

import java.io.Serializable;
import java.util.Date;

import com.capgemini.gestorproyectos.util.JSONDateDeserializer;
import com.capgemini.gestorproyectos.util.JSONDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class estimacionDTO implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
long id;
ProyectoDTO proyecto;
Date fechaRealizacion;
PersonaDTO estimadoPor;
String comentarios;
public estimacionDTO(long id, ProyectoDTO proyecto, Date fechaRealizacion, PersonaDTO estimadoPor, String comentarios) {
	super();
	this.id = id;
	this.proyecto = proyecto;
	this.fechaRealizacion = fechaRealizacion;
	this.estimadoPor = estimadoPor;
	this.comentarios = comentarios;
}
public estimacionDTO()
{
	
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public ProyectoDTO getProyecto() {
	return proyecto;
}
public void setProyecto(ProyectoDTO proyecto) {
	this.proyecto = proyecto;
}
@JsonSerialize(using=JSONDateSerializer.class)
public Date getFechaRealizacion() {
	return fechaRealizacion;
}
@JsonDeserialize(using=JSONDateDeserializer.class)
public void setFechaRealizacion(Date fechaRealizacion) {
	this.fechaRealizacion = fechaRealizacion;
}
public PersonaDTO getEstimadoPor() {
	return estimadoPor;
}
public void setEstimadoPor(PersonaDTO estimadoPor) {
	this.estimadoPor = estimadoPor;
}
public String getComentarios() {
	return comentarios;
}
public void setComentarios(String comentarios) {
	this.comentarios = comentarios;
}
}
