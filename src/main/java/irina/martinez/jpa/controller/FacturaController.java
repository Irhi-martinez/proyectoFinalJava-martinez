package irina.martinez.jpa.controller;

import irina.martinez.jpa.entity.Cliente;
import irina.martinez.jpa.entity.Producto;
import irina.martinez.jpa.entity.Venta;
import irina.martinez.jpa.repository.ClienteRepository;
import irina.martinez.jpa.repository.ProductoRepository;
import irina.martinez.jpa.repository.VentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FacturaController {

    private final ClienteRepository clienteRepo;
    private final ProductoRepository productoRepo;
    private final VentaRepository ventaRepo;

    @Autowired
    public FacturaController(ClienteRepository clienteRepo, ProductoRepository productoRepo, VentaRepository ventaRepo) {
        this.clienteRepo = clienteRepo;
        this.productoRepo = productoRepo;
        this.ventaRepo = ventaRepo;
    }

    @GetMapping("/facturas")
    public String verFacturas(Model model) {
        List<Venta> ventas = ventaRepo.findAll();
        List<Cliente> clientes = clienteRepo.findAll();
        List<Producto> productos = productoRepo.findAll();

        model.addAttribute("ventas", ventas);
        model.addAttribute("clientes", clientes);
        model.addAttribute("productos", productos);

        return "facturas";
    }
}
