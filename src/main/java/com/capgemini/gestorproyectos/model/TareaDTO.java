package com.capgemini.gestorproyectos.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 
 * @author capgemini
 *
 * Representacion del objeto Tarea.
 */
public class TareaDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3894946560053344679L;

	private long id;

	@NotEmpty(message="El nombre de la tarea es obligatorio")
	private String nombre;
	
	@NotNull(message="las horas de la tarea son obligatorias")
	private long horas;
	
	private String comentarios;
	
	private GrupoTareaDTO grupoTarea;

	/**
	 * 
	 */
	public TareaDTO() {

	}

	/**
	 * @param id
	 * @param nombre
	 * @param horas
	 * @param comentarios
	 * @param grupoTarea
	 */
	public TareaDTO(long id, String nombre, long horas, String comentarios, GrupoTareaDTO grupoTarea) {
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
		this.comentarios = comentarios;
		this.grupoTarea = grupoTarea;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
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
	 * @return the horas
	 */
	public long getHoras() {
		return horas;
	}

	/**
	 * @param horas the horas to set
	 */
	public void setHoras(long horas) {
		this.horas = horas;
	}

	/**
	 * @return the comentarios
	 */
	public String getComentarios() {
		return comentarios;
	}

	/**
	 * @param comentarios the comentarios to set
	 */
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	/**
	 * @return the grupoTarea
	 */
	public GrupoTareaDTO getGrupoTarea() {
		return grupoTarea;
	}

	/**
	 * @param grupoTarea the grupoTarea to set
	 */
	public void setGrupoTarea(GrupoTareaDTO grupoTarea) {
		this.grupoTarea = grupoTarea;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TareaDTO [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", horas=");
		builder.append(horas);
		builder.append(", comentarios=");
		builder.append(comentarios);
		builder.append(", grupoTarea=");
		builder.append(grupoTarea);
		builder.append("]");
		return builder.toString();
	}
	
}
