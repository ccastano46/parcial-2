package co.edu.eci.cvds.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import co.edu.eci.cvds.model.saray_mendivelsoModel;

@Repository
    public interface saray_mendivelsoRepository extends JpaRepository<saray_mendivelsoModel, String> {
        Optional<saray_mendivelsoModel> findById(String id);
    
}

