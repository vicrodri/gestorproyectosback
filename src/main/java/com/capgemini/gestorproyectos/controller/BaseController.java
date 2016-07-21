package com.capgemini.gestorproyectos.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;

import com.capgemini.gestorproyectos.exceptions.GestorProyectosException;
import com.capgemini.gestorproyectos.model.ErrorResponseDTO;
import com.capgemini.gestorproyectos.util.DateConverter;

public class BaseController {
	
	private Logger logger = LoggerFactory.getLogger(BaseController.class);
	
	@InitBinder
    private void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(Date.class, new DateConverter());
    }
	
	/**
	 * Manejador de excepciones de Negocio
	 * 
	 * @param ex <GestorProyectosException>
	 * @return
	 */
	@ExceptionHandler(GestorProyectosException.class)
	public ResponseEntity<List<ErrorResponseDTO>> 
		handleBusinessException(GestorProyectosException ex) {
		logger.error("[ERROR] - " + ex.getMensajeError(), ex);
		List<ErrorResponseDTO> respuesta = new ArrayList<ErrorResponseDTO>();
		respuesta.add(new ErrorResponseDTO(ex.getCodigoError(), ex.getMensajeError()));
		return new ResponseEntity<List<ErrorResponseDTO>>(respuesta, HttpStatus.BAD_REQUEST);
	}

	/**
	 * Manejador de Excepciones de validacion JSR-303
	 * 
	 * @param ex <BindException>
	 * @return
	 */
	@ExceptionHandler(BindException.class)
	public ResponseEntity<List<ErrorResponseDTO>> handleValidationException(BindException ex) {
		logger.error("[ERROR] - " + ex.getLocalizedMessage(), ex);
		List<ErrorResponseDTO> respuesta = new ArrayList<ErrorResponseDTO>();
		for (FieldError item : ex.getFieldErrors()) {
			respuesta.add(new ErrorResponseDTO("888", item.getDefaultMessage()));
		}
		return new ResponseEntity<List<ErrorResponseDTO>>(respuesta, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<List<ErrorResponseDTO>> handleException(Exception ex) {
		logger.error("[ERROR] - " + ex.getLocalizedMessage(), ex);
		List<ErrorResponseDTO> respuesta = new ArrayList<ErrorResponseDTO>();
		respuesta.add(new ErrorResponseDTO("999", ex.getLocalizedMessage()));
		return new ResponseEntity<List<ErrorResponseDTO>>(respuesta, HttpStatus.BAD_REQUEST);
	}     
}
