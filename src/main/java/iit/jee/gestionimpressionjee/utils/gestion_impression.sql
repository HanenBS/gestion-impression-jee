-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 12, 2024 at 00:27 AM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `gestion_impression`
--

-- --------------------------------------------------------

--
-- Table structure for table `enseignementmatieres`
--

CREATE TABLE `enseignementmatieres` (
  `id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `matiere_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `enseignementmatieres`
--

INSERT INTO `enseignementmatieres` (`id`, `user_id`, `matiere_id`) VALUES
(25, 3, 3),
(26, 4, 5),
(27, 2, 6);

-- --------------------------------------------------------

--
-- Table structure for table `groups`
--

CREATE TABLE `groups` (
  `id` int(11) NOT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `nbetudiants` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `groups`
--

INSERT INTO `groups` (`id`, `nom`, `nbetudiants`) VALUES
(1, 'Groupe A', 30),
(2, 'Groupe B', 32),
(3, 'Groupe C', 27);

-- --------------------------------------------------------

--
-- Table structure for table `impressions`
--

CREATE TABLE `impressions` (
  `id` int(11) NOT NULL,
  `id_enseignant` int(11) DEFAULT NULL,
  `id_groupe` int(11) DEFAULT NULL,
  `id_matiere` int(11) DEFAULT NULL,
  `date_impression` date DEFAULT NULL,
  `document` varchar(255) DEFAULT NULL,
  `etat` varchar(255) DEFAULT NULL,
  `nombreDePages` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `impressions`
--

INSERT INTO `impressions` (`id`, `id_enseignant`, `id_groupe`, `id_matiere`, `date_impression`, `document`, `etat`, `nombreDePages`) VALUES
(2, 3, 1, 4, '2024-05-10', 'new_document.pdf', 'En cours', 20),
(4, 4, 2, 5, '2024-05-11', 'other_document.pdf', 'En attente', 15),
(6, 2, 3, 6, '2024-05-12', 'another_document.pdf', 'Complete', 30);

-- --------------------------------------------------------

--
-- Table structure for table `matieres`
--

CREATE TABLE `matieres` (
  `id` int(11) NOT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `matieres`
--

INSERT INTO `matieres` (`id`, `nom`, `description`) VALUES
(2, 'francais', 'Langue francaise'),
(4, 'histoire', 'Histoire mondiale'),
(5, 'physique', 'Physique quantique'),
(6, 'chimie', 'Chimie organique');

-- --------------------------------------------------------

--
-- Table structure for table `roles`
--

CREATE TABLE `roles` (
  `id` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `roles`
--

INSERT INTO `roles` (`id`, `name`) VALUES
(1, 'admin'),
(2, 'agent'),
(3, 'enseignant');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `user_id` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `active` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`user_id`, `username`, `password`, `email`, `role`, `active`) VALUES
(1, 'newuser1', 'newpassword1', 'newuser1@example.com', 'admin', 1),
(2, 'newuser2', 'newpassword2', 'newuser2@example.com', 'agent', 0),
(3, 'newuser3', 'newpassword3', 'newuser3@example.com', 'enseignant', 1),
(4, 'newuser4', 'newpassword4', 'newuser4@example.com', 'agent', 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `enseignementmatieres`
--
ALTER TABLE `enseignementmatieres`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `groups`
--
ALTER TABLE `groups`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `impressions`
--
ALTER TABLE `impressions`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `matieres`
--
ALTER TABLE `matieres`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `roles`
--
ALTER TABLE `roles`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `enseignementmatieres`
--
ALTER TABLE `enseignementmatieres`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=28;

--
-- AUTO_INCREMENT for table `groups`
--
ALTER TABLE `groups`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `impressions`
--
ALTER TABLE `impressions`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `matieres`
--
ALTER TABLE `matieres`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `roles`
--
ALTER TABLE `roles`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
