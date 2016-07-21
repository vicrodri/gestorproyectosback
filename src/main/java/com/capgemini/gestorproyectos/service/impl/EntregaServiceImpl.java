package com.capgemini.gestorproyectos.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.gestorproyectos.dao.EntregaDAO;
import com.capgemini.gestorproyectos.model.EntregaDTO;
import com.capgemini.gestorproyectos.model.FilterEntrega;
import com.capgemini.gestorproyectos.service.EntregaService;

@Service
public class EntregaServiceImpl implements EntregaService {

	@Autowired
	private EntregaDAO entregaDao;
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public List<EntregaDTO> get(EntregaDTO cliente) throws Exception {
		// TODO Auto-generated method stub
		return this.entregaDao.getAllEntregas();
	}
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public EntregaDTO add(EntregaDTO cliente) throws Exception {
		// TODO Auto-generated method stub
		this.entregaDao.add(cliente);
		return cliente;
		
	}
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public EntregaDTO update(EntregaDTO cliente) throws Exception {
		// TODO Auto-generated method stub
		
			this.entregaDao.update(cliente);
			
			return cliente;
		
	}
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public Boolean delete(EntregaDTO cliente) throws Exception {
		// TODO Auto-generated method stub
	this.entregaDao.delete(cliente);
	return Boolean.TRUE;
	}
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public List<EntregaDTO> getAllEntregas() throws Exception {
		// TODO Auto-generated method stub
		List<EntregaDTO> lista=entregaDao.getAllEntregas();
		return lista;
	}
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public List<EntregaDTO> getByDate(FilterEntrega filterentrega) throws Exception {
		// TODO Auto-generated method stub
		return this.entregaDao.getByDate(filterentrega);
	}

}
