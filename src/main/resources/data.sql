SET FOREIGN_KEY_CHECKS = 0;

TRUNCATE TABLE ventas;
TRUNCATE TABLE productos;
TRUNCATE TABLE cliente;

SET FOREIGN_KEY_CHECKS = 1;

-- Inserción en la tabla cliente
INSERT INTO cliente (nombre, email) VALUES
('Juan Pérez', 'juan.perez@example.com'),
('María Gómez', 'maria.gomez@example.com');

-- Inserción en la tabla productos
INSERT INTO productos (nombre, precio) VALUES
('Producto A', 50.00),
('Producto B', 30.00);

-- Inserción en la tabla ventas
INSERT INTO ventas (id_cliente, id_producto, cantidad)
VALUES
((SELECT id FROM cliente WHERE email = 'juan.perez@example.com' LIMIT 1),
 (SELECT id FROM productos WHERE nombre = 'Producto A' LIMIT 1),
 2),
((SELECT id FROM cliente WHERE email = 'maria.gomez@example.com' LIMIT 1),
 (SELECT id FROM productos WHERE nombre = 'Producto B' LIMIT 1),
 1);
