package com.capgemini.gestorproyectos.model;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 
 * @author capgemini
 *
 * Representacion del objeto Arquitectura.
 */
public class ArquitecturaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1144577811656016544L;

	private Long id;

	@NotEmpty(message="El nombre de la arquitectura es obligatorio")
	private String nombre;
	
	private ClienteDTO cliente;

	/**
	 * 
	 */
	public ArquitecturaDTO() {

	}
	
	/**
	 * @param id
	 * @param nombre
	 * @param cliente
	 */
	public ArquitecturaDTO(Long id, String nombre, ClienteDTO cliente) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cliente = cliente;
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

	public ClienteDTO getCliente() {
		return cliente;
	}

	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("ArquitecturaDTO [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", cliente=");
		builder.append(cliente);
		builder.append("]");
		return builder.toString();
	}

	
}
