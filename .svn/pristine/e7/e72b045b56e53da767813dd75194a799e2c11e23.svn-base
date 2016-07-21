package com.capgemini.gestorproyectos.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.gestorproyectos.dao.TamanioDAO;
import com.capgemini.gestorproyectos.exceptions.GestorProyectosException;
import com.capgemini.gestorproyectos.model.TamanioDTO;
import com.capgemini.gestorproyectos.service.GrupoTareaService;
import com.capgemini.gestorproyectos.service.TamanioService;

@Service
public class TamanioServiceImpl implements TamanioService {

	@Autowired
	private TamanioDAO tamanioDAO;

	@Autowired
	private GrupoTareaService grupoTareaService;
	
	private Logger logger = LoggerFactory.getLogger(TamanioServiceImpl.class);
	
	public List<TamanioDTO> get(TamanioDTO tamanio) throws Exception {
		logger.debug("[INICIO] - getTamanios - Filtro: " + tamanio);
		return this.tamanioDAO.get(tamanio);
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public TamanioDTO add(TamanioDTO tamanio) throws Exception {
		logger.debug("[INICIO] - addTamanio - Tamanio: - " + tamanio.toString());
		this.tamanioDAO.add(tamanio);
		return tamanio;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public TamanioDTO update(TamanioDTO tamanio) throws Exception {
		logger.debug("[INICIO] - updateTamanio - Tamanio: - " + tamanio.toString());
		if (this.tamanioDAO.update(tamanio) == 0) {
			throw new GestorProyectosException("000", "El registro a actualizar no existe");
		}
		return tamanio;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public Boolean delete(TamanioDTO tamanio) throws Exception {
		logger.debug("[INICIO] - deleteTamanio - Tamanio: - " + tamanio.toString());
		
		if (!this.grupoTareaService.getGruposTamanio(tamanio).isEmpty()) {
			throw new GestorProyectosException(
					"000", "No se puede eliminar un registro asociado a un grupo de tareas");
		}
		
		if (this.tamanioDAO.delete(tamanio) == 0) {
			throw new GestorProyectosException("000", "El registro a eliminar no existe");
		}
		return Boolean.TRUE;
	}

	public List<TamanioDTO> getAllTamanios() throws Exception {
		logger.debug("[INICIO] - getTamanios ");
		return this.tamanioDAO.getAll();
	}

}
