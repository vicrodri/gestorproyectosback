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

import com.capgemini.gestorproyectos.model.ComplejidadDTO;
import com.capgemini.gestorproyectos.service.ComplejidadService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;

@Api(value = "ComplejidadController", description = "ComplejidadController DESC") 
@Controller
@RequestMapping("/rest/complejidad")
public class ComplejidadController extends BaseController{
	
	private Logger logger = LoggerFactory.getLogger(ComplejidadController.class);
	
	@Autowired
	private ComplejidadService service;
	
	@ApiOperation(
		value = "obteneComplejidades", 
		notes="Devuelve una lista de complejidades",
		responseClass="List<ComplejidadDTO>")
	@RequestMapping(value="/obtenerComplejidades", method = RequestMethod.POST)
	public @ApiResponse(value="Lista de obtenerComplejidades con los resultados") 
		ResponseEntity<List<ComplejidadDTO>> obtenerComplejidades(
			@ApiParam(value = "Filtro") 
			@RequestBody ComplejidadDTO complejidad)  throws Exception{
		logger.info("[INICIO] - obtenerComplejidades");
		
		ResponseEntity<List<ComplejidadDTO>> response;
		List<ComplejidadDTO> lista = service.get(complejidad);
		response = new ResponseEntity<List<ComplejidadDTO>>(lista, HttpStatus.OK);

		logger.info("[FIN] - obtenerComplejidades");
		
		return response;
	}
	    
	@ApiOperation(
		value = "crearComplejidad", 
		notes="Añade los datos de una complejidad en BBDD",
		responseClass="Complejidad añadida")
	@RequestMapping(value="/crearComplejidad", method = RequestMethod.POST)
	public @ApiResponse(value="Complejidad Añadida")
		ResponseEntity<ComplejidadDTO> crearComplejidad(
			@ApiParam(value = "Objeto Complejidad a añadir, descripción obligatoria") 
			@Valid @RequestBody ComplejidadDTO complejidad)  throws Exception{
		logger.info("[INICIO] - crearComplejidad");
		
		ResponseEntity<ComplejidadDTO> response;
		ComplejidadDTO resultado = service.add(complejidad);
		response = new ResponseEntity<ComplejidadDTO>(resultado, HttpStatus.CREATED);

		logger.info("[FIN] - crearComplejidad");
		
		return response;
	}
	
	@ApiOperation(
		value = "actualizarComplejidad", 
		notes="Actualiza los datos de una complejidad en BBDD",
		responseClass="datos actualizados")
	@RequestMapping(value="/actualizarComplejidad", method = RequestMethod.PUT)
	public  @ApiResponse(value="Complejidad Actualizada") 
		ResponseEntity<ComplejidadDTO> actualizarComplejidad(
			@ApiParam(value = "Objeto Complejidad a actualizar, descripción obligatoria") 
			@Valid @RequestBody ComplejidadDTO complejidad)  throws Exception{
		logger.info("[INICIO] - actualizarComplejidad");
		
		ResponseEntity<ComplejidadDTO> response;
		ComplejidadDTO resultado = service.update(complejidad);
		response = new ResponseEntity<ComplejidadDTO>(resultado, HttpStatus.CREATED);

		logger.info("[FIN] - actualizarComplejidad");
		
		return response;
	}
	@ApiOperation(
		value = "eliminarComplejidad", 
		notes="Elimina los datos de una complejidad en BBDD",
		responseClass="flag borrado correcto")
	@RequestMapping(value="/eliminarComplejidad", method = RequestMethod.DELETE)
	public @ApiResponse(value="Flag Borrado") 
		ResponseEntity<Boolean> eliminarCliente(
			@ApiParam(value = "Objeto Complejidad a eliminar") 
			@RequestBody ComplejidadDTO complejidad) throws Exception{
		logger.info("[INICIO] - eliminarComplejidad");
		
		ResponseEntity<Boolean> response;
		Boolean resultado = Boolean.FALSE;
		resultado = service.delete(complejidad);
		response = new ResponseEntity<Boolean>(resultado, HttpStatus.OK);
		
		logger.info("[FIN] - eliminarComplejidad");
		
		return response;
	}
	
	@ApiOperation(
		value = "getAllComp", 
		notes="Devuelve todas las complejidades",
		responseClass="List<ComplejidadDTO>")
	@RequestMapping(value="/getAllComp", method = RequestMethod.GET)
	public @ApiResponse(value="Lista de obtenerComplejidades con los resultados") 
		ResponseEntity<List<ComplejidadDTO>> getAllComp()  throws Exception{
		logger.info("[INICIO] - getAllComp");
		
		ResponseEntity<List<ComplejidadDTO>> response;
		List<ComplejidadDTO> lista = service.getAllComplejidades();
		response = new ResponseEntity<List<ComplejidadDTO>>(lista, HttpStatus.OK);

		logger.info("[FIN] - getAllComp");
		
		return response;
	}
}
