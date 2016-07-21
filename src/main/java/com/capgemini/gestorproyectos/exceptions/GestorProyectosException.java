package com.capgemini.gestorproyectos.exceptions;

public class GestorProyectosException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7813826257893877685L;
	
	private String codigo;
	private String mensaje;
	
	public GestorProyectosException(String codigo, String mensaje) {
		super();
		this.codigo = codigo;
		this.mensaje = mensaje;
	}

	public String getMensajeError () {
		return this.mensaje;
	}

	public String getCodigoError () {
		return this.codigo;
	}
}
