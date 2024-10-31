package com.mx.apiDiscosMusica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.apiDiscosMusica.model.Discos;

//@RestController ---Nps permite marcar como controlador de solicitudes y se utiliza
//para crear servicios web restfull....web service de tipo rest JSON

//@RequestMapping ---Se utiliza para asignar solicitudes web a los entornos de Spring
//RestController

//@CrossOrigin ---Es por seguridad para que nuestra aplicacion no sea bloquedo por el navegador 
//con esto nuestra api es segura o confiable

//Agregar estos 3 esteotipos
@RestController
@RequestMapping(path = "DiscosWebService")
@CrossOrigin

public class DiscosWebService {

	// inyeccion de Dependencias
	@Autowired
	DiscosImp discosImp;

	// Peticiones(get, post, put, view...) ----para probar nuestra peticiones vamos
	// a utilizar internet
	// con el protocolo http
	// Necesitamos formar nuestro recurso o url:
	// urlServidorLocal/patchClase/PatchMetodo

	// URL http:localhost:9001/DiscosWebService/listar
	@GetMapping(path = "listar")
	public List<Discos> listar() {
		return discosImp.Listar();
	}

	// URL http://localhost:9001/DiscosWebService/guardar
	@PostMapping(path = "guardar")
	public void guardar(@RequestBody Discos discos) {
		discosImp.guardar(discos);
	}

	//http://localhost:9001/DiscosWebService/buscar
	@PostMapping(path = "buscar")
	public Discos buscar(@RequestBody Discos discos) {
		return discosImp.buscar(discos.getIdDisco());
	}
	
	
	//http://localhost:9001/DiscosWebService/editar
	@PostMapping(path = "editar")
	public void editar(@RequestBody Discos discos) {
		discosImp.editar(discos);
	}
	
	//http://localhost:9001/DiscosWebService/eliminar
	@PostMapping(path = "eliminar")
	public void eliminar(@RequestBody Discos discos) {
		discosImp.eliminar(discos.getIdDisco());
	}
	
}
