package co.edu.eci.cvds.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.eci.cvds.model.JOSUE_HERNANDEZ;
import co.edu.eci.cvds.repository.JosueHernandezRepository;
@Service
public class JosueHernandezService {
    private final JosueHernandezRepository josueHernandezRepository;

    @Autowired
    public JosueHernandezService(JosueHernandezRepository josueHernandezRepository) {
        this.josueHernandezRepository = josueHernandezRepository;
    }

    
    public  List<JOSUE_HERNANDEZ> getJosue_HERNANDEZs() {
        return josueHernandezRepository.findAll();
    }
}


    