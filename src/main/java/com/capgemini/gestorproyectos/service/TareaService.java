package com.capgemini.gestorproyectos.service;

import java.util.List;

import com.capgemini.gestorproyectos.model.GrupoTareaDTO;
import com.capgemini.gestorproyectos.model.TareaDTO;

public interface TareaService extends BaseCRUDService<TareaDTO>{

	/**
	 * Devuelve las tareas asociadas a un grupoTarea pasado por parametro.
	 * 
	 * @param grupoTarea <GrupoTareaDTO>
	 * @return lista de <TareaDTO>
	 * @throws Exception
	 */
	List<TareaDTO> getTareasGrupo(GrupoTareaDTO grupoTarea) throws Exception;
	List<TareaDTO> getAllTareas() throws Exception;
}
