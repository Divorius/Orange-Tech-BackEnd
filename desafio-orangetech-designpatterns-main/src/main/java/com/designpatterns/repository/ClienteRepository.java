package com.designpatterns.repository;

import org.springframework.data.repository.CrudRepository;

import com.designpatterns.model.Cliente;


public interface ClienteRepository extends CrudRepository<Cliente, Long>{

}