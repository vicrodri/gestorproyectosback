package com.capgemini.gestorproyectos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.gestorproyectos.dao.pasosDAO;
import com.capgemini.gestorproyectos.model.pasosDTO;
import com.capgemini.gestorproyectos.service.pasosService;

@Service
public class pasosServiceImpl implements pasosService {

	@Autowired
	pasosDAO service;
	public List<pasosDTO> get(pasosDTO cliente) throws Exception {
		// TODO Auto-generated method stub
		List<pasosDTO> pasos= service.get(cliente);
		return pasos;
	}

	public pasosDTO add(pasosDTO cliente) throws Exception {
		// TODO Auto-generated method stub
		service.add(cliente);
		return cliente;
	}

	public pasosDTO update(pasosDTO cliente) throws Exception {
		// TODO Auto-generated method stub
		service.update(cliente);
		return cliente;
	}

	public Boolean delete(pasosDTO cliente) throws Exception {
		// TODO Auto-generated method stub
		return service.delete(cliente)>0?true:false;
	}

	public List<pasosDTO> getAllPasos() throws Exception {
		// TODO Auto-generated method stub
		return service.getAllPasos();
	}

}
