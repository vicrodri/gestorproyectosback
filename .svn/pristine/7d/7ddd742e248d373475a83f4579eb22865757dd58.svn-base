package com.capgemini.gestorproyectos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.gestorproyectos.model.FilterEstimacion;
import com.capgemini.gestorproyectos.model.estimacionDTO;
import com.capgemini.gestorproyectos.model.estimacionDTO;
import com.capgemini.gestorproyectos.service.estimacionesService;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;

@Controller
@RequestMapping("/rest/estimacion")
public class estimacionController extends BaseController {

	@Autowired
	estimacionesService service;
	
	@RequestMapping(value="/crearEstimacion",method=RequestMethod.POST)
	public @ApiResponse(value="Lista de funcionalidades") ResponseEntity<estimacionDTO> crearFuncionalidad(@RequestBody estimacionDTO funcionalidad) throws Exception
	{
		service.add(funcionalidad);
		return new ResponseEntity<estimacionDTO>(funcionalidad,HttpStatus.OK);
	}

	@RequestMapping(value="/updateEstimacion",method=RequestMethod.POST)
	public @ApiResponse(value="Lista de funcionalidades") ResponseEntity<estimacionDTO> updateFuncionalidad(@RequestBody estimacionDTO funcionalidad) throws Exception
	{
		service.update(funcionalidad);
		return new ResponseEntity<estimacionDTO>(funcionalidad,HttpStatus.OK);
	}
	
	@RequestMapping(value="/obtenerEstimacion",method=RequestMethod.POST)
	public @ApiResponse(value="Lista de funcionalidades") ResponseEntity<List<estimacionDTO>> obtenerFuncionalidad(@RequestBody FilterEstimacion filtro) throws Exception
	{
		List<estimacionDTO> lista= service.filtrarEstimacion(filtro);

		return new ResponseEntity<List<estimacionDTO>>(lista,HttpStatus.OK);
	}
	@RequestMapping(value="/getAllEstimaciones",method=RequestMethod.POST)
	public ResponseEntity<List<estimacionDTO>> getAllEstimaciones() throws Exception
	{
		return new ResponseEntity<List<estimacionDTO>>(service.getAllEstimaciones(),HttpStatus.OK);
	}
	@RequestMapping(value="/deleteEstimacion",method=RequestMethod.POST)
	public ResponseEntity<estimacionDTO> deleteEstimacion(@RequestBody estimacionDTO estimacion) throws Exception
	{
		Boolean bool=service.delete(estimacion);
		
		if(bool)
			return new ResponseEntity<estimacionDTO>(estimacion, HttpStatus.OK);
			
			else return new ResponseEntity<estimacionDTO>(estimacion,HttpStatus.I_AM_A_TEAPOT);
		
	}
}
