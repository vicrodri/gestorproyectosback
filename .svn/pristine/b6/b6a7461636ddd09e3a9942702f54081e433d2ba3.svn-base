package com.capgemini.gestorproyectos.model;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author capgemini
 *
 * Representacion del objeto Cliente.
 */
public class ComplejidadDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8807583250329244022L;

	private Long id;
	
	@NotEmpty(message="La descripción de la complejidad es obligatorio")
	private String descripcion;
	
	public ComplejidadDTO() {
		
	}

	/**
	 * @param id
	 * @param descripcion
	 */
	public ComplejidadDTO(Long id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ComplejidadDTO [id=");
		builder.append(id);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append("]");
		return builder.toString();
	}

}
