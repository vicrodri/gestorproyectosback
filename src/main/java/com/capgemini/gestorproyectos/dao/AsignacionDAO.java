package com.capgemini.gestorproyectos.dao;

import java.util.List;

import com.capgemini.gestorproyectos.model.AsignacionDTO;
import com.capgemini.gestorproyectos.model.RolDTO;

/**
 * DAO para las operaciones de BBDD de la tabla asignaciones
 * mapea al fichero AsignacionMapper.xml
 * @author capgemini
 *
 */
public interface AsignacionDAO extends BaseCRUDDAO<AsignacionDTO> {
	
	/**
	 * Devuelve las asignaciones asociadas a un rol.
	 * 
	 * @param asignacion <RolDTO>
	 * @return lista de <AsignacionDTO>
	 */
	List<AsignacionDTO> getAsignacionesRol(RolDTO rol);
}
