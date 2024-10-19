-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 27, 2023 at 10:11 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `secsalud`
--

-- --------------------------------------------------------

--
-- Table structure for table `cargo`
--
create database secsalud;
use secsalud;
CREATE TABLE `cargo` (
  `idCargo` int(11) NOT NULL,
  `CargoNombre` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `cargo`
--

INSERT INTO `cargo` (`idCargo`, `CargoNombre`) VALUES
(501, 'Personal Medico'),
(502, 'Administrativo');

-- --------------------------------------------------------

--
-- Table structure for table `correo`
--

CREATE TABLE `correo` (
  `Correo` varchar(40) NOT NULL,
  `Contrasena` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `correo`
--

INSERT INTO `correo` (`Correo`, `Contrasena`) VALUES
('camila2@gmail.com', 'ASDASD5%'),
('juan2@gmail.com', '98765432');

-- --------------------------------------------------------

--
-- Table structure for table `eps`
--

CREATE TABLE `eps` (
  `idEPS` int(11) NOT NULL,
  `NombreEps` varchar(45) NOT NULL,
  `Contacto` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `eps`
--

INSERT INTO `eps` (`idEPS`, `NombreEps`, `Contacto`) VALUES
(1001, 'Sanitas', 7894561),
(1002, 'Compensar', 7891234),
(1003, 'Sura', 7893254),
(1004, 'Salud Total', 7418523);

-- --------------------------------------------------------

--
-- Table structure for table `laboratorio`
--

CREATE TABLE `laboratorio` (
  `NIT` int(11) NOT NULL,
  `RazonSocial` varchar(50) NOT NULL,
  `Direccion` varchar(45) DEFAULT NULL,
  `Contacto` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `laboratorio`
--

INSERT INTO `laboratorio` (`NIT`, `RazonSocial`, `Direccion`, `Contacto`) VALUES
(500, 'Moderna', '8th streeet', '321456'),
(501, 'Pfizer', '7th street', '785469'),
(502, 'Sinovac', '3rd street', '645879');

-- --------------------------------------------------------

--
-- Table structure for table `lote`
--

CREATE TABLE `lote` (
  `idLote` varchar(15) NOT NULL,
  `EPS_idEPS` int(11) NOT NULL,
  `DescripcionLote` varchar(45) NOT NULL,
  `FechaVencimiento` date NOT NULL,
  `FechaEntrega` date NOT NULL,
  `Cantidad` int(11) NOT NULL,
  `LABORATORIO_NIT` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `lote`
--

INSERT INTO `lote` (`idLote`, `EPS_idEPS`, `DescripcionLote`, `FechaVencimiento`, `FechaEntrega`, `Cantidad`, `LABORATORIO_NIT`) VALUES
('2001', 1001, 'Vacuna', '2023-01-23', '2023-07-23', 800, 500),
('2002', 1001, 'Vacuna', '2023-01-22', '2023-07-22', 700, 501),
('2003', 1002, 'Vacuna', '2023-02-15', '2023-03-03', 650, 502),
('2004', 1004, 'vacunas', '2024-05-01', '2023-05-24', 1000, 502),
('2005', 1004, 'vacunas', '2024-05-01', '2023-05-24', 1000, 502);

-- --------------------------------------------------------

--
-- Table structure for table `paciente`
--

CREATE TABLE `paciente` (
  `Documento_Paciente` int(11) NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Apellido` varchar(45) NOT NULL,
  `Fecha_Nacimiento` date NOT NULL,
  `Correo` varchar(40) DEFAULT NULL,
  `TipoRegimen` varchar(45) NOT NULL,
  `EPS_idEPS1` int(11) NOT NULL,
  `GrupoSanguineo` char(3) NOT NULL,
  `TipoDocumento` char(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `paciente`
--

INSERT INTO `paciente` (`Documento_Paciente`, `Nombre`, `Apellido`, `Fecha_Nacimiento`, `Correo`, `TipoRegimen`, `EPS_idEPS1`, `GrupoSanguineo`, `TipoDocumento`) VALUES
(1011081215, 'Andres', 'Franco', '2000-10-10', 'andres@gmail.com', 'Subsidiario', 1001, 'B+', 'CC'),
(1011081314, 'Felipe', 'Rincon', '2000-08-14', 'felipe@gmail.com', 'Contributivo', 1001, 'AB-', 'CC'),
(1012345678, 'Maria', 'Alvarado', '2005-12-31', 'maria@gmail.com', 'Contributivo', 1003, 'O-', 'TI'),
(1023456789, 'Valentina', 'Calderon', '1998-07-08', 'valentina@gmail.com', 'Contributivo', 1004, 'O+', 'CC'),
(1054876401, 'Diego', 'Alvarez', '2004-05-22', 'diego@gmail.com', 'Contributivo', 1002, 'A+', 'CC'),
(1120394700, 'Diana', 'Calderon', '2001-01-01', 'diana@gmail.com', 'Subsidiario', 1001, 'B-', 'CC');

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE `usuario` (
  `Documento_Usuario` int(11) NOT NULL,
  `NombreUsuario` varchar(45) NOT NULL,
  `ApellidoUsuario` varchar(45) NOT NULL,
  `FechaNacimiento` date NOT NULL,
  `TipoDocumento` varchar(5) NOT NULL,
  `Telefono` int(11) DEFAULT NULL,
  `Correo_Correo` varchar(40) NOT NULL,
  `Cargo_idCargo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`Documento_Usuario`, `NombreUsuario`, `ApellidoUsuario`, `FechaNacimiento`, `TipoDocumento`, `Telefono`, `Correo_Correo`, `Cargo_idCargo`) VALUES
(79894723, 'Juan', 'Alvira', '1969-04-02', 'CC', 2147483647, 'juan2@gmail.com', 501),
(1012455689, 'Camila', 'Salazar', '1990-06-15', 'CC', 2147483647, 'camila2@gmail.com', 502);

-- --------------------------------------------------------

--
-- Table structure for table `vacunacion`
--

CREATE TABLE `vacunacion` (
  `Fecha_Aplicada` date NOT NULL,
  `Paciente_idPaciente` int(11) NOT NULL,
  `EPS_idEPS` int(11) NOT NULL,
  `Dosis` tinyint(2) NOT NULL,
  `LOTE_idLote` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `vacunacion`
--

INSERT INTO `vacunacion` (`Fecha_Aplicada`, `Paciente_idPaciente`, `EPS_idEPS`, `Dosis`, `LOTE_idLote`) VALUES
('2023-05-18', 1011081215, 1001, 1, '2001'),
('2023-05-18', 1011081314, 1001, 1, '2002'),
('2023-05-18', 1023456789, 1002, 1, '2003'),
('2023-05-20', 1054876401, 1001, 2, '2003');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cargo`
--
ALTER TABLE `cargo`
  ADD PRIMARY KEY (`idCargo`);

--
-- Indexes for table `correo`
--
ALTER TABLE `correo`
  ADD PRIMARY KEY (`Correo`);

--
-- Indexes for table `eps`
--
ALTER TABLE `eps`
  ADD PRIMARY KEY (`idEPS`);

--
-- Indexes for table `laboratorio`
--
ALTER TABLE `laboratorio`
  ADD PRIMARY KEY (`NIT`);

--
-- Indexes for table `lote`
--
ALTER TABLE `lote`
  ADD PRIMARY KEY (`idLote`,`EPS_idEPS`,`LABORATORIO_NIT`),
  ADD KEY `fk_Lote_EPS1` (`EPS_idEPS`),
  ADD KEY `fk_LOTE_LABORATORIO1` (`LABORATORIO_NIT`);

--
-- Indexes for table `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`Documento_Paciente`),
  ADD KEY `fk_Paciente_EPS2` (`EPS_idEPS1`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`Documento_Usuario`,`Correo_Correo`,`Cargo_idCargo`),
  ADD KEY `fk_Usuario_Correo1` (`Correo_Correo`),
  ADD KEY `fk_Usuario_Cargo1` (`Cargo_idCargo`);

--
-- Indexes for table `vacunacion`
--
ALTER TABLE `vacunacion`
  ADD PRIMARY KEY (`Paciente_idPaciente`,`EPS_idEPS`,`LOTE_idLote`),
  ADD KEY `fk_Vacunacion_EPS1` (`EPS_idEPS`),
  ADD KEY `fk_idLote` (`LOTE_idLote`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `lote`
--
ALTER TABLE `lote`
  ADD CONSTRAINT `fk_LOTE_LABORATORIO1` FOREIGN KEY (`LABORATORIO_NIT`) REFERENCES `laboratorio` (`NIT`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Lote_EPS1` FOREIGN KEY (`EPS_idEPS`) REFERENCES `eps` (`idEPS`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `paciente`
--
ALTER TABLE `paciente`
  ADD CONSTRAINT `fk_Paciente_EPS2` FOREIGN KEY (`EPS_idEPS1`) REFERENCES `eps` (`idEPS`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `usuario`
--
ALTER TABLE `usuario`
  ADD CONSTRAINT `fk_Usuario_Cargo1` FOREIGN KEY (`Cargo_idCargo`) REFERENCES `cargo` (`idCargo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Usuario_Correo1` FOREIGN KEY (`Correo_Correo`) REFERENCES `correo` (`Correo`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `vacunacion`
--
ALTER TABLE `vacunacion`
  ADD CONSTRAINT `fk_Aplicacion_Historico_Paciente1` FOREIGN KEY (`Paciente_idPaciente`) REFERENCES `paciente` (`Documento_Paciente`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_Vacunacion_EPS1` FOREIGN KEY (`EPS_idEPS`) REFERENCES `eps` (`idEPS`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_idLote` FOREIGN KEY (`LOTE_idLote`) REFERENCES `lote` (`idLote`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
