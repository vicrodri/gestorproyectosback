package com.capgemini.gestorproyectos.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.gestorproyectos.dao.TecnologiaDAO;
import com.capgemini.gestorproyectos.exceptions.GestorProyectosException;
import com.capgemini.gestorproyectos.model.ArquitecturaDTO;
import com.capgemini.gestorproyectos.model.ItemDTO;
import com.capgemini.gestorproyectos.model.TecnologiaDTO;
import com.capgemini.gestorproyectos.service.ArquitecturaService;
import com.capgemini.gestorproyectos.service.ItemService;
import com.capgemini.gestorproyectos.service.TecnologiaService;

@Service
public class TecnologiaServiceImpl implements TecnologiaService {

	@Autowired
	private TecnologiaDAO tecnologiaDAO;

	@Autowired
	private ArquitecturaService arquitecturaService;
	
	@Autowired
	private ItemService itemService;
	
	
	private Logger logger = LoggerFactory.getLogger(TecnologiaServiceImpl.class);
	
	public List<TecnologiaDTO> get(TecnologiaDTO tecnologia) throws Exception {
		logger.debug("[INICIO] - getTecnologias - Filtro: - " + tecnologia.toString());
		return this.tecnologiaDAO.get(tecnologia);
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public TecnologiaDTO add(TecnologiaDTO tecnologia) throws Exception {
		logger.debug("[INICIO] - addTecnologia - tecnologia: - " + tecnologia.toString()); 
		this.tecnologiaDAO.add(tecnologia);
		return tecnologia;
	}
	
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public TecnologiaDTO update(TecnologiaDTO tecnologia) throws Exception {
		logger.debug("[INICIO] - updateTecnologia - tecnologia: - " + tecnologia.toString());
		if (this.tecnologiaDAO.update(tecnologia) == 0) {
			throw new GestorProyectosException("000", "El registro a actualizar no existe");
		}
		return tecnologia;
	}
	
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public Boolean delete(TecnologiaDTO tecnologia) throws Exception {
		logger.debug("[INICIO] - deleteTecnologia - tecnologia: - " + tecnologia.toString());
		if (!this.arquitecturaService.getArquitecturasTecnologia(tecnologia).isEmpty() || 
				!this.itemService.getItemsTecnologia(tecnologia).isEmpty()) {
			throw new GestorProyectosException(
					"000", "No se puede eliminar un registro con arquitecturas o items asociados");
		}
		if (this.tecnologiaDAO.delete(tecnologia) == 0) {
			throw new GestorProyectosException("000", "El registro a eliminar no existe");
		}
		return Boolean.TRUE;
	}

	public List<TecnologiaDTO> getTecnologiasArquitectura(ArquitecturaDTO arquitectura) throws Exception {
		logger.debug("[INICIO] - getTecnologiasArquitectura - Filtro: - " + arquitectura.toString());
		return this.tecnologiaDAO.getTecnologiasArquitectura(arquitectura);
	}

	public List<TecnologiaDTO> getTecnologiasItem(ItemDTO item) {
		logger.debug("[INICIO] - getTecnologiasItem - Filtro: - " + item.toString());
		return this.tecnologiaDAO.getTecnologiasItem(item);
	}
		
}
