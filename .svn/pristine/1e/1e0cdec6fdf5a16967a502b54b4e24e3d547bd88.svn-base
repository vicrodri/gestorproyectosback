package com.capgemini.gestorproyectos.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import com.capgemini.gestorproyectos.util.JSONDateDeserializer;
import com.capgemini.gestorproyectos.util.JSONDateSerializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * @author capgemini
 *
 * Representacion del objeto Cliente.
 */
public class AsignacionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1678573690321645486L;

	private Long id;
	
	private ProyectoDTO proyecto;
	
	private PersonaDTO persona;
	
	private RolDTO rol;
	
	@NotNull(message="La fecha de inicio del proyecto es obligatoria")
	private Date fechaInicio;
	
	private Date fechaFin;

	private Boolean inactivo;
	
	public AsignacionDTO() {
		
	}

	/**
	 * @param id
	 * @param proyecto
	 * @param persona
	 * @param rol
	 * @param fechaInicio
	 * @param fechaFin
	 * @param inactivo
	 */
	public AsignacionDTO(Long id, ProyectoDTO proyecto, PersonaDTO persona, RolDTO rol, Date fechaInicio, Date fechaFin,
			Boolean inactivo) {
		this.id = id;
		this.proyecto = proyecto;
		this.persona = persona;
		this.rol = rol;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
		this.inactivo = inactivo;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the proyecto
	 */
	public ProyectoDTO getProyecto() {
		return proyecto;
	}

	/**
	 * @param proyecto the proyecto to set
	 */
	public void setProyecto(ProyectoDTO proyecto) {
		this.proyecto = proyecto;
	}

	/**
	 * @return the persona
	 */
	public PersonaDTO getPersona() {
		return persona;
	}

	/**
	 * @param persona the persona to set
	 */
	public void setPersona(PersonaDTO persona) {
		this.persona = persona;
	}

	/**
	 * @return the rol
	 */
	public RolDTO getRol() {
		return rol;
	}

	/**
	 * @param rol the rol to set
	 */
	public void setRol(RolDTO rol) {
		this.rol = rol;
	}

	/**
	 * @return the fechaInicio
	 */
	@JsonSerialize(using=JSONDateSerializer.class)
	public Date getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	@JsonDeserialize(using=JSONDateDeserializer.class)
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * @return the fechaFin
	 */
	@JsonSerialize(using=JSONDateSerializer.class)
	public Date getFechaFin() {
		return fechaFin;
	}

	/**
	 * @param fechaFin the fechaFin to set
	 */
	@JsonDeserialize(using=JSONDateDeserializer.class)
	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	/**
	 * @return the inactivo
	 */
	public Boolean getInactivo() {
		return inactivo;
	}

	/**
	 * @param inactivo the inactivo to set
	 */
	public void setInactivo(Boolean inactivo) {
		this.inactivo = inactivo;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AsignacionDTO [id=");
		builder.append(id);
		builder.append(", proyecto=");
		builder.append(proyecto);
		builder.append(", persona=");
		builder.append(persona);
		builder.append(", rol=");
		builder.append(rol);
		builder.append(", fechaInicio=");
		builder.append(fechaInicio);
		builder.append(", fechaFin=");
		builder.append(fechaFin);
		builder.append(", inactivo=");
		builder.append(inactivo);
		builder.append("]");
		return builder.toString();
	}

}
