package com.capgemini.gestorproyectos.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Null;

import com.capgemini.gestorproyectos.util.JSONDateDeserializer;
import com.capgemini.gestorproyectos.util.JSONDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class FilterEstimacion implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 12121L;

	Date from,to;
	
	PersonaDTO persona;
	@JsonSerialize(using=JSONDateSerializer.class)
	public Date getFrom() {
		return from;
	}
	@JsonDeserialize(using=JSONDateDeserializer.class)
	public void setFrom(Date from) {
		this.from = from;
	}
	@JsonSerialize(using=JSONDateSerializer.class)
	public Date getTo() {
		return to;
	}
	@JsonDeserialize(using=JSONDateDeserializer.class)
	public void setTo(Date to) {
		this.to = to;
	}
	public FilterEstimacion(Date from, Date to) {
		super();
		this.from = from;
		this.to = to;
	}
	public FilterEstimacion(PersonaDTO persona) {
		super();
		this.persona = persona;
	}

	public FilterEstimacion(){}
	public PersonaDTO getPersona() {
		return persona;
	}
	public void setPersona(PersonaDTO persona) {
		this.persona = persona;
	}

}
