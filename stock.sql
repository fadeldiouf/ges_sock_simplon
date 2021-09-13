-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le : mar. 24 août 2021 à 23:46
-- Version du serveur :  5.7.31
-- Version de PHP : 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `stock`
--

-- --------------------------------------------------------

--
-- Structure de la table `categorie`
--

DROP TABLE IF EXISTS `categorie`;
CREATE TABLE IF NOT EXISTS `categorie` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `categorie`
--

INSERT INTO `categorie` (`id`, `description`, `nom`) VALUES
(1, 'bn', 'bn'),
(2, 'bn1', 'bn1'),
(3, 'bn3', 'bn3'),
(4, 'bn', 'bn'),
(5, NULL, NULL),
(6, NULL, NULL),
(7, NULL, NULL),
(8, 'ccccc', 'ccccc');

-- --------------------------------------------------------

--
-- Structure de la table `depot`
--

DROP TABLE IF EXISTS `depot`;
CREATE TABLE IF NOT EXISTS `depot` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `date` datetime DEFAULT NULL,
  `libelle` varchar(255) DEFAULT NULL,
  `quantitecourant` int(11) NOT NULL,
  `quantiteinitial` int(11) NOT NULL,
  `fournisseur_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK1jvt8tiksk9tbqsnfjsvia2et` (`fournisseur_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `depot`
--

INSERT INTO `depot` (`id`, `date`, `libelle`, `quantitecourant`, `quantiteinitial`, `fournisseur_id`) VALUES
(1, '2021-08-23 04:47:31', 'bbbbbbbbbbbbbbbbb', 30, 30, 1),
(2, '2021-08-23 04:47:31', 'aaaaaaaaaa', 40, 40, NULL),
(3, '2021-08-23 04:47:31', 'ccccccc', 60, 60, NULL),
(4, '2021-08-23 04:47:31', 'bbbbbbbbbbbbbbbbb', 30, 30, NULL),
(5, '2021-08-23 04:47:31', 'bbbbbbbbbbbbbbbbb', 30, 30, NULL),
(6, '2021-08-23 04:47:31', 'bbbbbbbbbbbbbbbbb', 30, 30, NULL),
(7, '2021-08-23 04:47:31', 'bbbbbbbbbbbbbbbbb', 30, 30, NULL),
(8, '2021-08-23 04:47:31', 'bbbbbbbbbbbbbbbbb', 30, 30, NULL),
(9, '2021-08-23 04:47:31', 'bbbbbbbbbbbbbbbbb', 30, 30, NULL),
(10, '2021-08-23 04:47:31', 'bbbbbbbbbbbbbbbbb', 30, 30, NULL),
(11, '2021-08-23 04:47:31', 'bbbbbbbbbbbbbbbbb', 30, 30, NULL),
(12, '2021-08-23 04:47:31', 'bbbbbbbbbbbbbbbbb', 30, 30, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `fournisseur`
--

DROP TABLE IF EXISTS `fournisseur`;
CREATE TABLE IF NOT EXISTS `fournisseur` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `addresse` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `fournisseur`
--

INSERT INTO `fournisseur` (`id`, `addresse`, `email`, `nom`, `prenom`, `telephone`) VALUES
(1, 'vvv', 'vvvv', 'vvv', 'vvv', 'vvvv'),
(2, 'vvv', 'vvvv@aaaa', 'aaa', 'vvv', '00000'),
(3, 'bbb', 'vvvv', 'bbb', 'bbb', '11111');

-- --------------------------------------------------------

--
-- Structure de la table `gerant`
--

DROP TABLE IF EXISTS `gerant`;
CREATE TABLE IF NOT EXISTS `gerant` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `addresse` varchar(255) DEFAULT NULL,
  `civilite` varchar(255) DEFAULT NULL,
  `cni` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `genre` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `prenom` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `gerant`
--

INSERT INTO `gerant` (`id`, `addresse`, `civilite`, `cni`, `email`, `genre`, `nom`, `prenom`, `telephone`) VALUES
(1, 'dddd', 'dddd', '12345', 'faaaaaall', 'm', 'fadel', 'diouf', '77777777'),
(2, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(3, 'dddd', 'dddd', '12345', 'faaaaaall', 'm', 'lamp', 'samb', '77777777'),
(4, 'dddd', 'dddd', '12345', 'faaaaaall', 'm', 'fadel', 'diouf', '77777777');

-- --------------------------------------------------------

--
-- Structure de la table `magasin`
--

DROP TABLE IF EXISTS `magasin`;
CREATE TABLE IF NOT EXISTS `magasin` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `addresse` varchar(255) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `telephone` varchar(255) DEFAULT NULL,
  `gerant_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKs8iwnnjjmknd1kuq1fedafn6x` (`gerant_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `magasin`
--

INSERT INTO `magasin` (`id`, `addresse`, `date`, `email`, `nom`, `telephone`, `gerant_id`) VALUES
(2, 'touba toul', '2021-08-24 03:09:27', 'toul@touba', 'sope s fallou', '888888', 1),
(3, 'touba ', '2021-08-24 03:09:27', 'toul@touba', 'sope s saliou', '888888', NULL),
(4, 'touba ', '2021-08-24 03:09:27', 'toul@touba', 'sope s khabane', '887777', NULL),
(5, 'Colobane ', '2021-08-24 03:09:27', 'colobane@colobane', 'keur astou', '887777', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `produit`
--

DROP TABLE IF EXISTS `produit`;
CREATE TABLE IF NOT EXISTS `produit` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `disponible` bit(1) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  `prixunitaire` double DEFAULT NULL,
  `categorie_id` bigint(20) DEFAULT NULL,
  `depot_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK52xhp55kbbl6u4rbluxm3g9hw` (`categorie_id`),
  KEY `FKelh1nu0oa7igjak9b31pqp18b` (`depot_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `produit`
--

INSERT INTO `produit` (`id`, `description`, `disponible`, `nom`, `photo`, `prixunitaire`, `categorie_id`, `depot_id`) VALUES
(1, 'cccccccccbbb', b'1', 'sass', NULL, 50000, NULL, NULL),
(2, 'ccccccccc', b'1', 'sass1', NULL, 50000, NULL, NULL),
(3, 'ccccccccc', b'1', 'sass2', NULL, 50000, NULL, NULL),
(4, 'aaaaaaa', b'1', 'sass3', NULL, 50000, NULL, NULL),
(5, NULL, NULL, 'fadel', NULL, NULL, NULL, NULL);

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `depot`
--
ALTER TABLE `depot`
  ADD CONSTRAINT `FK1jvt8tiksk9tbqsnfjsvia2et` FOREIGN KEY (`fournisseur_id`) REFERENCES `fournisseur` (`id`);

--
-- Contraintes pour la table `magasin`
--
ALTER TABLE `magasin`
  ADD CONSTRAINT `FKs8iwnnjjmknd1kuq1fedafn6x` FOREIGN KEY (`gerant_id`) REFERENCES `gerant` (`id`);

--
-- Contraintes pour la table `produit`
--
ALTER TABLE `produit`
  ADD CONSTRAINT `FK52xhp55kbbl6u4rbluxm3g9hw` FOREIGN KEY (`categorie_id`) REFERENCES `categorie` (`id`),
  ADD CONSTRAINT `FKelh1nu0oa7igjak9b31pqp18b` FOREIGN KEY (`depot_id`) REFERENCES `depot` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
