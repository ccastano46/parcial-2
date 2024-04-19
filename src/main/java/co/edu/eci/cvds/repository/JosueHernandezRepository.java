package co.edu.eci.cvds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.eci.cvds.model.JOSUE_HERNANDEZ;
import java.util.List;
import java.util.Optional;
@Repository
public interface JosueHernandezRepository extends JpaRepository<JOSUE_HERNANDEZ, String>{
    Optional<JOSUE_HERNANDEZ> findById(String id);
}
