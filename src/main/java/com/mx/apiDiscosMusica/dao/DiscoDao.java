package com.mx.apiDiscosMusica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.apiDiscosMusica.model.Discos;

public interface DiscoDao extends JpaRepository<Discos, Integer> {

}
