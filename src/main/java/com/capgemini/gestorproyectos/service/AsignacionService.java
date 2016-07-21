package com.capgemini.gestorproyectos.service;

import java.util.List;

import com.capgemini.gestorproyectos.model.AsignacionDTO;
import com.capgemini.gestorproyectos.model.RolDTO;

public interface AsignacionService extends BaseCRUDService<AsignacionDTO>{

	/**
	 * Recupera una lista de asignaciones en funcion del rol indicado.
	 * 
	 * @param rol <RolDTO>
	 * @return lista de <AsignacionDTO>
	 * @throws Exception
	 */
	List<AsignacionDTO> getAsignacionesRol(RolDTO rol) throws Exception;
}
