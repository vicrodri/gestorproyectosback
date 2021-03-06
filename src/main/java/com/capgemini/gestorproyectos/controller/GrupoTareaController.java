package com.capgemini.gestorproyectos.controller;

import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.gestorproyectos.exceptions.GestorProyectosException;
import com.capgemini.gestorproyectos.model.GrupoTareaDTO;
import com.capgemini.gestorproyectos.service.GrupoTareaService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;

@Api(value = "GrupoTareaController", description = "GrupoTareaController DESC") 
@Controller
@RequestMapping("/rest/grupoTarea")
public class GrupoTareaController extends BaseController{
	
	private Logger logger = LoggerFactory.getLogger(GrupoTareaController.class);
	
	@Autowired
	private GrupoTareaService service;
	
	@ApiOperation(
		value = "obtenerGrupoTareas", 
		notes="Devuelve una lista de GrupoTareas en función del filtro pasado como parámetro",
		responseClass="List<GrupoTareaDTO>")
	@RequestMapping(value="/obtenerGrupoTareas", method = RequestMethod.POST)
	
	public @ApiResponse(value="Lista de GrupoTareas con los resultados") 
		ResponseEntity<List<GrupoTareaDTO>> obtenerGrupoTareas(
		@ApiParam(value = "Objeto GrupoTarea con el filtro a aplicar") 
		@RequestBody GrupoTareaDTO grupoTarea)  throws Exception{
		logger.info("[INICIO] - obtenerGrupoTareas");
		
		ResponseEntity<List<GrupoTareaDTO>> response;
		List<GrupoTareaDTO> lista = service.get(grupoTarea);
		response = new ResponseEntity<List<GrupoTareaDTO>>(lista, HttpStatus.OK);

		logger.info("[FIN] - obtenerGrupoTareas");
		
		return response;
	}
	    
	@ApiOperation(
		value = "crearGrupoTarea", 
		notes="Añade los datos de un grupoTarea en BBDD",
		responseClass="GrupoTarea añadido")
	@RequestMapping(value="/crearGrupoTarea", method = RequestMethod.POST)
	public @ApiResponse(value="GrupoTarea")
		ResponseEntity<GrupoTareaDTO> crearGrupoTarea(
			@ApiParam(value = "Objeto GrupoTarea a añadir, arquitectura, item, complejidad y tamaño son obligatorios") 
			@Valid @RequestBody GrupoTareaDTO grupoTarea)  throws Exception{
		logger.info("[INICIO] - crearGrupoTarea");
		
		if (!this.validarEntrada(grupoTarea)) {
			throw new GestorProyectosException("888","La arquitectura, item, complejidad y tamaño son obligatorios");
		}
		
		ResponseEntity<GrupoTareaDTO> response;
		GrupoTareaDTO resultado = service.add(grupoTarea);
		response = new ResponseEntity<GrupoTareaDTO>(resultado, HttpStatus.CREATED);

		logger.info("[FIN] - crearGrupoTarea");
		
		return response;
	}
	
	@ApiOperation(
		value = "actualizarGrupoTarea", 
		notes="Actualiza los datos de un item en BBDD",
		responseClass="datos actualizados")
	@RequestMapping(value="/actualizarGrupoTarea", method = RequestMethod.PUT)
	public  @ApiResponse(value="Grupo Tarea Actualizado") 
		ResponseEntity<GrupoTareaDTO> actualizarGrupoTarea(
			@ApiParam(value = "Objeto Grupo Tarea a actualizar, La arquitectura, item, complejidad y tamaño son obligatorios") 
			@Valid @RequestBody GrupoTareaDTO grupoTarea)  throws Exception{
		logger.info("[INICIO] - actualizarGrupoTarea");

		if (!this.validarEntrada(grupoTarea)) {
			throw new GestorProyectosException("888","La arquitectura, item, complejidad y tamaño son obligatorios");
		}
		
		ResponseEntity<GrupoTareaDTO> response;
		GrupoTareaDTO resultado = service.update(grupoTarea);
		response = new ResponseEntity<GrupoTareaDTO>(resultado, HttpStatus.CREATED);

		logger.info("[FIN] - actualizarGrupoTarea");
		
		return response;
	}
	@ApiOperation(
		value = "eliminarGrupoTarea", 
		notes="Elimina los datos de un grupoTarea en BBDD",
		responseClass="flag borrado correcto")
	@RequestMapping(value="/eliminarGrupoTarea", method = RequestMethod.DELETE)
	public @ApiResponse(value="Flag Borrado") 
		ResponseEntity<Boolean> eliminarGrupoTarea(
			@ApiParam(value = "Objeto GrupoTarea a eliminar") 
			@RequestBody GrupoTareaDTO grupoTarea) throws Exception{
		logger.info("[INICIO] - eliminarGrupoTarea");
		
		ResponseEntity<Boolean> response;
		Boolean resultado = Boolean.FALSE;
		resultado = service.delete(grupoTarea);
		response = new ResponseEntity<Boolean>(resultado, HttpStatus.OK);
		
		logger.info("[FIN] - eliminarGrupoTarea");
		
		return response;
	}
	
	/**
	 * Validacion de entrada
	 * 
	 * @param arquitectura
	 * @return
	 * @throws Exception
	 */
	private Boolean validarEntrada(GrupoTareaDTO grupoTarea) throws Exception{
		if (grupoTarea.getArquitectura() != null && grupoTarea.getComplejidad() != null 
				&& grupoTarea.getItem() != null && grupoTarea.getTamanio() != null) {
			if (grupoTarea.getArquitectura().getId() != null && 
					grupoTarea.getComplejidad().getId() != null && 
					grupoTarea.getItem().getId() != null && 
					grupoTarea.getTamanio().getId() != null)
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
}
