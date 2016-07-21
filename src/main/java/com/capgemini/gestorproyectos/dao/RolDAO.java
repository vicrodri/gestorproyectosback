package com.capgemini.gestorproyectos.dao;

import java.util.List;

import com.capgemini.gestorproyectos.model.RolDTO;

/**
 * DAO para las operaciones de BBDD de la tabla Roles
 * mapea al fichero RolMapper.xml
 * @author capgemini
 *
 */
public interface RolDAO extends BaseCRUDDAO<RolDTO> {
	
	/**
	 * Devuelve todos los registros de la tabla Roles.
	 * 
	 * @param rol <RolDTO>
	 * @return lista de <RolDTO>
	 */
	List<RolDTO> getAll();
}
