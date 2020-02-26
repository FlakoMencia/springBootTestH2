package com.crud.h2.controller;

import com.crud.h2.modelo.Persona;
import com.crud.h2.service.IPersonaService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PersonaController {

    @Autowired
    private IPersonaService iService;

    @GetMapping("/listar")
    public String listar(Model model) {
        model.addAttribute("personas", iService.listar());
        return "index";
    }

    @GetMapping("/nuevo")
    public String nuevo() {
        
        return "agregar";
    }
    
    @PostMapping("/agregar")
    public String agregar(@Valid Persona p ) {
        iService.agregar(p);
        return "redirect:/listar";
    }
   
    
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model ) {
        Persona per = iService.listarPersonaId(id);
        model.addAttribute("persona", per);
        
        return "editar";
    }
    
    @PostMapping("/actualizar")
    public String actualizar(@Valid Persona p ) {
        iService.editar(p);
        return "redirect:/listar";
    }
   
    @GetMapping("/eliminar/{id}")
    public String delete(@PathVariable int id, Model model ) {
        iService.delete(id);
        
        return "redirect:/listar";
    }
    
    
    
}
