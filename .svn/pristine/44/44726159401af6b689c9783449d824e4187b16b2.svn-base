package com.capgemini.gestorproyectos.model;

import java.io.Serializable;
import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author capgemini
 *
 * Representacion del objeto Cliente.
 */
public class ItemDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6765417475974513297L;

	private Long id;
	
	@NotEmpty(message="El nombre del item es obligatorio")
	private String nombre;
	
	private String descripcion;
	
	private ArquitecturaDTO arquitectura;
	
	private List<TecnologiaDTO> tecnologias;
	
	public ItemDTO() {
		
	}


	/**
	 * @param id
	 * @param nombre
	 * @param descripcion
	 * @param arquitectura
	 * @param tecnologias
	 */
	public ItemDTO(Long id, String nombre, String descripcion, ArquitecturaDTO arquitectura,
			List<TecnologiaDTO> tecnologias) {
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.arquitectura = arquitectura;
		this.tecnologias = tecnologias;
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

	public ArquitecturaDTO getArquitectura() {
		return arquitectura;
	}

	public void setArquitectura(ArquitecturaDTO arquitectura) {
		this.arquitectura = arquitectura;
	}

	public List<TecnologiaDTO> getTecnologias() {
		return tecnologias;
	}

	public void setTecnologias(List<TecnologiaDTO> tecnologias) {
		this.tecnologias = tecnologias;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ItemDTO [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", descripcion=");
		builder.append(descripcion);
		builder.append(", arquitectura=");
		builder.append(arquitectura);
		builder.append(", tecnologias=");
		builder.append(tecnologias);
		builder.append("]");
		return builder.toString();
	}

}
