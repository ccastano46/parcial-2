package co.edu.eci.cvds.service;
import co.edu.eci.cvds.model.CAMILO_CASTANO;
import co.edu.eci.cvds.model.Configuration;
import co.edu.eci.cvds.repository.CamiloCastanoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public class CamiloCastanoService {
    private final CamiloCastanoRepository camiloCastanoRepository;

    @Autowired
    public CamiloCastanoService(CamiloCastanoRepository camiloCastanoRepository) {
        this.camiloCastanoRepository = camiloCastanoRepository;
    }

    public CAMILO_CASTANO addCamilo(CAMILO_CASTANO camilo) {
        return camiloCastanoRepository.save(camilo);
    }

    public List<CAMILO_CASTANO> getAllQuestions() {
        return camiloCastanoRepository.findAll();
    }

      public CAMILO_CASTANO getCamilo(String pregunta) {
        return camiloCastanoRepository.findBypregunta(pregunta).get(1);
    }

}
