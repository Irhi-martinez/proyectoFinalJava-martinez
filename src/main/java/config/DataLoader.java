package config;

import irina.martinez.jpa.entity.Alumno;
import irina.martinez.jpa.entity.Cliente;
import irina.martinez.jpa.entity.Producto;
import irina.martinez.jpa.entity.Venta;
import irina.martinez.jpa.repository.AlumnoRepository;
import irina.martinez.jpa.repository.ClienteRepository;
import irina.martinez.jpa.repository.ProductoRepository;
import irina.martinez.jpa.repository.VentaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner initDatabase(AlumnoRepository alumnoRepo,
                                   ClienteRepository clienteRepo,
                                   ProductoRepository productoRepo,
                                   VentaRepository ventaRepo) {
        return args -> {
            // Guardar alumnos
            alumnoRepo.saveAll(List.of(
                    new Alumno("Juan", "Pérez", 12345678, 1234),
                    new Alumno("María", "Gómez", 87654321, 1002)
            ));

            // Crear clientes
            Cliente cliente1 = clienteRepo.save(new Cliente("Carlos Fernández", "carlos@gmail.com"));
            Cliente cliente2 = clienteRepo.save(new Cliente("Laura Martínez", "laura@gmail.com"));

            // Crear productos
            Producto producto1 = productoRepo.save(new Producto("Silla", 50.0));
            Producto producto2 = productoRepo.save(new Producto("Mesa", 100.0));

            // Crear ventas y asociar cliente y productos
            ventaRepo.save(new Venta(cliente1, producto1, 2));
            ventaRepo.save(new Venta(cliente2, producto1, 1));
            ventaRepo.save(new Venta(cliente2, producto2, 1));
        };
    }
}
