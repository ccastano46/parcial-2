package co.edu.eci.cvds.controller;

import co.edu.eci.cvds.model.Configuration;
import co.edu.eci.cvds.model.saray_mendivelsoModel;
import co.edu.eci.cvds.service.saray_mendivelsoConfigurationService;
import co.edu.eci.cvds.service.ConfigurationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "saray_mendivelso.Model")
public class saray_mendivelsoController {
       
        @SuppressWarnings("unused")
        private final saray_mendivelsoConfigurationService saray_mendivelsoService;
    
        @Autowired
        public saray_mendivelsoController(saray_mendivelsoConfigurationService saray_mendivelsoService) {
            this.saray_mendivelsoService = saray_mendivelsoService;
        }
    
        @GetMapping("/list")
        public String saray_mendivelso(Model model) {
            List<saray_mendivelsoModel> saray_m = saray_mendivelsoConfigurationService.getsaray_m();
            model.addAttribute("saray", saray_m);
            return "saray_mendivelso/saray_mendivelsoList";
        }
    
    
    }
    

