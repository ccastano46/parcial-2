package co.edu.eci.cvds.controller;

import co.edu.eci.cvds.model.CAMILO_CASTANO;

import co.edu.eci.cvds.service.CamiloCastanoService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/CAMILO_CASTANO")
public class CamiloCastanoController {
    private final CamiloCastanoService camiloCastanoService;

    @Autowired
    public CamiloCastanoController(CamiloCastanoService camiloCastanoService) {
        this.camiloCastanoService = camiloCastanoService;
    }

    @GetMapping("/preguntas")
    public String preguntas(Model model) {
        List<CAMILO_CASTANO> preguntas = camiloCastanoService.getAllQuestions();
        model.addAttribute("preguntas", preguntas); 
        return "listaPreguntas";  
    }

    
}
