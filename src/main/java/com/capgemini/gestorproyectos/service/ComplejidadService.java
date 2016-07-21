package com.capgemini.gestorproyectos.service;

import java.util.List;

import com.capgemini.gestorproyectos.model.ComplejidadDTO;

public interface ComplejidadService extends BaseCRUDService<ComplejidadDTO>{

	/**
	 * Recupera todas las complejidades.
	 * 
	 * @return lista de <ComplejidadDTO>
	 * @throws Exception
	 */
	List<ComplejidadDTO> getAllComplejidades() throws Exception;
}
