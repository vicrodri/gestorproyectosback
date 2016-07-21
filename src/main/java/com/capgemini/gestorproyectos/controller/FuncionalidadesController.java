package com.capgemini.gestorproyectos.controller;

import java.util.List;

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
import com.capgemini.gestorproyectos.model.FuncionalidadesDTO;
import com.capgemini.gestorproyectos.service.FuncionalidadesService;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wordnik.swagger.annotations.ApiResponse;

@Api(value = "FuncionalidadesController", description = "Rest controller de Funcionalidades") 
@Controller
@RequestMapping("/rest/funcionalidades")
public class FuncionalidadesController extends BaseController {
	@Autowired
	FuncionalidadesService service;
	private Logger logger = LoggerFactory.getLogger(FuncionalidadesController.class);
	@ApiOperation(
			value = "obtenerAllFuncionalidades", 
			notes="Devuelve una lista de Arquitecturas en función del filtro pasado como parámetro",
			responseClass="List<FuncionalidadesDTO>")
	@RequestMapping(value="/obtenerAllFuncionalidades", method = RequestMethod.POST)
	public @ApiResponse(value="Lista de funcionalidades") 
		ResponseEntity<List<FuncionalidadesDTO>> obtenerFuncionalidades()  throws Exception{
		
		ResponseEntity<List<FuncionalidadesDTO>> response;
		List<FuncionalidadesDTO> lista = null;
		lista = service.getAllFuncionalidades();
		response = new ResponseEntity<List<FuncionalidadesDTO>>(lista, HttpStatus.OK);

		
		
		return response;
	}
	
	@ApiOperation(value="crearFuncionalidad",notes="Crear una funcionalidad",responseClass="List<FuncionalidadesDTO>")
	@RequestMapping(value="crearFuncionalidad",method=RequestMethod.POST)
	public @ApiResponse(value="Lista de funcionalidades") ResponseEntity<FuncionalidadesDTO> crearFuncionalidad(@RequestBody FuncionalidadesDTO funcionalidad) throws Exception
	{
		service.add(funcionalidad);
		return new ResponseEntity<FuncionalidadesDTO>(funcionalidad,HttpStatus.CREATED);
	}
	@ApiOperation(value="updateFuncionalidad",notes="Actualizar una funcionalidad",responseClass="List<FuncionalidadesDTO>")
	@RequestMapping(value="updateFuncionalidad",method=RequestMethod.POST)
	public @ApiResponse(value="Lista de funcionalidades") ResponseEntity<FuncionalidadesDTO> updateFuncionalidad(@RequestBody FuncionalidadesDTO funcionalidad) throws Exception
	{
		service.update(funcionalidad);
		return new ResponseEntity<FuncionalidadesDTO>(funcionalidad,HttpStatus.OK);
	}
	@ApiOperation(value="obtenerFuncionalidad",notes="Actualizar una funcionalidad",responseClass="List<FuncionalidadesDTO>")
	@RequestMapping(value="obtenerFuncionalidad",method=RequestMethod.POST)
	public @ApiResponse(value="Lista de funcionalidades") ResponseEntity<List<FuncionalidadesDTO>> obtenerFuncionalidad(@RequestBody FuncionalidadesDTO funcionalidad) throws Exception
	{
		List<FuncionalidadesDTO> lista= service.get(funcionalidad);
		return new ResponseEntity<List<FuncionalidadesDTO>>(lista,HttpStatus.OK);
	}

}
