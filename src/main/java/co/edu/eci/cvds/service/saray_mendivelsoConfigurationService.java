package co.edu.eci.cvds.service;

import co.edu.eci.cvds.model.saray_mendivelsoModel;
import co.edu.eci.cvds.repository.saray_mendivelsoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class saray_mendivelsoConfigurationService{
   
        private static saray_mendivelsoRepository saray_mendivelsoRepository;
        @Autowired
        public saray_mendivelsoConfigurationService(saray_mendivelsoRepository saray_mendivelsoRepository) {
            this.saray_mendivelsoRepository = saray_mendivelsoRepository;
        }
    
        public static  List<saray_mendivelsoModel> getsaray_m() {
            return saray_mendivelsoRepository.findAll();
        }
}
    