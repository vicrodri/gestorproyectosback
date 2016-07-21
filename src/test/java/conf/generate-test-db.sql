CREATE TABLE clientes (
  idCliente int(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(45) NOT NULL,
  descripcion varchar(200) DEFAULT NULL,
  PRIMARY KEY (idCliente)
);

CREATE TABLE arquitecturas (
  idArquitectura int(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(45) NOT NULL,
  idCliente int(11) DEFAULT NULL,
  PRIMARY KEY (idArquitectura),
  CONSTRAINT arquitecturas_clientes FOREIGN KEY (idCliente) REFERENCES clientes (idCliente) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE tecnologias (
  idTecnologia int(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(45) NOT NULL,
  lenguaje varchar(45) NOT NULL,
  capa varchar(45) NOT NULL,
  PRIMARY KEY (idTecnologia)
);

CREATE TABLE items (
  idItem int(11) NOT NULL AUTO_INCREMENT,
  nombre varchar(45) DEFAULT NULL,
  descripción varchar(200) DEFAULT NULL,
  idArquitectura int(11) DEFAULT NULL,
  PRIMARY KEY (idItem),
  CONSTRAINT tipos_tareas_arquitecturas FOREIGN KEY (idArquitectura) REFERENCES arquitecturas (idArquitectura) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE items_tecnologias (
  idItem int(11) NOT NULL,
  idTecnologia int(11) NOT NULL,
  PRIMARY KEY (idItem,idTecnologia),
  CONSTRAINT items_tecnologias_items FOREIGN KEY (idItem) REFERENCES items (idItem) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT items_tecnologias_tecnologia FOREIGN KEY (idTecnologia) REFERENCES tecnologias (idTecnologia) ON DELETE NO ACTION ON UPDATE NO ACTION
);

CREATE TABLE arquitecturas_tecnologias (
  idArquitectura int(11) NOT NULL,
  idTecnologia int(11) NOT NULL,
  PRIMARY KEY (idArquitectura,idTecnologia),
  CONSTRAINT arquitecturas FOREIGN KEY (idArquitectura) REFERENCES arquitecturas (idArquitectura) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT tecnologias FOREIGN KEY (idTecnologia) REFERENCES tecnologias (idTecnologia) ON DELETE NO ACTION ON UPDATE NO ACTION
);
