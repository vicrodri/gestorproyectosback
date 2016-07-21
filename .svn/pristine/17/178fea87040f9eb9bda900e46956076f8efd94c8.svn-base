--SCRIPT DE CARGA DEL ESQUEMA EN MYSQL

-- CLIENTES
INSERT INTO `gestor_proyectos`.`clientes` (`nombre`, `descripcion`) VALUES ('MAPFRE', 'MAPFRE DESCRIPCION');
INSERT INTO `gestor_proyectos`.`clientes` (`nombre`, `descripcion`) VALUES ('CAIXA', 'CAIXA DESCRIPCION');
INSERT INTO `gestor_proyectos`.`clientes` (`nombre`, `descripcion`) VALUES ('AXA', 'AXA DESCRIPCION');

-- ARQUITECTURAS
INSERT INTO `gestor_proyectos`.`arquitecturas` (`nombre`, `idCliente`) VALUES ('ARQOS', '1');
INSERT INTO `gestor_proyectos`.`arquitecturas` (`nombre`, `idCliente`) VALUES ('GAIA', '1');
INSERT INTO `gestor_proyectos`.`arquitecturas` (`nombre`, `idCliente`) VALUES ('AXA_ARQ', '3');
INSERT INTO `gestor_proyectos`.`arquitecturas` (`nombre`, `idCliente`) VALUES ('CAIXA_ARQ', '2');

-- TECNOLOGIAS
INSERT INTO `gestor_proyectos`.`tecnologias` (`nombre`, `lenguaje`, `capa`) VALUES ('AngularJS', 'JS', 'FRONT');
INSERT INTO `gestor_proyectos`.`tecnologias` (`nombre`, `lenguaje`, `capa`) VALUES ('SPRING-MVC', 'JAVA', 'BACK');
INSERT INTO `gestor_proyectos`.`tecnologias` (`nombre`, `lenguaje`, `capa`) VALUES ('EJB', 'JAVA', 'BACK');
INSERT INTO `gestor_proyectos`.`tecnologias` (`nombre`, `lenguaje`, `capa`) VALUES ('JADE', 'HTML5', 'FRONT');

-- ARQUITECTURAS_TECNOLOGIAS
INSERT INTO `gestor_proyectos`.`arquitecturas_tecnologias` (`idArquitectura`, `idTecnologia`) VALUES ('2', '2');
INSERT INTO `gestor_proyectos`.`arquitecturas_tecnologias` (`idArquitectura`, `idTecnologia`) VALUES ('2', '3');

-- ITEMS
INSERT INTO `gestor_proyectos`.`items` (`nombre`, `descripción`, `idArquitectura`) VALUES ('pantalla', 'pantalla desc', '2');
INSERT INTO `gestor_proyectos`.`items` (`nombre`, `descripción`, `idArquitectura`) VALUES ('controlador', 'rest decripcion', '2');
INSERT INTO `gestor_proyectos`.`items` (`nombre`, `descripción`, `idArquitectura`) VALUES ('servicio', 'rest servicio ', '2');

-- ITEMS_TECNOLOGIAS
INSERT INTO `gestor_proyectos`.`items_tecnologias` (`idItem`, `idTecnologia`) VALUES ('1', '5');
INSERT INTO `gestor_proyectos`.`items_tecnologias` (`idItem`, `idTecnologia`) VALUES ('2', '3');

-- COMPLEJIDADES
INSERT INTO `gestor_proyectos`.`complejidades` (`descripcion`) VALUES ('baja');
INSERT INTO `gestor_proyectos`.`complejidades` (`descripcion`) VALUES ('media');
INSERT INTO `gestor_proyectos`.`complejidades` (`descripcion`) VALUES ('alta');

-- TAMANIOS
INSERT INTO `gestor_proyectos`.`tamanios` (`descripcion`) VALUES ('pequeño');
INSERT INTO `gestor_proyectos`.`tamanios` (`descripcion`) VALUES ('medio');
INSERT INTO `gestor_proyectos`.`tamanios` (`descripcion`) VALUES ('grande');

