package irina.martinez.jpa.repository;

import irina.martinez.jpa.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
