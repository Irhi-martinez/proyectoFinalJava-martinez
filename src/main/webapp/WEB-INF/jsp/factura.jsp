<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Factura</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 20px;
        }
        .factura {
            width: 50%;
            margin: 0 auto;
            padding: 20px;
            border: 1px solid #ddd;
            background-color: #f9f9f9;
        }
        h2 {
            text-align: center;
        }
        .detalles {
            margin-top: 20px;
        }
        .detalles table {
            width: 100%;
            border-collapse: collapse;
        }
        .detalles th, .detalles td {
            padding: 10px;
            text-align: left;
            border: 1px solid #ddd;
        }
    </style>
</head>
<body>

    <div class="factura">
        <h2>Factura</h2>

        <div class="detalles">
            <h3>Cliente: ${cliente.nombre}</h3>
            <h4>Email: ${cliente.email}</h4>

            <table>
                <tr>
                    <th>Producto</th>
                    <th>Cantidad</th>
                    <th>Precio</th>
                    <th>Total</th>
                </tr>
                <tr>
                    <td>${producto.nombre}</td>
                    <td>${cantidad}</td>
                    <td>${producto.precio}</td>
                    <td>${total}</td>
                </tr>
            </table>
        </div>

        <div class="total">
            <h3>Total a Pagar: ${total}</h3>
        </div>
    </div>

</body>
</html>
