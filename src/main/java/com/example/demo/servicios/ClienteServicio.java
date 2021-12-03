package com.example.demo.servicios;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cliente;
import com.example.demo.repositorios.ClienteRepositorio;


@Service
@Transactional
public class ClienteServicio {
	
	@Autowired
	public ClienteRepositorio repositorio;

	public ClienteServicio() {
	}
	
	public Cliente crear(Cliente Cliente) {
		return repositorio.save(Cliente);
	}

	public List<Cliente> buscarTodo() {
		return (ArrayList<Cliente>) repositorio.findAll();
	}

	public Cliente actualizar(Cliente ClienteActualizar) {
		Cliente ClienteActual = repositorio.findById(ClienteActualizar.getCLI_ID()).get();
		ClienteActual.setCLI_NOMBRES(ClienteActualizar.getCLI_NOMBRES());
		ClienteActual.setCLI_APELLIDO_PAT(ClienteActualizar.getCLI_APELLIDO_PAT());
		ClienteActual.setCLI_APELLIDO_MAT(ClienteActualizar.getCLI_APELLIDO_MAT());
		ClienteActual.setCLI_CORREO(ClienteActualizar.getCLI_CORREO());
		ClienteActual.setCLI_DIRECCION(ClienteActualizar.getCLI_DIRECCION());
		ClienteActual.setCLI_DNI(ClienteActualizar.getCLI_DNI());
		ClienteActual.setCLI_TEL_MOVIL(ClienteActualizar.getCLI_TEL_MOVIL());
		Cliente ClienteActualizado = repositorio.save(ClienteActual);
		return ClienteActualizado;
	}

	public Cliente buscarPorID(Integer id) {
		return repositorio.findById(id).get();
	}

	public void borrarPorID(Integer id) {
		repositorio.deleteById(id);
	}
}

