package com.mx.apiDiscosMusica.service;

import java.util.List;

import com.mx.apiDiscosMusica.model.Discos;

public interface DiscosServ {
	public List<Discos> Listar();

	public void guardar(Discos discos);

	public Discos buscar(Integer id);

	public void editar(Discos disco);

	public void eliminar(Integer id);

}
