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
import com.capgemini.gestorproyectos.service.ClienteService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;

@Api(value = "ClienteController", description = "ClienteController DESC") 
@Controller
@RequestMapping("/rest/cliente")
public class ClienteController extends BaseController{
	
	private Logger logger = LoggerFactory.getLogger(ClienteController.class);
	
	@Autowired
	private ClienteService service;
	
	@ApiOperation(
		value = "obtenerClientes", 
		notes="Devuelve una lista de clientes en función del filtro pasado como parámetro",
		responseClass="List<ClienteDTO>")
	@RequestMapping(value="/obtenerClientes", method = RequestMethod.POST)
	
	public @ApiResponse(value="Lista de clientes con los resultados") 
		ResponseEntity<List<ClienteDTO>> obtenerClientes(
		@ApiParam(value = "Objeto Cliente con el filtro a aplicar") 
		@RequestBody ClienteDTO cliente)  throws Exception{
		logger.info("[INICIO] - obtenerClientes");
		
		ResponseEntity<List<ClienteDTO>> response;
		List<ClienteDTO> lista = null;
		lista = service.get(cliente);
		response = new ResponseEntity<List<ClienteDTO>>(lista, HttpStatus.OK);

		logger.info("[FIN] - obtenerClientes");
		
		return response;
	}
	    
	@ApiOperation(
		value = "crearCliente", 
		notes="Añade los datos de un cliente en BBDD",
		responseClass="Cliente añadido")
	@RequestMapping(value="/crearCliente", method = RequestMethod.POST)
	public @ApiResponse(value="Cliente Añadido")
		ResponseEntity<ClienteDTO> crearCliente(
			@ApiParam(value = "Objeto Cliente a añadir, nombre obligatorio") 
			@Valid @RequestBody ClienteDTO cliente)  throws Exception{
		logger.info("[INICIO] - crearCliente");
		
		ResponseEntity<ClienteDTO> response;
		ClienteDTO resultado = service.add(cliente);
		response = new ResponseEntity<ClienteDTO>(resultado, HttpStatus.CREATED);

		logger.info("[FIN] - crearCliente");
		
		return response;
	}
	
	@ApiOperation(
		value = "actualizarCliente", 
		notes="Actualiza los datos de un cliente en BBDD",
		responseClass="datos actualizados")
	@RequestMapping(value="/actualizarCliente", method = RequestMethod.PUT)
	public  @ApiResponse(value="Cliente Actualizado") 
		ResponseEntity<ClienteDTO> actualizarCliente(
			@ApiParam(value = "Objeto Cliente a añadir, nombre obligatorio") 
			@Valid @RequestBody ClienteDTO cliente)  throws Exception{
		logger.info("[INICIO] - actualizarCliente");
		
		ResponseEntity<ClienteDTO> response;
		ClienteDTO resultado = service.update(cliente);
		response = new ResponseEntity<ClienteDTO>(resultado, HttpStatus.CREATED);

		logger.info("[FIN] - actualizarCliente");
		
		return response;
	}
	@ApiOperation(
		value = "eliminarCliente", 
		notes="Elimina los datos de un cliente en BBDD",
		responseClass="flag borrado correcto")
	@RequestMapping(value="/eliminarCliente", method = RequestMethod.DELETE)
	public @ApiResponse(value="Flag Borrado") 
		ResponseEntity<Boolean> eliminarCliente(
			@ApiParam(value = "Objeto Cliente a eliminar") 
			@RequestBody ClienteDTO cliente) throws Exception{
		logger.info("[INICIO] - eliminarCliente");
		
		ResponseEntity<Boolean> response;
		Boolean resultado = Boolean.FALSE;
		resultado = service.delete(cliente);
		response = new ResponseEntity<Boolean>(resultado, HttpStatus.OK);
		
		logger.info("[FIN] - eliminarCliente");
		
		return response;
	}
	
	@ApiOperation(
			value = "getAllClientes", 
			notes="Devuelve una lista de clientes para cargar desplegables",
			responseClass="List<ClienteDTO>")
		@RequestMapping(value="/getAllClientes", method = RequestMethod.GET)
		public @ApiResponse(value="Lista de clientes con los resultados") 
			ResponseEntity<List<ClienteDTO>> getAllClientes()  throws Exception{
			logger.info("[INICIO] - getAllClientes");
			
			ResponseEntity<List<ClienteDTO>> response;
			List<ClienteDTO> lista = service.getAll();
			response = new ResponseEntity<List<ClienteDTO>>(lista, HttpStatus.OK);

			logger.info("[FIN] - getAllClientes");
			
			return response;
		}
}
