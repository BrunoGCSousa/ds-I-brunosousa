-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Tempo de geração: 18-Maio-2023 às 00:42
-- Versão do servidor: 5.7.36
-- versão do PHP: 7.4.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `estacionamento`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `carro`
--

DROP TABLE IF EXISTS `carro`;
CREATE TABLE IF NOT EXISTS `carro` (
  `placa` char(7) NOT NULL,
  `cor` varchar(20) DEFAULT NULL,
  `descricao` varchar(100) DEFAULT NULL,
  `modelo` varchar(100) NOT NULL,
  `marca` varchar(100) NOT NULL,
  `conversivel` varchar(20) DEFAULT NULL,
  `janelas` int(11) DEFAULT NULL,
  `portas` int(11) DEFAULT NULL,
  `rodas` int(11) DEFAULT NULL,
  `4x4` varchar(20) DEFAULT NULL,
  `porte` varchar(70) DEFAULT NULL,
  `blindado` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`placa`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `carro`
--

INSERT INTO `carro` (`placa`, `cor`, `descricao`, `modelo`, `marca`, `conversivel`, `janelas`, `portas`, `rodas`, `4x4`, `porte`, `blindado`) VALUES
('ASD1247', 'Azul', 'Carro 1', 'Volkswagen', 'Palio', 'Sim', 2, 2, 2, 'Sim', 'Pequeno', 'Blindado'),
('Abc2255', 'Rosa', 'Carro 2', 'Gol', 'Bolinha', 'Não', 4, 2, 1, 'Sim', 'Não', 'Não'),
('KHE1234', 'Amarelo', 'Carro 3', 'Corsa', 'Chevetto', 'Só a janela', 0, 0, 0, 'Não', 'Nulo', 'Tenta a sorte'),
('DEFG213', 'Branco', 'Carro merda', 'Palio', 'Volkswagen', 'Não', 4, 4, 4, 'Não', 'Pequeno', 'Sim');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
