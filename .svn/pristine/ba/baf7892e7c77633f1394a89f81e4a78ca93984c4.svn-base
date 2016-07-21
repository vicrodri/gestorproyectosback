package com.capgemini.gestorproyectos.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.gestorproyectos.dao.FuncionalidadesDAO;
import com.capgemini.gestorproyectos.model.FuncionalidadesDTO;
import com.capgemini.gestorproyectos.service.FuncionalidadesService;

@Service
public class FuncionalidadesServiceImpl implements FuncionalidadesService {

	@Autowired
	FuncionalidadesDAO funcionalidadesDAO;
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public List<FuncionalidadesDTO> get(FuncionalidadesDTO functDTO) throws Exception {
		// TODO Auto-generated method stub
		return this.funcionalidadesDAO.get(functDTO);
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public FuncionalidadesDTO add(FuncionalidadesDTO cliente) throws Exception {
		// TODO Auto-generated method stub
		this.funcionalidadesDAO.add(cliente);
		return cliente;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public FuncionalidadesDTO update(FuncionalidadesDTO cliente) throws Exception {
		// TODO Auto-generated method stub
		this.funcionalidadesDAO.update(cliente);
		return cliente;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public Boolean delete(FuncionalidadesDTO cliente) throws Exception {
		// TODO Auto-generated method stub
		if(this.funcionalidadesDAO.delete(cliente)>0)return true;
		else 
		return false;
	}


	public List<FuncionalidadesDTO> getAllFuncionalidades() {
		// TODO Auto-generated method stub
		return this.funcionalidadesDAO.getAllFuncionalidades();
	}

}
