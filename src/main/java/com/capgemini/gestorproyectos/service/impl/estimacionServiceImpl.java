package com.capgemini.gestorproyectos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.gestorproyectos.dao.estimacionDAO;
import com.capgemini.gestorproyectos.exceptions.GestorProyectosException;
import com.capgemini.gestorproyectos.model.FilterEstimacion;
import com.capgemini.gestorproyectos.model.estimacionDTO;
import com.capgemini.gestorproyectos.service.estimacionesService;

@Service
public class estimacionServiceImpl implements estimacionesService {
@Autowired
estimacionDAO service;
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public List<estimacionDTO> get(estimacionDTO cliente) throws Exception {
		// TODO Auto-generated method stub
		return this.service.get(cliente);
	}
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public estimacionDTO add(estimacionDTO cliente) throws Exception {
		// TODO Auto-generated method stub
	 this.service.add(cliente);
		 return cliente;
	}
	
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public estimacionDTO update(estimacionDTO cliente) throws Exception {
		// TODO Auto-generated method stub
	Long count=	this.service.update(cliente);
	if(count<1)
		throw new GestorProyectosException("000", "El registro a actualizar no existe");

		return cliente;
	}
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public Boolean delete(estimacionDTO cliente) throws Exception {
		// TODO Auto-generated method stub
	Long count=	this.service.delete(cliente);
	if(count==0)
		throw new GestorProyectosException("000", "El registro a borrar no existe");
		return true;
	}
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public List<estimacionDTO> getAllEstimaciones() throws Exception {
		// TODO Auto-generated method stub
		List<estimacionDTO> lista= this.service.getAllEstimaciones();
		return lista;
	}
	public List<estimacionDTO> filtrarEstimacion(FilterEstimacion filtro) {
		// TODO Auto-generated method stub
		return this.service.filtrarEstimacion(filtro);
	}

}
