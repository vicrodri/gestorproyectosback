package com.capgemini.gestorproyectos.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import com.capgemini.gestorproyectos.util.JSONDateDeserializer;
import com.capgemini.gestorproyectos.util.JSONDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class pasosDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5L;
	
	FuncionalidadesDTO funcionalidad;
	TareaDTO tarea;
	Date fechaInicio,fechaFin;
	@NotNull
	Boolean finalizada;
	long horasReales,id;
	public FuncionalidadesDTO getFuncionalidad() {
		return funcionalidad;
	}
	public void setFuncionalidad(FuncionalidadesDTO funcionalidad) {
		this.funcionalidad = funcionalidad;
	}
	public TareaDTO getTarea() {
		return tarea;
	}
	public void setTarea(TareaDTO tarea) {
		this.tarea = tarea;
	}
	@JsonSerialize(using=JSONDateSerializer.class)
	public Date getFechaInicio() {
		return fechaInicio;
	}
	@JsonDeserialize(using=JSONDateDeserializer.class)
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	@JsonSerialize(using=JSONDateSerializer.class)
	public Date getFechaFin() {
		return fechaFin;
	}
	@JsonDeserialize(using=JSONDateDeserializer.class)
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}
	public Boolean getFinalizada() {
		return finalizada;
	}
	public void setFinalizada(Boolean finalizada) {
		this.finalizada = finalizada;
	}
	public long getHorasReales() {
		return horasReales;
	}
	public void setHorasReales(long horasReales) {
		this.horasReales = horasReales;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public pasosDTO(FuncionalidadesDTO funcionalidad, TareaDTO tarea, Date fechaInicio, Date fechaFin,
			Boolean finalizada, long horasReales, long id) {
		super();
		this.funcionalidad = funcionalidad;
		this.tarea = tarea;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.finalizada = finalizada;
		this.horasReales = horasReales;
		this.id = id;
	}
	public pasosDTO()
	{
		
	}
	
	

}
