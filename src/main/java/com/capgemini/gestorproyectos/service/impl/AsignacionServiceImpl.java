package com.capgemini.gestorproyectos.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.gestorproyectos.dao.AsignacionDAO;
import com.capgemini.gestorproyectos.exceptions.GestorProyectosException;
import com.capgemini.gestorproyectos.model.AsignacionDTO;
import com.capgemini.gestorproyectos.model.RolDTO;
import com.capgemini.gestorproyectos.service.AsignacionService;

@Service
public class AsignacionServiceImpl implements AsignacionService {

	@Autowired
	private AsignacionDAO asignacionDAO;

	private Logger logger = LoggerFactory.getLogger(AsignacionServiceImpl.class);
	
	public List<AsignacionDTO> get(AsignacionDTO asignacion) throws Exception {
		logger.debug("[INICIO] - getAsignaciones - Filtro: - " + asignacion.toString());
		return this.asignacionDAO.get(asignacion);
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public AsignacionDTO add(AsignacionDTO asignacion) throws Exception {
		logger.debug("[INICIO] - addAsignacion - Asignacion: - " + asignacion.toString());
		this.asignacionDAO.add(asignacion);
		return asignacion;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public AsignacionDTO update(AsignacionDTO asignacion) throws Exception {
		logger.debug("[INICIO] - updateAsignacion - asignacion: - " + asignacion.toString());
		if (this.asignacionDAO.update(asignacion) == 0) {
			throw new GestorProyectosException("000", "El registro a actualizar no existe");
		}
		return asignacion;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public Boolean delete(AsignacionDTO asignacion) throws Exception {
		logger.debug("[INICIO] - deletAsignacion - asignacion: - " + asignacion.toString());
		if (this.asignacionDAO.delete(asignacion) == 0) {
			throw new GestorProyectosException("000", "El registro a eliminar no existe");
		}
		return Boolean.TRUE;
	}

	public List<AsignacionDTO> getAsignacionesRol(RolDTO rol) throws Exception {
		logger.debug("[INICIO] - getAsignacionesRol - Filtro: - " + rol.toString());
		return this.asignacionDAO.getAsignacionesRol(rol);
	}

}
