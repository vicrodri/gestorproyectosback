package com.capgemini.gestorproyectos.service;

import java.util.List;

import com.capgemini.gestorproyectos.model.ArquitecturaDTO;
import com.capgemini.gestorproyectos.model.ItemDTO;
import com.capgemini.gestorproyectos.model.TecnologiaDTO;

public interface ItemService extends BaseCRUDService<ItemDTO>{

	/**
	 * Devuelve los items asociados a una tecnologia pasada por parametro.
	 * 
	 * @param cliente <TecnologiaDTO>
	 * @return lista de <ItemDTO>
	 * @throws Exception
	 */
	List<ItemDTO> getItemsTecnologia(TecnologiaDTO tecnologia) throws Exception;

	/**
	 * Devuelve los items asociados a una arquitectura pasada por parametro.
	 * 
	 * @param cliente <ArquitecturaDTO>
	 * @return lista de <ItemDTO>
	 * @throws Exception
	 */
	List<ItemDTO> getItemsArquitectura(ArquitecturaDTO arquitectura);

}
