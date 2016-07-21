package com.capgemini.gestorproyectos.model;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import com.capgemini.gestorproyectos.util.JSONDateDeserializer;
import com.capgemini.gestorproyectos.util.JSONDateSerializer;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

/**
 * 
 * @author capgemini
 *
 * Representacion del objeto Arquitectura.
 */
@JsonAutoDetect
public class PersonaDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2927420766563683098L;

	private Long id;

	@NotEmpty(message="El nombre de la persona es obligatorio")
	private String nombre;
	
	@NotEmpty(message="El primer apellido de la persona es obligatorio")
	private String primerApellido;
	
	@NotEmpty(message="El segundo apellido de la persona es obligatorio")
	private String segundoApellido;
	
	@NotNull(message="La fecha de entrada de la persona es obligatorio")
	private Date fechaEntrada;
	
	private Date fechaSalida;

	private Boolean inactivo;
	
	/**
	 * 
	 */
	public PersonaDTO() {

	}

	/**
	 * @param id
	 * @param nombre
	 * @param primerApellido
	 * @param segundoApellido
	 * @param fechaEntrada
	 * @param fechaSalida
	 * @param inactivo
	 */
	public PersonaDTO(Long id, String nombre, String primerApellido, String segundoApellido, Date fechaEntrada,
			Date fechaSalida, Boolean inactivo) {
		this.id = id;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
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

	/**
	 * @return the primerApellido
	 */
	public String getPrimerApellido() {
		return primerApellido;
	}

	/**
	 * @param primerApellido the primerApellido to set
	 */
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	/**
	 * @return the segundoApellido
	 */
	public String getSegundoApellido() {
		return segundoApellido;
	}

	/**
	 * @param segundoApellido the segundoApellido to set
	 */
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	/**
	 * @return the fechaEntrada
	 */
	@JsonSerialize(using=JSONDateSerializer.class)
	public Date getFechaEntrada() {
		return fechaEntrada;
	}

	/**
	 * @param fechaEntrada the fechaEntrada to set
	 */
	@JsonDeserialize(using=JSONDateDeserializer.class)
	public void setFechaEntrada(Date fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	/**
	 * @return the fechaSalida
	 */
	@JsonSerialize(using=JSONDateSerializer.class)
	public Date getFechaSalida() {
		return fechaSalida;
	}

	/**
	 * @param fechaSalida the fechaSalida to set
	 */
	@JsonDeserialize(using=JSONDateDeserializer.class)
	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
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
		builder.append("PersonaDTO [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", primerApellido=");
		builder.append(primerApellido);
		builder.append(", segundoApellido=");
		builder.append(segundoApellido);
		builder.append(", fechaEntrada=");
		builder.append(fechaEntrada);
		builder.append(", fechaSalida=");
		builder.append(fechaSalida);
		builder.append(", inactivo=");
		builder.append(inactivo);
		builder.append("]");
		return builder.toString();
	}
	
}
