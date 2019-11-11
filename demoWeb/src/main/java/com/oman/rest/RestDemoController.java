package com.oman.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oman.model.Persona;
import com.oman.repo.IPersonaRepo;

@RestController
@RequestMapping("/personas")
public class RestDemoController {
	@Autowired
	private IPersonaRepo repo;
	@GetMapping
	public List<Persona> listar(){
		return repo.findAll();
	}
	@PostMapping
	public void insertar(@RequestBody Persona per){
		repo.save(per);
	}
	@PutMapping
	public void modificar(@RequestBody Persona per) {
		repo.save(per);
	}
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}
}
