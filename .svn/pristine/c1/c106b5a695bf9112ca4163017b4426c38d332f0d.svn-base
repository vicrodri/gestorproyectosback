package com.capgemini.gestorproyectos.model;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author capgemini
 *
 * Representacion del objeto Tamanio.
 */
public class TamanioDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2823684317868719571L;

	private Long id;
	
	@NotEmpty(message="La descripción del tamaño es obligatoria")
	private String descripcion;
	
	public TamanioDTO() {
		
	}

	/**
	 * @param id
	 * @param descripcion
	 */
	public TamanioDTO(Long id, String descripcion) {
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
		builder.append("TamanioDTO [id=");
		builder.append(id);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append("]");
		return builder.toString();
	}

}
