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
import com.capgemini.gestorproyectos.model.ItemDTO;
import com.capgemini.gestorproyectos.service.ItemService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;

@Api(value = "ItemController", description = "ItemController DESC") 
@Controller
@RequestMapping("/rest/item")
public class ItemController extends BaseController{
	
	private Logger logger = LoggerFactory.getLogger(ItemController.class);
	
	@Autowired
	private ItemService service;
	
	@ApiOperation(
		value = "obtenerItems", 
		notes="Devuelve una lista de items en función del filtro pasado como parámetro",
		responseClass="List<ItemDTO>")
	@RequestMapping(value="/obtenerItems", method = RequestMethod.POST)
	
	public @ApiResponse(value="Lista de items con los resultados") 
		ResponseEntity<List<ItemDTO>> obtenerItems(
		@ApiParam(value = "Objeto Item con el filtro a aplicar") 
		@RequestBody ItemDTO item)  throws Exception{
		logger.info("[INICIO] - obtenerItems");
		
		ResponseEntity<List<ItemDTO>> response;
		List<ItemDTO> lista = service.get(item);
		response = new ResponseEntity<List<ItemDTO>>(lista, HttpStatus.OK);

		logger.info("[FIN] - obtenerItems");
		
		return response;
	}
	    
	@ApiOperation(
		value = "crearItem", 
		notes="Añade los datos de un item en BBDD",
		responseClass="Item añadido")
	@RequestMapping(value="/crearItem", method = RequestMethod.POST)
	public @ApiResponse(value="Cliente Item")
		ResponseEntity<ItemDTO> crearItem(
			@ApiParam(value = "Objeto Item a añadir, nombre y arquitectura obligatorios") 
			@Valid @RequestBody ItemDTO item)  throws Exception{
		logger.info("[INICIO] - crearItem");
		
		if (!this.validarEntrada(item)) {
			throw new GestorProyectosException("888","La arquitectura es obligatoria");
		}
		
		ResponseEntity<ItemDTO> response;
		ItemDTO resultado = service.add(item);
		response = new ResponseEntity<ItemDTO>(resultado, HttpStatus.CREATED);

		logger.info("[FIN] - crearItem");
		
		return response;
	}
	
	@ApiOperation(
		value = "actualizarItem", 
		notes="Actualiza los datos de un item en BBDD",
		responseClass="datos actualizados")
	@RequestMapping(value="/actualizarItem", method = RequestMethod.PUT)
	public  @ApiResponse(value="Item Actualizado") 
		ResponseEntity<ItemDTO> actualizarItem(
			@ApiParam(value = "Objeto Item a actualizar, nombre y arquitectura obligatorios") 
			@Valid @RequestBody ItemDTO item)  throws Exception{
		logger.info("[INICIO] - actualizarItem");

		if (!this.validarEntrada(item)) {
			throw new GestorProyectosException("888","La arquitectura es obligatoria");
		}
		
		ResponseEntity<ItemDTO> response;
		ItemDTO resultado = service.update(item);
		response = new ResponseEntity<ItemDTO>(resultado, HttpStatus.CREATED);

		logger.info("[FIN] - actualizarItem");
		
		return response;
	}
	@ApiOperation(
		value = "eliminarItem", 
		notes="Elimina los datos de un item en BBDD",
		responseClass="flag borrado correcto")
	@RequestMapping(value="/eliminarItem", method = RequestMethod.DELETE)
	public @ApiResponse(value="Flag Borrado") 
		ResponseEntity<Boolean> eliminarItem(
			@ApiParam(value = "Objeto Item a eliminar") 
			@RequestBody ItemDTO item) throws Exception{
		logger.info("[INICIO] - eliminarItem");
		
		ResponseEntity<Boolean> response;
		Boolean resultado = Boolean.FALSE;
		resultado = service.delete(item);
		response = new ResponseEntity<Boolean>(resultado, HttpStatus.OK);
		
		logger.info("[FIN] - eliminarItem");
		
		return response;
	}
	
	/**
	 * Validacion de entrada
	 * 
	 * @param arquitectura
	 * @return
	 * @throws Exception
	 */
	private Boolean validarEntrada(ItemDTO item) throws Exception{
		if (item.getArquitectura() != null && 
				item.getArquitectura().getId() != null) {
			return Boolean.TRUE;
		}
		return Boolean.FALSE;
	}
}
