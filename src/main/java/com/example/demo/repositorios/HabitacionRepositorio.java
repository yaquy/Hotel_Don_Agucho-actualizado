package com.example.demo.repositorios;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.modelo.Habitacion;

public interface HabitacionRepositorio extends CrudRepository<Habitacion, Integer> {

}