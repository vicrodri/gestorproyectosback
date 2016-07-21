package com.capgemini.gestorproyectos.service;

import java.util.List;

public interface BaseCRUDService<T> {

	/**
	 * Recupera una lista de clientes en funcion del filtro indicado.
	 * 
	 * @param cliente <ClienteDTO>
	 * @return lista de <ClienteDTO>
	 * @throws Exception
	 */
	List<T> get(T cliente) throws Exception;
	
	/**
	 * Crea un registro de tipo <ClienteDTO> en BBDD
	 * 
	 * @param cliente <ClienteDTO>
	 * @return cliente <ClienteDTO> añadido con su ID
	 * @throws Exception
	 */
	T add(T cliente) throws Exception;
	
	/**
	 * Actualiza un registro de tipo <ClienteDTO> en BBDD
	 * 
	 * @param cliente <ClienteDTO>
	 * @return 
	 * @throws Exception
	 */
	T update(T cliente) throws Exception;
	
	/**
	 * Elimina un registro de tipo <ClienteDTO> en BBDD
	 * 
	 * @param cliente <ClienteDTO>
	 * @return 
	 * @throws Exception
	 */
	Boolean delete(T cliente) throws Exception;
	
}
