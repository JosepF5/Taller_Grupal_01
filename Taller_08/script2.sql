--Consulta SQL donde pueda obtener los productos 
--vendidos digitando tipo de documento y número de documento.
SELECT * FROM productos WHERE t_documento='Pasaporte' and n_documento=4564986;
--Consultar productos por medio del nombre, 
--el cual debe mostrar quien o quienes han sido sus proveedores.
SELECT nombre, proveedor FROM productos WHERE nombre='Sybill Cain';