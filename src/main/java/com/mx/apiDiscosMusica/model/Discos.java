package com.mx.apiDiscosMusica.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Discos_musica")

public class Discos {

	// EstereoTipos o anotaciones

	@Id // Representa la llave primaria
	@Column(name = "ID", columnDefinition = "NUMBER", nullable = false)
	private Integer idDisco;
	@Column(name = "NOMBRE", columnDefinition = "NOMBRE", nullable = false)
	private String nombre;
	@Column(name = "GENERO", columnDefinition = "GENERO", nullable = false)
	private String genero;
	@Column(name = "PRECIO", columnDefinition = "PRECIO", nullable = false)
	private String precio;

	// Constructor Vacio
	public Discos() {
		super();
	}

	// Constructor Lleno
	public Discos(Integer idDisco, String nombre, String genero, String precio) {
		super();
		this.idDisco = idDisco;
		this.nombre = nombre;
		this.genero = genero;
		this.precio = precio;
	}

	// Metodo toString
	@Override
	public String toString() {
		return "Discos [idDisco=" + idDisco + ", nombre=" + nombre + ", genero=" + genero + ", precio=" + precio
				+ "]\n";

	}

	public Integer getIdDisco() {
		return idDisco;
	}

	public void setIdDisco(Integer idDisco) {
		this.idDisco = idDisco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

}
