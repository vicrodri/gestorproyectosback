package com.capgemini.gestorproyectos.service;

import java.util.List;

import com.capgemini.gestorproyectos.model.pasosDTO;

public interface  pasosService extends BaseCRUDService<pasosDTO>{
	
	List<pasosDTO> getAllPasos() throws Exception;

}
