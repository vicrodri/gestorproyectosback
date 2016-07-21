package com.capgemini.gestorproyectos.service;

import java.util.List;

import com.capgemini.gestorproyectos.model.ComplejidadDTO;
import com.capgemini.gestorproyectos.model.GrupoTareaDTO;
import com.capgemini.gestorproyectos.model.TamanioDTO;

public interface GrupoTareaService extends BaseCRUDService<GrupoTareaDTO>{

	/**
	 * Devuelve los grupos de tareas asociados a una complejidad pasada por parametro.
	 * 
	 * @param complejidad <ComplejidadDTO>
	 * @return lista de <GrupoTareaDTO>
	 * @throws Exception
	 */
	List<GrupoTareaDTO> getGruposComplejidad(ComplejidadDTO complejidad) throws Exception;

	/**
	 * Devuelve los grupos de tareas asociados a un tamanio pasado por parametro.
	 * 
	 * @param tamanio <TamanioDTO>
	 * @return lista de <GrupoTareaDTO>
	 * @throws Exception
	 */
	List<GrupoTareaDTO> getGruposTamanio(TamanioDTO tamanio) throws Exception;

}
