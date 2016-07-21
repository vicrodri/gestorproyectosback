package com.capgemini.gestorproyectos.model;

import java.io.Serializable;
import java.util.Date;
import com.capgemini.gestorproyectos.util.JSONDateDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class FilterEntrega implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	Date from, to;
	ProyectoDTO proyecto;
	int idEntrega;
	public int getIdEntrega() {
		return idEntrega;
	}
	public void setIdEntrega(int idEntrega) {
		this.idEntrega = idEntrega;
	}
	@JsonDeserialize(using=JSONDateDeserializer.class)
	public Date getFrom() {
		return from;
	}
	@JsonDeserialize(using=JSONDateDeserializer.class)
	public void setFrom(Date from) {
		this.from = from;
	}
	@JsonDeserialize(using=JSONDateDeserializer.class)
	public Date getTo() {
		return to;
	}
	@JsonDeserialize(using=JSONDateDeserializer.class)
	public void setTo(Date to) {
		this.to = to;
	}


	public ProyectoDTO getProyecto() {
		return proyecto;
	}
	public void setProyecto(ProyectoDTO proyecto) {
		this.proyecto = proyecto;
	}
	public FilterEntrega(Date from, Date to, ProyectoDTO proyecto) {
		super();
		this.from = from;
		this.to = to;
		this.proyecto=proyecto;
		
	}
	public FilterEntrega()
	{
		
	}
	public FilterEntrega(Date from, Date to) {
		super();
		this.from = from;
		this.to = to;
	}
	public FilterEntrega(int idEntrega) {
		super();
		this.idEntrega = idEntrega;
	}
	public FilterEntrega(ProyectoDTO proyecto) {
		super();
		this.proyecto = proyecto;
	}

}
