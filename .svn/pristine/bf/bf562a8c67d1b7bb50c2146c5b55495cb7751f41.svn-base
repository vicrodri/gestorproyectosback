--SCRIPT DE CARGA DEL ESQUEMA EN MYSQL

-- CLIENTES
INSERT INTO clientes (nombre, descripcion) VALUES ('MAPFRE', 'MAPFRE DESCRIPCION');
INSERT INTO clientes (nombre, descripcion) VALUES ('CAIXA', 'CAIXA DESCRIPCION');
INSERT INTO clientes (nombre, descripcion) VALUES ('AXA', 'AXA DESCRIPCION');
INSERT INTO clientes (nombre, descripcion) VALUES ('BANKIA', 'BANKIA DESCRIPCION');

-- ARQUITECTURAS
INSERT INTO arquitecturas (nombre, idCliente) VALUES ('ARQOS', '1');
INSERT INTO arquitecturas (nombre, idCliente) VALUES ('GAIA', '1');
INSERT INTO arquitecturas (nombre, idCliente) VALUES ('AXA_ARQ', '3');
INSERT INTO arquitecturas (nombre, idCliente) VALUES ('CAIXA_ARQ', '2');

-- TECNOLOGIAS
INSERT INTO tecnologias (nombre, lenguaje, capa) VALUES ('AngularJS', 'JS', 'FRONT');
INSERT INTO tecnologias (nombre, lenguaje, capa) VALUES ('SPRING-MVC', 'JAVA', 'BACK');
INSERT INTO tecnologias (nombre, lenguaje, capa) VALUES ('EJB', 'JAVA', 'BACK');
INSERT INTO tecnologias (nombre, lenguaje, capa) VALUES ('JADE', 'HTML5', 'FRONT');

-- ARQUITECTURAS_TECNOLOGIAS
INSERT INTO arquitecturas_tecnologias (idArquitectura, idTecnologia) VALUES ('2', '2');
INSERT INTO arquitecturas_tecnologias (idArquitectura, idTecnologia) VALUES ('2', '3');

-- ITEMS
INSERT INTO items (nombre, descripción, idArquitectura) VALUES ('pantalla', 'pantalla desc', '2');
INSERT INTO items (nombre, descripción, idArquitectura) VALUES ('controlador', 'rest decripcion', '2');
INSERT INTO items (nombre, descripción, idArquitectura) VALUES ('servicio', 'rest servicio ', '2');

-- ITEMS_TECNOLOGIAS
INSERT INTO items_tecnologias (idItem, idTecnologia) VALUES (1, '4');
INSERT INTO items_tecnologias (idItem, idTecnologia) VALUES (2, '3');