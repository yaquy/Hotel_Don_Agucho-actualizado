package com.example.demo.servicios;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Habitacion;
import com.example.demo.repositorios.HabitacionRepositorio;


@Service
@Transactional
public class HabitacionServicio {
	
	@Autowired
	public HabitacionRepositorio repositorio;

	public HabitacionServicio() {
	}
	
	public Habitacion crear(Habitacion Habitacion) {
		return repositorio.save(Habitacion);
	}

	public List<Habitacion> buscarTodo() {
		return (ArrayList<Habitacion>) repositorio.findAll();
	}

	public Habitacion actualizar(Habitacion HabitacionActualizar) {
		Habitacion HabitacionActual = repositorio.findById(HabitacionActualizar.getHAB_ID()).get();
		HabitacionActual.setHAB_NUMERO(HabitacionActualizar.getHAB_NUMERO());
		HabitacionActual.setHAB_OCUPADA(HabitacionActualizar.getHAB_OCUPADA());
		HabitacionActual.setTIPO_HAB_ID(HabitacionActualizar.getTIPO_HAB_ID());
		Habitacion HabitacionActualizado = repositorio.save(HabitacionActual);
		return HabitacionActualizado;
	}

	public Habitacion buscarPorID(Integer id) {
		return repositorio.findById(id).get();
	}

	public void borrarPorID(Integer id) {
		repositorio.deleteById(id);
	}
}
