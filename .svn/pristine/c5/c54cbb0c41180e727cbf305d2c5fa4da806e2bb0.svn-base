package com.capgemini.gestorproyectos.model;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author capgemini
 *
 * Representacion del objeto Cliente.
 */
public class RolDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1529618189695679624L;

	private Long id;
	
	@NotEmpty(message="El nombre del Rol es obligatorio")
	private String nombre;
	
	public RolDTO() {
		
	}

	/**
	 * @param id
	 * @param nombre
	 */
	public RolDTO(Long id, String nombre) {
		this.id = id;
		this.nombre = nombre;
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RolDTO [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append("]");
		return builder.toString();
	}

}