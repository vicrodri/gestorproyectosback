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

import com.capgemini.gestorproyectos.model.ArquitecturaDTO;
import com.capgemini.gestorproyectos.model.TecnologiaDTO;
import com.capgemini.gestorproyectos.service.TecnologiaService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;

@Api(value = "TecnologiaController", description = "TecnologiaController DESC") 
@Controller
@RequestMapping("/rest/tecnologia")
public class TecnologiaController extends BaseController{
	
	private Logger logger = LoggerFactory.getLogger(ArquitecturaController.class);
	
	@Autowired
	private TecnologiaService service;
	
	@ApiOperation(
		value = "obtenerTecnologias", 
		notes="Devuelve una lista de Tecnologias en función del filtro pasado como parámetro",
		responseClass="List<TecnologiaDTO>")
	@RequestMapping(value="/obtenerTecnologias", method = RequestMethod.POST)
	public @ApiResponse(value="Lista de tecnologias con los resultados") 
		ResponseEntity<List<TecnologiaDTO>> obtenerTecnologias(
		@ApiParam(value = "Objeto Tecnologia con el filtro a aplicar") 
		@RequestBody TecnologiaDTO tecnologia)  throws Exception{
		logger.info("[INICIO] - obtenerTecnologias");
		
		ResponseEntity<List<TecnologiaDTO>> response;
		List<TecnologiaDTO> lista = null;
		lista = service.get(tecnologia);
		response = new ResponseEntity<List<TecnologiaDTO>>(lista, HttpStatus.OK);

		logger.info("[FIN] - obtenerTecnologias");
		
		return response;
	}
	    
	@ApiOperation(
		value = "crearTecnologia", 
		notes="Añade los datos de una tecnologia en BBDD",
		responseClass="Tecnologia añadida")
	@RequestMapping(value="/crearTecnologia", method = RequestMethod.POST)
	public @ApiResponse(value="Tecnologia Añadida")
		ResponseEntity<TecnologiaDTO> crearTecnologia(
			@ApiParam(value = "Objeto Tecnologia añadir, nombre y cliente obligatorios") 
			@Valid @RequestBody TecnologiaDTO tecnologia)  throws Exception{
		logger.info("[INICIO] - crearTecnologia");
		
		ResponseEntity<TecnologiaDTO> response;
		TecnologiaDTO resultado = service.add(tecnologia);
		response = new ResponseEntity<TecnologiaDTO>(resultado, HttpStatus.CREATED);

		logger.info("[FIN] - crearTecnologia");
		
		return response;
	}
	
	@ApiOperation(
		value = "actualizarTecnologia", 
		notes="Actualiza los datos de una tecnologia en BBDD",
		responseClass="datos actualizados")
	@RequestMapping(value="/actualizarTecnologia", method = RequestMethod.PUT)
	public  @ApiResponse(value="Tecnologia Actualizada") 
		ResponseEntity<TecnologiaDTO> actualizarTecnologia(
			@ApiParam(value = "Objeto Tecnologia a añadir, nombre obligatorio") 
			@Valid @RequestBody TecnologiaDTO tecnologia)  throws Exception{
		logger.info("[INICIO] - tecnologia");
		
		ResponseEntity<TecnologiaDTO> response;
		TecnologiaDTO resultado = service.update(tecnologia);
		response = new ResponseEntity<TecnologiaDTO>(resultado, HttpStatus.CREATED);

		logger.info("[FIN] - actualizarTecnologia");
		
		return response;
	}
	
	@ApiOperation(
		value = "eliminarTecnologia", 
		notes="Elimina los datos de una tecnologia en BBDD",
		responseClass="flag borrado correcto")
	@RequestMapping(value="/eliminarTecnologia", method = RequestMethod.DELETE)
	public @ApiResponse(value="Flag Borrado") 
		ResponseEntity<Boolean> eliminarTecnologia(
			@ApiParam(value = "Objeto Tecnologia a eliminar") 
			@RequestBody TecnologiaDTO tecnologia) throws Exception{
		logger.info("[INICIO] - eliminarTecnologia");
		
		ResponseEntity<Boolean> response;
		Boolean resultado = Boolean.FALSE;
		resultado = service.delete(tecnologia);
		response = new ResponseEntity<Boolean>(resultado, HttpStatus.OK);
		
		logger.info("[FIN] - eliminarTecnologia");
		
		return response;
	}

	@ApiOperation(
			value = "getTecnologiasArquitectura", 
			notes="Devuelve una lista de clientes para cargar desplegables",
			responseClass="List<TecnologiaDTO>")
		@RequestMapping(value="/getTecnologiasArquitectura", method = RequestMethod.GET)
		public @ApiResponse(value="Lista de clientes con los resultados") 
			ResponseEntity<List<TecnologiaDTO>> getTecnologiasArquitectura
			(@ApiParam(value = "Objeto Tecnologia a eliminar") 
				ArquitecturaDTO arquitectura)  throws Exception{
			logger.info("[INICIO] - getTecnologiasArquitectura");
			
			ResponseEntity<List<TecnologiaDTO>> response;
			List<TecnologiaDTO> lista = service.getTecnologiasArquitectura(arquitectura);
			response = new ResponseEntity<List<TecnologiaDTO>>(lista, HttpStatus.OK);

			logger.info("[FIN] - getTecnologiasArquitectura");
			
			return response;
		}
}
