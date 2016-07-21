package com.capgemini.gestorproyectos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capgemini.gestorproyectos.model.pasosDTO;
import com.capgemini.gestorproyectos.service.pasosService;

@Controller
@RequestMapping("/rest/pasos")
public class pasosController extends BaseController {

	@Autowired
	pasosService service;
	@RequestMapping(value="/getAllPasos",method=RequestMethod.POST)
	public ResponseEntity<List<pasosDTO>> getAllPasos() throws Exception
	{
	List<pasosDTO> lista=	service.getAllPasos();
		
	return new ResponseEntity<List<pasosDTO>>(lista, HttpStatus.OK);
	}
}
