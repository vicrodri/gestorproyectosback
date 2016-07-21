package com.capgemini.gestorproyectos.model;

import java.io.Serializable;
import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author capgemini
 *
 * Representacion del objeto Cliente.
 */
public class ClienteDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2021633857714023213L;

	private Long id;
	
	@NotEmpty(message="El nombre del cliente es obligatorio")
	private String nombre;
	
	private String descripcion;
	
	private List<ArquitecturaDTO> arquitecturas;
	
	public ClienteDTO() {
		
	}

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param descripcion
	 * @param arquitecturas
	 */
	public ClienteDTO(Long id, String nombre, String descripcion, List<ArquitecturaDTO> arquitecturas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.arquitecturas = arquitecturas;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<ArquitecturaDTO> getArquitecturas() {
		return arquitecturas;
	}

	public void setArquitecturas(List<ArquitecturaDTO> arquitecturas) {
		this.arquitecturas = arquitecturas;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ClienteDTO [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", arquitecturas=");
		builder.append(arquitecturas);
		builder.append("]");
		return builder.toString();
	}

}
