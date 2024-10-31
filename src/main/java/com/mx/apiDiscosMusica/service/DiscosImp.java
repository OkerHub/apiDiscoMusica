package com.mx.apiDiscosMusica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.apiDiscosMusica.dao.DiscoDao;
import com.mx.apiDiscosMusica.model.Discos;

//Agregar este o anotacion
@Service // Con esto le indicamos que vamos a realizar un servicio

public class DiscosImp implements DiscosServ {

	// La inyeccion de dependencia
	// @autowires me permiten tener un mejor control de los objetos
	// inicializan

	@Autowired
	DiscoDao discosdao;

	// @Transactional -- Para realizar los cambios de manera efectiva

	@Transactional(readOnly = true)
	@Override
	public List<Discos> Listar() {
		// TODO Auto-generated method stub
		List<Discos> registrosBd = discosdao.findAll();

		return registrosBd;
	}

	@Override
	public void guardar(Discos discos) {
		// TODO Auto-generated method stub

		discosdao.save(discos);

	}

	@Transactional(readOnly = true)
	@Override
	public Discos buscar(Integer id) {
		// TODO Auto-generated method stub

		Discos discoEnct = discosdao.findById(id).orElse(null);

		return discoEnct;

	}

	@Override
	public void editar(Discos disco) {
		// TODO Auto-generated method stub
		discosdao.save(disco);

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub

	}

}
