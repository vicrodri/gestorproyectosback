package com.capgemini.gestorproyectos.service;

import java.util.List;

import com.capgemini.gestorproyectos.model.ArquitecturaDTO;
import com.capgemini.gestorproyectos.model.ItemDTO;
import com.capgemini.gestorproyectos.model.TecnologiaDTO;

public interface TecnologiaService extends BaseCRUDService<TecnologiaDTO>{

	/**
	 * Devuelve las tecnologias asociadas a una arquitectura pasada por parametro.
	 * 
	 * @param arquitectura <ArquitecturaDTO>
	 * @return lista de <TecnologiaDTO>
	 * @throws Exception
	 */
	List<TecnologiaDTO> getTecnologiasArquitectura(ArquitecturaDTO arquitectura) throws Exception;

	/**
	 * Devuelve las tecnologias asociadas a un item pasado por parametro.
	 * 
	 * @param item <ItemDTO>
	 * @return lista de <TecnologiaDTO>
	 */
	List<TecnologiaDTO> getTecnologiasItem(ItemDTO item);
}
