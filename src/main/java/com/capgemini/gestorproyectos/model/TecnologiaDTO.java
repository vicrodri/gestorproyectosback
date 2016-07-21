package com.capgemini.gestorproyectos.model;

import java.io.Serializable;
import java.util.List;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * 
 * @author capgemini
 *
 */
public class TecnologiaDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3577893668545702434L;

	/**
	 * id
	 */
	private Long id;
	
	/**
	 * nombre
	 */
	@NotEmpty(message="El nombre de la tecnologia es obligatorio")
	private String nombre;
	
	/**
	 * capa
	 */
	@NotEmpty(message="La capa es obligatorio")
	private String capa;
	
	/**
	 * lenguaje
	 */
	@NotEmpty(message="El lenguaje es obligatorio")
	private String lenguaje;
	
	/**
	 * Lista de nombres de arquitecturas asociadas a la tecnologia
	 */
	private List<ArquitecturaDTO> arquitecturas;

	/**
	 * 
	 */
	public TecnologiaDTO() {
		
	}

	/**
	 * @param id
	 * @param nombre
	 * @param capa
	 * @param lenguaje
	 * @param arquitecturas
	 */
	public TecnologiaDTO(Long id, String nombre, String capa, String lenguaje, List<ArquitecturaDTO> arquitecturas) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.capa = capa;
		this.lenguaje = lenguaje;
		this.arquitecturas = arquitecturas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCapa() {
		return capa;
	}

	public void setCapa(String capa) {
		this.capa = capa;
	}

	public String getLenguaje() {
		return lenguaje;
	}

	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}

	public List<ArquitecturaDTO> getArquitecturas() {
		return arquitecturas;
	}

	public void setArquitecturas(List<ArquitecturaDTO> arquitecturas) {
		this.arquitecturas = arquitecturas;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("TecnologiaDTO [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", capa=");
		builder.append(capa);
		builder.append(", lenguaje=");
		builder.append(lenguaje);
		builder.append(", arquitecturas=");
		builder.append(arquitecturas);
		builder.append("]");
		return builder.toString();
	}

	
	
}
