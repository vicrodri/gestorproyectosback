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

import com.capgemini.gestorproyectos.model.ClienteDTO;
import com.capgemini.gestorproyectos.model.ProyectoDTO;
import com.capgemini.gestorproyectos.service.ProyectoService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;

@Api(value = "ProyectoController", description = "ProyectoController DESC") 
@Controller
@RequestMapping("/rest/proyecto")
public class ProyectoController extends BaseController{
	
	private Logger logger = LoggerFactory.getLogger(ProyectoController.class);
	
	@Autowired
	private ProyectoService service;
	
	@ApiOperation(
		value = "obtenerProyectos", 
		notes="Devuelve una lista de Proyectos en función del filtro pasado como parámetro",
		responseClass="List<ProyectoDTO>")
	@RequestMapping(value="/obtenerProyectos", method = RequestMethod.POST)
	public @ApiResponse(value="Lista de proyectos con los resultados") 
		ResponseEntity<List<ProyectoDTO>> obtenerProyectos(
		@ApiParam(value = "Objeto Proyecto con el filtro a aplicar") 
		@RequestBody ProyectoDTO proyecto)  throws Exception{
		logger.info("[INICIO] - obtenerProyectos");
		
		ResponseEntity<List<ProyectoDTO>> response;
		List<ProyectoDTO> lista = null;
		lista = service.get(proyecto);
		response = new ResponseEntity<List<ProyectoDTO>>(lista, HttpStatus.OK);

		logger.info("[FIN] - obtenerProyectos");
		
		return response;
	}
	    
	@ApiOperation(
		value = "crearProyecto", 
		notes="Añade los datos de un proyecto en BBDD",
		responseClass="Proyecto añadida")
	@RequestMapping(value="/crearProyecto", method = RequestMethod.POST)
	public @ApiResponse(value="Proyecto Añadido")
		ResponseEntity<ProyectoDTO> crearProyecto(
			@ApiParam(value = "Objeto Proyecto a añadir - nombre, descripcion y fecha de inicio obligatorios") 
			@Valid @RequestBody ProyectoDTO proyecto)  throws Exception{
		logger.info("[INICIO] - crearProyecto");
		
		ResponseEntity<ProyectoDTO> response;
		ProyectoDTO resultado = service.add(proyecto);
		response = new ResponseEntity<ProyectoDTO>(resultado, HttpStatus.CREATED);

		logger.info("[FIN] - crearProyecto");
		
		return response;
	}
	
	@ApiOperation(
		value = "actualizarProyecto", 
		notes="Actualiza los datos de un proyecto en BBDD",
		responseClass="datos actualizados")
	@RequestMapping(value="/actualizarProyecto", method = RequestMethod.PUT)
	public  @ApiResponse(value="Proyecto Actualizado") 
		ResponseEntity<ProyectoDTO> actualizarProyecto(
			@ApiParam(value = "Objeto Proyecto a añadir - nombre, descripcion y fecha de inicio obligatorios") 
			@Valid @RequestBody ProyectoDTO proyecto)  throws Exception{
		logger.info("[INICIO] - actualizarProyecto");
		
		ResponseEntity<ProyectoDTO> response;
		ProyectoDTO resultado = service.update(proyecto);
		response = new ResponseEntity<ProyectoDTO>(resultado, HttpStatus.CREATED);

		logger.info("[FIN] - actualizarProyecto");
		
		return response;
	}
	
	@ApiOperation(
		value = "getProyectosCliente", 
		notes="Devuelve una lista de Proyectos en funcion de un cliente",
		responseClass="List<ProyectoDTO>")
	@RequestMapping(value="/getProyectosCliente", method = RequestMethod.GET)
	public @ApiResponse(value="Lista de proyectos con los resultados") 
		ResponseEntity<List<ProyectoDTO>> getProyectosCliente
		(@ApiParam(value = "Objeto Proyecto a eliminar") 
			ClienteDTO cliente)  throws Exception{
		logger.info("[INICIO] - getProyectosCliente");
		
		ResponseEntity<List<ProyectoDTO>> response;
		List<ProyectoDTO> lista = service.getProyectosCliente(cliente);
		response = new ResponseEntity<List<ProyectoDTO>>(lista, HttpStatus.OK);

		logger.info("[FIN] - getProyectosCliente");
		
		return response;
	}
	
}
