-- ============================================
-- Crear usuario para acceso local
-- ============================================
CREATE USER 'usrcoches'@'localhost' IDENTIFIED BY 'pswcoches123';

-- ============================================
-- Crear base de datos
-- ============================================
CREATE DATABASE dbconcesionarios
  DEFAULT CHARACTER SET utf8
  DEFAULT COLLATE utf8_general_ci;

-- ============================================
-- Otorgar permisos
-- ============================================
GRANT SELECT, INSERT, UPDATE, DELETE ON dbconcesionarios.* TO 'usrcoches'@'localhost';

-- ============================================
-- Usar la base de datos
-- ============================================
USE dbconcesionarios;

-- ============================================
-- Crear tabla 'coches'
-- Campos basados en la clase Java Coche:
--   matricula, marca, puertas, automatico
-- ============================================
CREATE TABLE `coches` (
  `id`         INT(4)       NOT NULL AUTO_INCREMENT,
  `matricula`  VARCHAR(10)  NOT NULL UNIQUE,
  `marca`      VARCHAR(50)  NOT NULL,
  `puertas`    INT          DEFAULT 0,
  `automatico` BOOLEAN      DEFAULT FALSE,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB;

-- ============================================
-- Inserción de 40 coches
-- ============================================
INSERT INTO `coches` (`matricula`, `marca`, `puertas`, `automatico`)
VALUES
  ('1234ABC', 'Toyota',      4, TRUE),
  ('5678DEF', 'Ford',        2, FALSE),
  ('9012GHI', 'BMW',         4, TRUE),
  ('3456JKL', 'Seat',        5, FALSE),
  ('7890MNO', 'Audi',        4, TRUE),
  ('2345PQR', 'Renault',     3, FALSE),
  ('6789STU', 'Mercedes',    4, TRUE),
  ('0123VWX', 'Volkswagen',  5, FALSE),
  ('4567YZA', 'Honda',       4, TRUE),
  ('8901BCD', 'Hyundai',     4, FALSE),
  ('1357EFG', 'Kia',         5, TRUE),
  ('2468HIJ', 'Nissan',      4, FALSE),
  ('3579KLM', 'Peugeot',     3, TRUE),
  ('4680NOP', 'Citroën',     5, FALSE),
  ('5791QRS', 'Fiat',        4, TRUE),
  ('6802TUV', 'Opel',        5, FALSE),
  ('7913WXY', 'Mazda',       4, TRUE),
  ('8024ZAB', 'Subaru',      4, FALSE),
  ('9135CDE', 'Volvo',       5, TRUE),
  ('0246FGH', 'Jeep',        4, FALSE),
  ('1122IJK', 'Chevrolet',   2, TRUE),
  ('2233LMN', 'Porsche',     2, TRUE),
  ('3344OPQ', 'Ferrari',     2, FALSE),
  ('4455RST', 'Lamborghini', 2, TRUE),
  ('5566UVW', 'Tesla',       4, TRUE),
  ('6677XYZ', 'Lexus',       4, TRUE),
  ('7788ABC', 'Alfa Romeo',  4, FALSE),
  ('8899DEF', 'Jaguar',      4, TRUE),
  ('9900GHI', 'Land Rover',  5, FALSE),
  ('1010JKL', 'Maserati',    4, TRUE),
  ('2020MNO', 'Mitsubishi',  5, FALSE),
  ('3030PQR', 'Suzuki',      3, TRUE),
  ('4040STU', 'Dacia',       5, FALSE),
  ('5050VWX', 'Mini',        3, TRUE),
  ('6060YZA', 'Skoda',       5, FALSE),
  ('7070BCD', 'Dodge',       2, TRUE),
  ('8080EFG', 'Chrysler',    4, FALSE),
  ('9090HIJ', 'Infiniti',    4, TRUE),
  ('1212KLM', 'Acura',       4, FALSE),
  ('3434NOP', 'Genesis',     4, TRUE);