--GRUPO_TAREAS
INSERT INTO `gestor_proyectos`.`grupo_tareas` (`idItem`, `idComplejidad`, `idTamanio`) VALUES ('1', '1', '1');
INSERT INTO `gestor_proyectos`.`grupo_tareas` (`idItem`, `idComplejidad`, `idTamanio`) VALUES ('2', '2', '2');
INSERT INTO `gestor_proyectos`.`grupo_tareas` (`idItem`, `idComplejidad`, `idTamanio`) VALUES ('3', '3', '3');

--TAREAS
INSERT INTO `gestor_proyectos`.`tareas` (`idGrupoTarea`, `nombre`, `horas`, `comentarios`) VALUES ('1', 'tarea 1', '10', 'comentrio 1');
INSERT INTO `gestor_proyectos`.`tareas` (`idGrupoTarea`, `nombre`, `horas`, `comentarios`) VALUES ('2', 'tarea 2', '20', 'comentario2');
INSERT INTO `gestor_proyectos`.`tareas` (`idGrupoTarea`, `nombre`, `horas`, `comentarios`) VALUES ('3', 'tarea3', '30', 'comentario 3');

--ROLES
INSERT INTO `gestor_proyectos`.`roles` (`nombre`) VALUES ('Rol_1');
INSERT INTO `gestor_proyectos`.`roles` (`nombre`) VALUES ('Rol_2');
INSERT INTO `gestor_proyectos`.`roles` (`nombre`) VALUES ('Rol_3');

--PERSONAS
INSERT INTO `gestor_proyectos`.`personas` (`nombre`, `apellido1`, `apellido2`, `fechaEntrada`, `inactivo`) VALUES ('nombre_1', 'ap1_1', 'ap2_1', '2014-01-01', 0);
INSERT INTO `gestor_proyectos`.`personas` (`nombre`, `apellido1`, `apellido2`, `fechaEntrada`, `fechaSalida`, `inactivo`) VALUES ('nombre_2', 'ap1_2', 'ap2_2', '2015-01-01', '2015-03-03', 1);
INSERT INTO `gestor_proyectos`.`personas` (`nombre`, `apellido1`, `apellido2`, `fechaEntrada`, `inactivo`) VALUES ('nombre_3', 'ap1_3', 'ap2_3', '2016-01-01', 0);

--PROYECTOS
INSERT INTO `gestor_proyectos`.`proyectos` (`idCliente`, `nombre`, `descripcion`, `fechaInicio`, `cerrado`) VALUES ('1', 'nombrep_1', 'descipcionp_1', '2014-01-01', 0);
INSERT INTO `gestor_proyectos`.`proyectos` (`idCliente`, `nombre`, `descripcion`, `fechaInicio`, `fechaFin`, `cerrado`) VALUES ('2', 'nombrep_2', 'descripcionp_2', '2015-01-01', '2015-09-09', 1);
INSERT INTO `gestor_proyectos`.`proyectos` (`idCliente`, `nombre`, `descripcion`, `fechaInicio`, `cerrado`) VALUES ('3', 'nombrep_3', 'descripcionp_3', '2016-01-01', 0);

--ASIGNACION
INSERT INTO `gestor_proyectos`.`asignacion` (`idProyecto`, `idPersona`, `idRol`, `fechaInicio`, `inactivo`) VALUES ('1', '2', '1', '2015-01-01', 0);
INSERT INTO `gestor_proyectos`.`asignacion` (`idProyecto`, `idPersona`, `idRol`, `fechaInicio`, `inactivo`) VALUES ('1', '3', '2', '2015-01-01', 0);
INSERT INTO `gestor_proyectos`.`asignacion` (`idProyecto`, `idPersona`, `idRol`, `fechaInicio`, `inactivo`) VALUES ('1', '4', '1', '2015-01-09', 0);
