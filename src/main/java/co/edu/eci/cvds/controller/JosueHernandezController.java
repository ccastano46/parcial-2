package co.edu.eci.cvds.controller;


import co.edu.eci.cvds.model.Configuration;
import co.edu.eci.cvds.model.JOSUE_HERNANDEZ;
import co.edu.eci.cvds.service.ConfigurationService;
import co.edu.eci.cvds.service.JosueHernandezService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "JOSUE_HERNANDEZ")
public class JosueHernandezController {
    private final JosueHernandezService josueHernandezService;

    @Autowired
    public JosueHernandezController(JosueHernandezService josueHernandezService) {
        this.josueHernandezService = josueHernandezService;
    }

    @GetMapping("/list")
    public String josue_Hernandezs(Model model) {
        List<JOSUE_HERNANDEZ> josue_Hernandezs = josueHernandezService.getJosue_HERNANDEZs();
        model.addAttribute("Josue", josue_Hernandezs);
        return "JOSUE_HERNANDEZ/JOSUE_HERNANDEZList";  
    }
}
