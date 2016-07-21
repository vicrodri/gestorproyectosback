package com.capgemini.gestorproyectos.dao;

import java.util.List;

import com.capgemini.gestorproyectos.model.ComplejidadDTO;
import com.capgemini.gestorproyectos.model.GrupoTareaDTO;
import com.capgemini.gestorproyectos.model.TamanioDTO;

/**
 * DAO para las operaciones de BBDD de la tabla grupo_tareas
 * mapea al fichero GrupoTareaMapper.xml
 * @author capgemini
 *
 */
public interface GrupoTareaDAO extends BaseCRUDDAO<GrupoTareaDTO> {
	
	/**
	 * Devuelve los registros de la tabla grupo_tareas.
	 * 
	 * @param complejidad <ComplejidadDTO>
	 * @return lista de <GrupoTareaDTO>
	 */
	List<GrupoTareaDTO> getGruposComplejidad(ComplejidadDTO complejidad);
	
	/**
	 * Devuelve los registros de la tabla grupo_tareas.
	 * 
	 * @param tamanio <TamanioDTO>
	 * @return lista de <GrupoTareaDTO>
	 */
	List<GrupoTareaDTO> getGruposTamanio(TamanioDTO tamanio);
}
