package com.oman.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.oman.repository.IPersonaRepo;
import com.oman.repository.PersonaRepoImpl1;
@Service
public class PeronaServiceImpl implements IPersonaService{
	@Autowired
	@Qualifier("persona2")
	private IPersonaRepo repo;
	
	@Override
	public void registrar(String nombre) {
		
		repo.registrar(nombre);
		
	}

}
