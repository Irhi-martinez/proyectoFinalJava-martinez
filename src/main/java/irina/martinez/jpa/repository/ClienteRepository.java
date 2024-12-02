package irina.martinez.jpa.repository;

import irina.martinez.jpa.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {  // Cambié 'Long' por 'Integer'
}
