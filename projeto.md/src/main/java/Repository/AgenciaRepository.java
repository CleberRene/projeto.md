package Repository;

import Modelo.AgenciaModelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgenciaRepository extends JpaRepository <AgenciaModelo, Integer> {
}
