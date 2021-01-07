-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 07, 2021 at 01:02 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bvr`
--

-- --------------------------------------------------------

--
-- Table structure for table `history`
--

CREATE TABLE `history` (
  `Id` int(11) NOT NULL,
  `Name` text NOT NULL,
  `DOB` text NOT NULL,
  `Gender` text NOT NULL,
  `Courss` text NOT NULL,
  `Number` text NOT NULL,
  `State` text NOT NULL,
  `Country` text NOT NULL,
  `Address` text NOT NULL,
  `Email` text NOT NULL,
  `Action` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `history`
--

INSERT INTO `history` (`Id`, `Name`, `DOB`, `Gender`, `Courss`, `Number`, `State`, `Country`, `Address`, `Email`, `Action`) VALUES
(1, '1', '1', '1', '', '', '1', '', '', '', ''),
(1401150, 'sanjeev', '24/08/1998', 'Male', 'bca', '9149260839', 'up', 'Indian', 'devipura', 'ssp9448@gmail.com', 'New Entry'),
(1401151, 'Rajeev', '17/07/1999', 'Male', '12th', '7830290517', 'up', 'Indian', 'devipura', 'rajeev@gmail.com', 'New Entry'),
(1401151, 'Rajeev', '17/07/1999', 'Male', '12th', '7830290517', 'up', 'Indian', 'devipura', 'rajeev94@gmail.com', 'Update'),
(1401151, 'Rajeev', '17/07/1999', 'Male', '12th', '7830290517', 'up', 'Indian', 'devipura', 'rajeev94@gmail.com', 'Delete'),
(1401151, 'Rajeev', '17/07/1999', 'Male', '12th', '7830290517', 'mp', 'Indian', 'devoipu', 'raj@fb.in', 'New Entry');

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `Username` text NOT NULL,
  `Password` text NOT NULL,
  `Re_Password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`Username`, `Password`, `Re_Password`) VALUES
('ssp', '12345', 'ssp');

-- --------------------------------------------------------

--
-- Table structure for table `studentdetail`
--

CREATE TABLE `studentdetail` (
  `Id` int(11) NOT NULL,
  `Name` text NOT NULL,
  `DOB` text NOT NULL,
  `Gender` text NOT NULL,
  `Courss` text NOT NULL,
  `Number` text NOT NULL,
  `State` text NOT NULL,
  `Country` text NOT NULL,
  `Address` text NOT NULL,
  `Email` text NOT NULL,
  `Password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `studentdetail`
--

INSERT INTO `studentdetail` (`Id`, `Name`, `DOB`, `Gender`, `Courss`, `Number`, `State`, `Country`, `Address`, `Email`, `Password`) VALUES
(1401150, 'sanjeev', '24/08/1998', 'Male', 'bca', '9149260839', 'up', 'Indian', 'devipura', 'ssp9448@gmail.com', '12345'),
(1401151, 'Rajeev', '17/07/1999', 'Male', '12th', '7830290517', 'mp', 'Indian', 'devoipu', 'raj@fb.in', '12345');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `studentdetail`
--
ALTER TABLE `studentdetail`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `studentdetail`
--
ALTER TABLE `studentdetail`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1401152;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
