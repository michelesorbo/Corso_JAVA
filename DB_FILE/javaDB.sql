-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Creato il: Set 20, 2023 alle 08:28
-- Versione del server: 5.7.39
-- Versione PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javaDB`
--

-- --------------------------------------------------------

--
-- Struttura della tabella `uffici`
--

CREATE TABLE `uffici` (
  `id` int(11) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `piano` varchar(100) NOT NULL,
  `stanza` varchar(50) NOT NULL,
  `interno` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `uffici`
--

INSERT INTO `uffici` (`id`, `nome`, `piano`, `stanza`, `interno`) VALUES
(1, 'IT', '15', '15A', '152'),
(2, 'Amministrazione', '14', '14B', '143'),
(3, 'Marketing', '14', '14A', '141'),
(4, 'Personale', '15', '15C', '156');

-- --------------------------------------------------------

--
-- Struttura della tabella `utenti`
--

CREATE TABLE `utenti` (
  `id` int(11) NOT NULL,
  `nome` varchar(150) NOT NULL,
  `cognome` varchar(150) NOT NULL,
  `residenza` varchar(150) DEFAULT NULL,
  `eta` int(3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dump dei dati per la tabella `utenti`
--

INSERT INTO `utenti` (`id`, `nome`, `cognome`, `residenza`, `eta`) VALUES
(1, 'michele', 'sorbo', 'caserta', 44),
(2, 'alessio', 'leodori', 'roma', 35),
(3, 'Mario', 'Rossi', 'roma', 58),
(4, 'giuseppe', 'Verdi', NULL, NULL),
(5, 'Vincenzo', 'Romano', 'Napoli', 43),
(6, 'Mirko', 'Di Palo', 'Sanremo', 30),
(7, 'Antonio', 'Di Palo', 'Caserta', 35);

--
-- Indici per le tabelle scaricate
--

--
-- Indici per le tabelle `uffici`
--
ALTER TABLE `uffici`
  ADD PRIMARY KEY (`id`);

--
-- Indici per le tabelle `utenti`
--
ALTER TABLE `utenti`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT per le tabelle scaricate
--

--
-- AUTO_INCREMENT per la tabella `uffici`
--
ALTER TABLE `uffici`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT per la tabella `utenti`
--
ALTER TABLE `utenti`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
