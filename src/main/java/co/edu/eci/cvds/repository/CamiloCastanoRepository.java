package co.edu.eci.cvds.repository;

import co.edu.eci.cvds.model.CAMILO_CASTANO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CamiloCastanoRepository extends JpaRepository<CAMILO_CASTANO, String> {
    public List<CAMILO_CASTANO> findBypregunta(String pregunta);

}