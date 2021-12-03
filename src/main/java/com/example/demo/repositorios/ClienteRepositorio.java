package com.example.demo.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.modelo.Cliente;

public interface ClienteRepositorio extends CrudRepository<Cliente, Integer> {

}