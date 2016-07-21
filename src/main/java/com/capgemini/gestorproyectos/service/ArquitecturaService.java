package com.capgemini.gestorproyectos.service;

import java.util.List;

import com.capgemini.gestorproyectos.model.ArquitecturaDTO;
import com.capgemini.gestorproyectos.model.ClienteDTO;
import com.capgemini.gestorproyectos.model.TecnologiaDTO;

public interface ArquitecturaService extends BaseCRUDService<ArquitecturaDTO>{

	/**
	 * Recupera una lista de arquitecturas para cargar los desplegables.
	 * 
	 * @return lista de <ArquitecturaDTO>
	 * @throws Exception
	 */
	List<ArquitecturaDTO> getAll() throws Exception;
	
	/**
	 * Devuelve las arquitecturas asociadas a un cliente pasado por parametro.
	 * 
	 * @param cliente <ClienteDTO>
	 * @return lista de <ArquitecturaDTO>
	 * @throws Exception
	 */
	List<ArquitecturaDTO> getArquitecturasCliente(ClienteDTO cliente) throws Exception;

	/**
	 * Devuelve las arquitecturas asociadas a una tecnologia pasada por parametro.
	 * 
	 * @param cliente <TecnologiaDTO>
	 * @return lista de <ArquitecturaDTO>
	 * @throws Exception
	 */
	List<ArquitecturaDTO> getArquitecturasTecnologia(TecnologiaDTO tecnologia) throws Exception;

}
