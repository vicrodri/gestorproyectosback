package com.capgemini.gestorproyectos.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

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

import com.capgemini.gestorproyectos.model.EntregaDTO;
import com.capgemini.gestorproyectos.model.FilterEntrega;
import com.capgemini.gestorproyectos.model.FuncionalidadesDTO;
import com.capgemini.gestorproyectos.service.EntregaService;
import com.capgemini.gestorproyectos.service.FuncionalidadesService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;

@Api(value = "EntregasController", description = "Rest controller de Funcionalidades") 
@Controller
@RequestMapping("/rest/entregas")
public class entregasController extends BaseController {
	@Autowired
	EntregaService service;
	private Logger logger = LoggerFactory.getLogger(Controller.class);
	@ApiOperation(
			value = "obtenerAllEntregas", 
			notes="obtener todas las entregas",
			responseClass="List<FuncionalidadesDTO>")
	@RequestMapping(value="/obtenerAllEntregas", method = RequestMethod.POST)
	public @ApiResponse(value="Lista de entregas") 
		ResponseEntity<List<EntregaDTO>> obtenerFuncionalidades()  throws Exception{
		logger.info("[INICIO] - obtenerArquitecturas");
		
		ResponseEntity<List<EntregaDTO>> response;
		List<EntregaDTO> lista = null;
		lista = service.getAllEntregas();
		response = new ResponseEntity<List<EntregaDTO>>(lista, HttpStatus.OK);

		logger.info("[FIN] - obtenerArquitecturas");
		
		return response;
	}
	
	
	@ApiOperation(
			value = "anadirEntregas", 
			notes="Añadir entrega",
			responseClass="List<EntregaDTO>")
	@RequestMapping(value="/anadirEntregas", method = RequestMethod.POST)
	public @ApiResponse(value="Crear entrega") 
		ResponseEntity<EntregaDTO> anadirEntregas(
		@ApiParam(value = "Entrega a añadir") 
	@Valid	@RequestBody EntregaDTO entrega)  throws Exception{
	
	
		service.add(entrega);
		
		return new ResponseEntity<EntregaDTO>(entrega,HttpStatus.OK);
	}
	
	@ApiOperation(value="updateEntrega",notes="actualizar una entrega",responseClass="List<EntregaDTO>")
	@RequestMapping(value="/updateEntrega")
	public @ApiResponse(value="actualizar entrega") ResponseEntity<EntregaDTO> updateEntrega(@RequestBody EntregaDTO entrega) throws Exception
	{
		service.update(entrega);
		return new ResponseEntity<EntregaDTO>(entrega,HttpStatus.ACCEPTED);
	}
	@ApiOperation(value="obtenerEntrega",notes="obtener entrega especifica",responseClass="List<EntregaDTO>")
	@RequestMapping(value="/obtenerEntrega")
	public @ApiResponse(value="Obtener entrega filtrada") ResponseEntity<List<EntregaDTO>> obtenerEntrega(@RequestBody FilterEntrega filter) throws Exception
	{
		List<EntregaDTO> entregas =service.getByDate(filter);
		
		return new ResponseEntity<List<EntregaDTO>>(entregas,HttpStatus.OK);
	}
	
	@ApiOperation(value="deleteEntrega",notes="borrar entrega especifica",responseClass="List<EntregaDTO>")
	@RequestMapping(value="/borrarEntrega")
	public @ApiResponse(value="Borrar entrega filtrada") ResponseEntity<EntregaDTO> deleteEntrega(@RequestBody EntregaDTO cliente) throws Exception
	{
		Boolean correcto =service.delete(cliente);
		
		return new ResponseEntity<EntregaDTO>(cliente,correcto?HttpStatus.ACCEPTED:HttpStatus.NOT_ACCEPTABLE);
	}
	
	
}