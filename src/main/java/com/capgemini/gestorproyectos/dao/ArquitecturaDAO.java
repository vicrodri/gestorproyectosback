package com.capgemini.gestorproyectos.dao;

import java.util.List;

import com.capgemini.gestorproyectos.model.ArquitecturaDTO;
import com.capgemini.gestorproyectos.model.ClienteDTO;
import com.capgemini.gestorproyectos.model.TecnologiaDTO;

/**
 * DAO para las operaciones de BBDD de la tabla Arquitecturas
 * mapea al fichero ArquitecturaMapper.xml
 * @author capgemini
 *
 */
public interface ArquitecturaDAO extends BaseCRUDDAO<ArquitecturaDTO>{
	
	/**
	 * Devuelve todos los registros de la tabla Arquitecturas.
	 * 
	 * @return lista de <ArquitecturaDTO>
	 */
	List<ArquitecturaDTO> getAllArq();
	
	/**
	 * obtiene los arquitecturas asociadas a un cliente <ClienteDTO>
	 * 
	 * @param cliente <ClienteDTO>
	 * @return
	 */
	List<ArquitecturaDTO> getArquitecturasCliente(ClienteDTO cliente);
	
	/**
	 * obtiene las arquitecturas asociadas a una tecnologia <TecnologiaDTO>
	 * 
	 * @param tecnologia
	 * @return
	 */
	List<ArquitecturaDTO> getArquitecturasTecnologia(TecnologiaDTO tecnologia);
}
