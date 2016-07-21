package com.capgemini.gestorproyectos.dao;

import java.util.List;

import com.capgemini.gestorproyectos.model.ClienteDTO;
import com.capgemini.gestorproyectos.model.ProyectoDTO;

/**
 * DAO para las operaciones de BBDD de la tabla proyectos
 * mapea al fichero ProyectoMapper.xml
 * @author capgemini
 *
 */
public interface ProyectoDAO extends BaseCRUDDAO<ProyectoDTO> {
	
	/**
	 * obtiene las proyectos asociadas a un cliente <ClienteDTO>
	 * 
	 * @param arquitectura <ClienteDTO>
	 * @return lista de <ProyectoDTO>
	 */
	List<ProyectoDTO> getProyectosCliente(ClienteDTO cliente);
}
