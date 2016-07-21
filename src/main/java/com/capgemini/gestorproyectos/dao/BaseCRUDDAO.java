package com.capgemini.gestorproyectos.dao;

import java.util.List;

/**
 * DAO Base para las operaciones CRUD en BBDD
 * @author capgemini
 *
 */
public interface BaseCRUDDAO <T>{
	
	/**
	 * Devuelve los registros de la tabla.
	 * 
	 * @param filtro <T>
	 * @return lista de <T>
	 */
	List<T> get(T elemento);

	/**
	 * Crear un elemento 
	 * 
	 * @param elemento <T>
	 * @return elemento <T> creado
	 */
	Long add(T elemento);

	/**
	 * Actualiza un elemento <T>
	 * 
	 * @param cliente <T>
	 * @return
	 */
	Long update(T elemento);

	/**
	 * elimina un elemento <T>
	 * 
	 * @param elemento <T>
	 * @return
	 */
	Long delete(T elemento);

}
