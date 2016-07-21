package com.capgemini.gestorproyectos.model;

import java.io.Serializable;

/**
 * @author capgemini
 *
 * Representacion del objeto Cliente.
 */
public class ErrorResponseDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1086893081767313897L;

	private String errorCode;
	
	private String errorMsg;
	
	public ErrorResponseDTO() {
		
	}

	public ErrorResponseDTO(String errorCode, String errorMsg) {
		super();
		this.errorCode = errorCode;
		this.errorMsg = errorMsg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}


	@Override
	public String toString() {
		return "ErrorResponseDTO [errorCode=" + errorCode + ", errorMsg=" + errorMsg + "]";
	}

}
