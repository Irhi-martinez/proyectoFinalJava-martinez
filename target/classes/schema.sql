-- Creación de la tabla cliente
CREATE TABLE IF NOT EXISTS cliente (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE
);

-- Creación de la tabla productos
CREATE TABLE IF NOT EXISTS productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    precio DECIMAL(10, 2) NOT NULL CHECK (precio >= 0)
);

-- Creación de la tabla ventas
CREATE TABLE IF NOT EXISTS ventas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    id_cliente INT NOT NULL,
    id_producto INT NOT NULL,
    cantidad INT NOT NULL CHECK (cantidad > 0),
    fecha_venta DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (id_cliente) REFERENCES cliente(id),
    FOREIGN KEY (id_producto) REFERENCES productos(id)
);

-- Creación de la tabla alumno
CREATE TABLE IF NOT EXISTS alumno (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL,
    apellido VARCHAR(255) NOT NULL,
    dni INT NOT NULL UNIQUE,
    legajo INT NOT NULL UNIQUE
);

--datos en la tabla alumno
INSERT INTO alumno (nombre, apellido, dni, legajo) VALUES
('Juan', 'Pérez', 12345678, 1001),
('María', 'Gómez', 87654321, 1002),
('Carlos', 'Fernández', 11223344, 1003),
('Laura', 'Martínez', 55667788, 1004),
('Ana', 'Sánchez', 98765432, 1005),
('Pedro', 'López', 23456789, 1006),
('Lucía', 'Díaz', 34567890, 1007),
('Javier', 'Hernández', 45678901, 1008),
('Sofía', 'Ramírez', 56789012, 1009),
('Diego', 'Torres', 67890123, 1010);

