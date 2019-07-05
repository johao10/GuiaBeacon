-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-07-2019 a las 00:35:56
-- Versión del servidor: 10.1.38-MariaDB
-- Versión de PHP: 7.1.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `db_guiacampus`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_ambiente`
--

CREATE TABLE `tbl_ambiente` (
  `id_amb` int(11) NOT NULL,
  `nombre_amb` varchar(55) NOT NULL,
  `descrip_amb` varchar(55) NOT NULL,
  `imagen_amb` varchar(55) NOT NULL,
  `id_area` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_area`
--

CREATE TABLE `tbl_area` (
  `id_area` int(11) NOT NULL,
  `nombre_area` varchar(55) NOT NULL,
  `descrip_area` varchar(55) NOT NULL,
  `imagen_area` varchar(55) NOT NULL,
  `estado_area` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_curso`
--

CREATE TABLE `tbl_curso` (
  `id_curso` int(11) NOT NULL,
  `nombre_curso` varchar(55) NOT NULL,
  `id_docente` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tbl_curso`
--

INSERT INTO `tbl_curso` (`id_curso`, `nombre_curso`, `id_docente`) VALUES
(1, 'Simulacion de Sistemas', 1),
(2, 'Curso Integrador II', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_detall_ambiente`
--

CREATE TABLE `tbl_detall_ambiente` (
  `id_det` int(11) NOT NULL,
  `piso` varchar(20) NOT NULL,
  `id_bea` int(11) NOT NULL,
  `id_amb` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_docente`
--

CREATE TABLE `tbl_docente` (
  `id_docente` int(11) NOT NULL,
  `nombre_docente` varchar(55) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tbl_docente`
--

INSERT INTO `tbl_docente` (`id_docente`, `nombre_docente`) VALUES
(1, 'David Galvez'),
(2, 'Anibal Sardon'),
(3, 'Vicente Enrique Machaca Arceda');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_hora`
--

CREATE TABLE `tbl_hora` (
  `id_hora` int(11) NOT NULL,
  `hora_inicio` datetime NOT NULL,
  `hora_fin` datetime NOT NULL,
  `codigo` varchar(55) NOT NULL,
  `ubicacion` varchar(55) NOT NULL,
  `docente` varchar(20) NOT NULL,
  `curso` varchar(55) NOT NULL,
  `id_horario` int(11) NOT NULL,
  `id_curso` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tbl_hora`
--

INSERT INTO `tbl_hora` (`id_hora`, `hora_inicio`, `hora_fin`, `codigo`, `ubicacion`, `docente`, `curso`, `id_horario`, `id_curso`) VALUES
(1, '2019-06-07 05:00:00', '2019-06-07 06:30:00', '38BS102', 'Campus Arequipa', 'Vicente M.', 'Curso Integrador II', 1, 1),
(2, '2019-06-07 06:30:00', '2019-06-07 08:00:00', '77C0206', 'C_AQPPARRA', 'David G.', 'Simulacion de Sistemas', 1, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_horario`
--

CREATE TABLE `tbl_horario` (
  `id_horario` int(11) NOT NULL,
  `cod_beacon` varchar(55) NOT NULL,
  `nombre_beacon` varchar(55) NOT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_fin` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tbl_horario`
--

INSERT INTO `tbl_horario` (`id_horario`, `cod_beacon`, `nombre_beacon`, `fecha_inicio`, `fecha_fin`) VALUES
(1, '134ea391-4fdf-48a3-bcbf-434f6b55311f', 'Laboratorio 206', '2019-03-16', '2019-08-12'),
(2, '407d6a4f-5039-45a7-bad1-d33197a54f2a', 'Laboratorio 207', '2019-06-12', '2019-06-30'),
(3, '8a7cac1c-f61e-440e-bd52-330ea9a14045', 'Laboratorio 209', '0000-00-00', '0000-00-00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tbl_mensaje`
--

CREATE TABLE `tbl_mensaje` (
  `id_mens` int(11) NOT NULL,
  `fecha_vis` date NOT NULL,
  `estado_mens` varchar(5) NOT NULL,
  `id_horario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `names` varchar(55) NOT NULL,
  `user` varchar(55) NOT NULL,
  `pwd` varchar(55) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `names`, `user`, `pwd`) VALUES
(1, 'victor galvez', 'vic', '123'),
(2, 'chupetin trujillo', 'chupetin', 'trujillo'),
(3, 'gagaga', 'ga', 'ga');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tbl_ambiente`
--
ALTER TABLE `tbl_ambiente`
  ADD PRIMARY KEY (`id_amb`),
  ADD KEY `fkarea` (`id_area`);

--
-- Indices de la tabla `tbl_area`
--
ALTER TABLE `tbl_area`
  ADD PRIMARY KEY (`id_area`);

--
-- Indices de la tabla `tbl_curso`
--
ALTER TABLE `tbl_curso`
  ADD PRIMARY KEY (`id_curso`),
  ADD KEY `fk_docente_curso` (`id_docente`);

--
-- Indices de la tabla `tbl_detall_ambiente`
--
ALTER TABLE `tbl_detall_ambiente`
  ADD PRIMARY KEY (`id_det`);

--
-- Indices de la tabla `tbl_docente`
--
ALTER TABLE `tbl_docente`
  ADD PRIMARY KEY (`id_docente`);

--
-- Indices de la tabla `tbl_hora`
--
ALTER TABLE `tbl_hora`
  ADD PRIMARY KEY (`id_hora`),
  ADD KEY `fk_hora_rios` (`id_horario`),
  ADD KEY `fk_hora_curso` (`id_curso`);

--
-- Indices de la tabla `tbl_horario`
--
ALTER TABLE `tbl_horario`
  ADD PRIMARY KEY (`id_horario`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tbl_ambiente`
--
ALTER TABLE `tbl_ambiente`
  MODIFY `id_amb` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tbl_area`
--
ALTER TABLE `tbl_area`
  MODIFY `id_area` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tbl_curso`
--
ALTER TABLE `tbl_curso`
  MODIFY `id_curso` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tbl_detall_ambiente`
--
ALTER TABLE `tbl_detall_ambiente`
  MODIFY `id_det` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tbl_docente`
--
ALTER TABLE `tbl_docente`
  MODIFY `id_docente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `tbl_hora`
--
ALTER TABLE `tbl_hora`
  MODIFY `id_hora` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tbl_horario`
--
ALTER TABLE `tbl_horario`
  MODIFY `id_horario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tbl_ambiente`
--
ALTER TABLE `tbl_ambiente`
  ADD CONSTRAINT `fkarea` FOREIGN KEY (`id_area`) REFERENCES `tbl_area` (`id_area`);

--
-- Filtros para la tabla `tbl_curso`
--
ALTER TABLE `tbl_curso`
  ADD CONSTRAINT `fk_docente_curso` FOREIGN KEY (`id_docente`) REFERENCES `tbl_docente` (`id_docente`);

--
-- Filtros para la tabla `tbl_hora`
--
ALTER TABLE `tbl_hora`
  ADD CONSTRAINT `fk_hora_curso` FOREIGN KEY (`id_curso`) REFERENCES `tbl_curso` (`id_curso`),
  ADD CONSTRAINT `fk_hora_rios` FOREIGN KEY (`id_horario`) REFERENCES `tbl_horario` (`id_horario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
