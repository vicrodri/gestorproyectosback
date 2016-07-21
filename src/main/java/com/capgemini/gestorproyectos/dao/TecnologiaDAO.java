package com.capgemini.gestorproyectos.dao;

import java.util.List;

import com.capgemini.gestorproyectos.model.ArquitecturaDTO;
import com.capgemini.gestorproyectos.model.ItemDTO;
import com.capgemini.gestorproyectos.model.TecnologiaDTO;

/**
 * DAO para las operaciones de BBDD de la tabla Tecnologias
 * mapea al fichero TecnologiaMapper.xml
 * @author capgemini
 *
 */
public interface TecnologiaDAO extends BaseCRUDDAO<TecnologiaDTO>{
	
	/**
	 * obtiene las tecnologias asociadas a una arquitectura <ArquitecturaDTO>
	 * 
	 * @param arquitectura <ArquitecturaDTO>
	 * @return
	 */
	List<TecnologiaDTO> getTecnologiasArquitectura(ArquitecturaDTO arquitectura);

	/**
	 * obtiene las tecnologias asociadas a un item <ItemDTO>
	 * 
	 * @param item <ItemDTO>
	 * @return
	 */
	List<TecnologiaDTO> getTecnologiasItem(ItemDTO item);
}
