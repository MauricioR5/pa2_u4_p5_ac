package com.uce.edu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IPersonaRepository;
import com.uce.edu.repository.modelo.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaRepository iPersonaRepository;
	
	@Override
	public void guardar(Persona persona) {
		this.iPersonaRepository.insertar(persona);
	}

	@Override
	public void actualizar(Persona persona) {
		this.iPersonaRepository.actualizar(persona);
	}

	@Override
	public Persona buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.iPersonaRepository.consultarPorCedula(cedula);
	}

	@Override
	public void borrarPorCedula(String cedula) {
		this.iPersonaRepository.eliminarPorCedula(cedula);
	}

	@Override
	public List<Persona> buscarTodos() {
		return this.iPersonaRepository.consultarTodos();
	}

}
