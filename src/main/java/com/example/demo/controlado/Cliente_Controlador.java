package com.example.demo.controlado;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/cliente")
public class Cliente_Controlador {

    @Autowired
    private Cliente servicio;

    @RequestMapping("/listar")
    public String listarFunciones(Model model) {
        List<Cliente> listaCliente = cliente.buscarTodo();
        model.addAttribute("listaCliente", listaCliente);
        return "/moduloCliente/listar";
    }

 

       
    @RequestMapping("/nuevo")
    public String nuevaFuncion(Model model) {
        Cliente cliente = new Cliente();
        model.addAttribute("cliente", cliente);
        return "/moduloCliente/nuevoCliente";
    }


    @RequestMapping(value = "/guardar", method = RequestMethod.POST)
    public String crearFuncion(@ModelAttribute("cliente") Cliente cliente) {
        servicio.crear(cliente);
        return "redirect:/Cliente/listar";
    }


    @RequestMapping("/actualizar/{id}")
    public ModelAndView editarCliente(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("/moduloCliente/editarCliente");
        Cliente cliente= servicio.buscarPorID(id);
        mav.addObject("cliente", cliente);
        return mav;
    }


    @RequestMapping("/eliminar/{id}")
    public String eliminarCliente(@PathVariable(name = "id") int id) {
        servicio.borrarPorID(id);
        return "redirect:/cliente/listar";       
    }

