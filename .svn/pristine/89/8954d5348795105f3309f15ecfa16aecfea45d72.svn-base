package com.capgemini.gestorproyectos.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.gestorproyectos.dao.ItemDAO;
import com.capgemini.gestorproyectos.exceptions.GestorProyectosException;
import com.capgemini.gestorproyectos.model.ArquitecturaDTO;
import com.capgemini.gestorproyectos.model.ItemDTO;
import com.capgemini.gestorproyectos.model.TecnologiaDTO;
import com.capgemini.gestorproyectos.service.ItemService;
import com.capgemini.gestorproyectos.service.TecnologiaService;

@Service
public class ItemServiceImpl implements ItemService {

	@Autowired
	private ItemDAO itemDAO;

	@Autowired
	private TecnologiaService tecnologiaService;
	
	private Logger logger = LoggerFactory.getLogger(ItemServiceImpl.class);
	
	public List<ItemDTO> get(ItemDTO item) throws Exception {
		logger.debug("[INICIO] - getItems - Filtro: - " + item.toString());
		return this.itemDAO.get(item);
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public ItemDTO add(ItemDTO item) throws Exception {
		logger.debug("[INICIO] - addItem - item: - " + item.toString());
		this.itemDAO.add(item);
		this.itemDAO.addRelacion(item);
		return item;
	}
	
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public ItemDTO update(ItemDTO item) throws Exception {
		logger.debug("[INICIO] - updateItem - item: - " + item.toString());
		if (this.get(item).isEmpty()) {
			throw new GestorProyectosException("000", "El registro a actualizar no existe");
		}
		this.itemDAO.deleteRelacion(item);
		this.itemDAO.update(item);
		if (item.getTecnologias() != null) {
			this.itemDAO.addRelacion(item);
		}
		return item;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public Boolean delete(ItemDTO item) throws Exception {
		logger.debug("[INICIO] - deleteItem - item: - " + item.toString());
		if (!this.tecnologiaService.getTecnologiasItem(item).isEmpty()) {
			throw new GestorProyectosException(
					"000", "No se puede eliminar un registro con tecnologías asociadas");
		}
		if (this.get(item).isEmpty()) {
			throw new GestorProyectosException("000", "El registro a eliminar no existe");
		}
		this.itemDAO.deleteRelacion(item);
		this.itemDAO.delete(item);
		return Boolean.TRUE;
	}

	public List<ItemDTO> getItemsTecnologia(TecnologiaDTO tecnologia) throws Exception {
		logger.debug("[INICIO] - getItemsTecnologia - Filtro: - " + tecnologia.toString());
		return this.itemDAO.getItemsTecnologia(tecnologia);
	}

	public List<ItemDTO> getItemsArquitectura(ArquitecturaDTO arquitectura) {
		logger.debug("[INICIO] - getItemsArquitectura - Filtro: - " + arquitectura.toString());
		return this.itemDAO.getItemsArquitectura(arquitectura);
	}


}
