package com.oman.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.oman.DemoConsolaApplication;
@Repository
@Qualifier("persona1")
public class PersonaRepoImpl1 implements IPersonaRepo{
	private static Logger LOG = LoggerFactory.getLogger(DemoConsolaApplication.class);
	@Override
	public void registrar(String nombre) {
		LOG.info("el nombrE es A:"+nombre);
		
	}

}
