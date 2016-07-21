package com.capgemini.gestorproyectos.service;

import java.util.List;

import com.capgemini.gestorproyectos.model.ClienteDTO;
import com.capgemini.gestorproyectos.model.ProyectoDTO;

public interface ProyectoService extends BaseCRUDService<ProyectoDTO>{

	/**
	 * Obtiene los proyectos asociados a un cliente <ClienteDTO>
	 * 
	 * @param arquitectura <ClienteDTO>
	 * @return lista de <ProyectoDTO>
	 */
	List<ProyectoDTO> getProyectosCliente(ClienteDTO cliente);
}
