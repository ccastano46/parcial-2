package co.edu.eci.cvds.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.eci.cvds.model.JOSUE_HERNANDEZ;
import java.util.List;
@Repository
public interface JosueHernandezRepository extends JpaRepository<JOSUE_HERNANDEZ, String>{
    public List<JOSUE_HERNANDEZ> findByid(String id);
}
