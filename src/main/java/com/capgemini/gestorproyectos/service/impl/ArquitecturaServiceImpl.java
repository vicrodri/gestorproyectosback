package com.capgemini.gestorproyectos.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.gestorproyectos.dao.ArquitecturaDAO;
import com.capgemini.gestorproyectos.exceptions.GestorProyectosException;
import com.capgemini.gestorproyectos.model.ArquitecturaDTO;
import com.capgemini.gestorproyectos.model.ClienteDTO;
import com.capgemini.gestorproyectos.model.TecnologiaDTO;
import com.capgemini.gestorproyectos.service.ArquitecturaService;
import com.capgemini.gestorproyectos.service.ItemService;
import com.capgemini.gestorproyectos.service.TecnologiaService;

@Service
public class ArquitecturaServiceImpl implements ArquitecturaService {

	@Autowired
	private ArquitecturaDAO arquitecturaDAO;

	@Autowired
	private TecnologiaService tecnologiaService;
	
	@Autowired
	private ItemService itemService;
	
	private Logger logger = LoggerFactory.getLogger(ArquitecturaServiceImpl.class);
	
	public List<ArquitecturaDTO> get(ArquitecturaDTO arquitectura) throws Exception {
		logger.debug("[INICIO] - getArquitecturas - Filtro: - " + arquitectura.toString());
		return this.arquitecturaDAO.get(arquitectura);
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public ArquitecturaDTO add(ArquitecturaDTO arquitectura) throws Exception {
		logger.debug("[INICIO] - addArquitectura - Arquitectura: - " + arquitectura.toString());
		this.arquitecturaDAO.add(arquitectura);
		return arquitectura;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public ArquitecturaDTO update(ArquitecturaDTO arquitectura) throws Exception {
		logger.debug("[INICIO] - updateArquitectura - arquitectura: - " + arquitectura.toString());
		if (this.arquitecturaDAO.update(arquitectura) == 0) {
			throw new GestorProyectosException("000", "El registro a actualizar no existe");
		}
		return arquitectura;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public Boolean delete(ArquitecturaDTO arquitectura) throws Exception {
		logger.debug("[INICIO] - deletArquitectura - arquitectura: - " + arquitectura.toString());
		if (!this.tecnologiaService.getTecnologiasArquitectura(arquitectura).isEmpty() || 
				!this.itemService.getItemsArquitectura(arquitectura).isEmpty()) {
			throw new GestorProyectosException(
					"000", "No se puede eliminar un registro con tecnologías o items asociados");
		}
		if (this.arquitecturaDAO.delete(arquitectura) == 0) {
			throw new GestorProyectosException("000", "El registro a eliminar no existe");
		}
		return Boolean.TRUE;
	}

	public List<ArquitecturaDTO> getAll() throws Exception {
		logger.debug("[INICIO] - getAll");
		return this.arquitecturaDAO.getAllArq();
	}
	
	public List<ArquitecturaDTO> getArquitecturasCliente(ClienteDTO cliente) throws Exception {
		logger.debug("[INICIO] - getArquitecturasCliente - Filtro: - " + cliente.toString());
		return this.arquitecturaDAO.getArquitecturasCliente(cliente);
	}

	public List<ArquitecturaDTO> getArquitecturasTecnologia(TecnologiaDTO tecnologia) throws Exception {
		logger.debug("[INICIO] - getArquitecturasTecnologia - Filtro: - " + tecnologia.toString());
		return this.arquitecturaDAO.getArquitecturasTecnologia(tecnologia);
	}
		
}
