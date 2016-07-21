package com.capgemini.gestorproyectos.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.capgemini.gestorproyectos.dao.PersonaDAO;
import com.capgemini.gestorproyectos.exceptions.GestorProyectosException;
import com.capgemini.gestorproyectos.model.PersonaDTO;
import com.capgemini.gestorproyectos.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaDAO personaDAO;
	
	private Logger logger = LoggerFactory.getLogger(PersonaServiceImpl.class);
	
	public List<PersonaDTO> get(PersonaDTO persona) throws Exception {
		logger.debug("[INICIO] - getPersonas - Filtro: - " + persona.toString());
		return this.personaDAO.get(persona);
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public PersonaDTO add(PersonaDTO persona) throws Exception {
		logger.debug("[INICIO] - addPersona -Persona: - " + persona.toString());
		this.personaDAO.add(persona);
		return persona;
	}

	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public PersonaDTO update(PersonaDTO persona) throws Exception {
		logger.debug("[INICIO] - updatePersona - Persona: - " + persona.toString());
		if (this.personaDAO.update(persona) == 0) {
			throw new GestorProyectosException("000", "El registro a actualizar no existe");
		}
		return persona;
	}

	public List<PersonaDTO> getPersonasActivas() throws Exception {
		logger.debug("[INICIO] - getPersonas ");
		return this.personaDAO.getPersonasActivas();
	}

	public Boolean delete(PersonaDTO cliente) throws Exception {
		return null;
	}
}
