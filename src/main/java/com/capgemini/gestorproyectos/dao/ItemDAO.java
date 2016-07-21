package com.capgemini.gestorproyectos.dao;

import java.util.List;

import com.capgemini.gestorproyectos.model.ArquitecturaDTO;
import com.capgemini.gestorproyectos.model.ItemDTO;
import com.capgemini.gestorproyectos.model.TecnologiaDTO;

/**
 * DAO para las operaciones de BBDD de la tabla Items
 * mapea al fichero ItemMapper.xml
 * @author capgemini
 *
 */
public interface ItemDAO extends BaseCRUDDAO<ItemDTO> {
	
	/**
	 * Crear la relacion entre items y tecnologias 
	 * 
	 * @param item <ItemDTO>
	 * @return 
	 */
	Long addRelacion(ItemDTO item);

	/**
	 * Elimina la relacion entre items y tecnologias 
	 * 
	 * @param item <ItemDTO>
	 * @return 
	 */
	Long deleteRelacion(ItemDTO item);
	
	/**
	 * obtiene los items asociados a una tecnologia <TecnologiaDTO>
	 * 
	 * @param tecnologia <TecnologiaDTO>
	 * @return
	 */
	List<ItemDTO> getItemsTecnologia(TecnologiaDTO tecnologia);

	/**
	 * obtiene los items asociados a una arquitectura <ArquitecturaDTO>
	 * 
	 * @param arquitectura <ArquitecturaDTO>
	 * @return
	 */
	List<ItemDTO> getItemsArquitectura(ArquitecturaDTO arquitectura);
}
