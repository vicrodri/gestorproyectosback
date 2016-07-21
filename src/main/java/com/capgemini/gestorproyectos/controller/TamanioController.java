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

import com.capgemini.gestorproyectos.model.TamanioDTO;
import com.capgemini.gestorproyectos.service.TamanioService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;

@Api(value = "TamanioController", description = "TamanioController DESC") 
@Controller
@RequestMapping("/rest/tamanio")
public class TamanioController extends BaseController{
	
	private Logger logger = LoggerFactory.getLogger(TamanioController.class);
	
	@Autowired
	private TamanioService service;
	
	@ApiOperation(
		value = "obtenerTamanios", 
		notes="Devuelve una lista de tamanios",
		responseClass="List<TamanioDTO>")
	@RequestMapping(value="/obtenerTamanios", method = RequestMethod.POST)
	public @ApiResponse(value="Lista de obtenerTamanios con los resultados") 
		ResponseEntity<List<TamanioDTO>> obtenerTamanios(
			@ApiParam(value = "Objeto Tamanio a filtrar") 
			@RequestBody TamanioDTO tamanio)  throws Exception{
		logger.info("[INICIO] - obtenerTamanios");
		
		ResponseEntity<List<TamanioDTO>> response;
		List<TamanioDTO> lista = service.get(tamanio);
		response = new ResponseEntity<List<TamanioDTO>>(lista, HttpStatus.OK);

		logger.info("[FIN] - obtenerTamanios");
		
		return response;
	}
	    
	@ApiOperation(
		value = "crearTamanio", 
		notes="Añade los datos de una tamanio en BBDD",
		responseClass="Complejidad añadida")
	@RequestMapping(value="/crearTamanio", method = RequestMethod.POST)
	public @ApiResponse(value="Tamanio Añadida")
		ResponseEntity<TamanioDTO> crearTamanio(
			@ApiParam(value = "Objeto Tamanio a añadir, descripción obligatoria") 
			@Valid @RequestBody TamanioDTO tamanio)  throws Exception{
		logger.info("[INICIO] - crearTamanio");
		
		ResponseEntity<TamanioDTO> response;
		TamanioDTO resultado = service.add(tamanio);
		response = new ResponseEntity<TamanioDTO>(resultado, HttpStatus.CREATED);

		logger.info("[FIN] - crearTamanio");
		
		return response;
	}
	
	@ApiOperation(
		value = "actualizarTamanio", 
		notes="Actualiza los datos de un tamanio en BBDD",
		responseClass="datos actualizados")
	@RequestMapping(value="/actualizarTamanio", method = RequestMethod.PUT)
	public  @ApiResponse(value="Tamanio Actualizada") 
		ResponseEntity<TamanioDTO> actualizarTamanio(
			@ApiParam(value = "Objeto Tamanio a actualizar, descripción obligatoria") 
			@Valid @RequestBody TamanioDTO tamanio)  throws Exception{
		logger.info("[INICIO] - actualizarTamanio");
		
		ResponseEntity<TamanioDTO> response;
		TamanioDTO resultado = service.update(tamanio);
		response = new ResponseEntity<TamanioDTO>(resultado, HttpStatus.CREATED);

		logger.info("[FIN] - actualizarComplejidad");
		
		return response;
	}
	@ApiOperation(
		value = "eliminarTamanio", 
		notes="Elimina los datos de una tamanio en BBDD",
		responseClass="flag borrado correcto")
	@RequestMapping(value="/eliminarTamanio", method = RequestMethod.DELETE)
	public @ApiResponse(value="Flag Borrado") 
		ResponseEntity<Boolean> eliminarTamanio(
			@ApiParam(value = "Objeto Tamanio a eliminar") 
			@RequestBody TamanioDTO tamanio) throws Exception{
		logger.info("[INICIO] - eliminarTamanio");
		
		ResponseEntity<Boolean> response;
		Boolean resultado = Boolean.FALSE;
		resultado = service.delete(tamanio);
		response = new ResponseEntity<Boolean>(resultado, HttpStatus.OK);
		
		logger.info("[FIN] - eliminarTamanio");
		
		return response;
	}

	@ApiOperation(
		value = "getAllTamanios", 
		notes="Devuelve todos los tamanios",
		responseClass="List<TamanioDTO>")
	@RequestMapping(value="/getAllTamanios", method = RequestMethod.GET)
	public @ApiResponse(value="Lista de obtenerTamanios con los resultados") 
		ResponseEntity<List<TamanioDTO>> getAllTamanios()  throws Exception{
		logger.info("[INICIO] - getAllTamanios");
		
		ResponseEntity<List<TamanioDTO>> response;
		List<TamanioDTO> lista = service.getAllTamanios();
		response = new ResponseEntity<List<TamanioDTO>>(lista, HttpStatus.OK);

		logger.info("[FIN] - getAllTamanios");
		
		return response;
	}
}
