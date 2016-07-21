package com.capgemini.gestorproyectos.service;

import java.util.List;

import com.capgemini.gestorproyectos.model.FuncionalidadesDTO;

public interface FuncionalidadesService extends BaseCRUDService<FuncionalidadesDTO>{
	
	List<FuncionalidadesDTO> getAllFuncionalidades() throws Exception;

}
