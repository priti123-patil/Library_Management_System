-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 11, 2020 at 08:46 AM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.2.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_library`
--

-- --------------------------------------------------------

--
-- Table structure for table `book`
--

CREATE TABLE `book` (
  `bid` int(30) NOT NULL,
  `bname` varchar(30) NOT NULL,
  `author` varchar(30) NOT NULL,
  `pages` int(30) NOT NULL,
  `publication` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `book`
--

INSERT INTO `book` (`bid`, `bname`, `author`, `pages`, `publication`) VALUES
(1, 'JAVA Programming', 'E Balguruswamy', 300, 'Technical'),
(2, 'MIC', 'Rashmi Utage', 200, 'Techknowledge'),
(5, 'DCC', 'AD Ambure', 250, 'Techknowledge'),
(10, 'Advanced Java', 'Sagar Verma', 320, 'Technical'),
(11, 'Programming in C', 'Brian Kernighan', 600, 'Nirali'),
(12, 'C++', 'Bjarne Stroustrup', 450, 'Techknowledge'),
(13, 'Python', 'Zed A', 550, 'Nirali'),
(14, 'C', 'Dennis Ritchie', 370, 'Technical');

-- --------------------------------------------------------

--
-- Table structure for table `issuebook`
--

CREATE TABLE `issuebook` (
  `sid` int(30) NOT NULL,
  `sname` varchar(30) NOT NULL,
  `bid` int(30) NOT NULL,
  `bname` varchar(30) NOT NULL,
  `author` varchar(30) NOT NULL,
  `pages` int(30) NOT NULL,
  `issuedate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `issuebook`
--

INSERT INTO `issuebook` (`sid`, `sname`, `bid`, `bname`, `author`, `pages`, `issuedate`) VALUES
(1, ' priti ', 1, ' JAVA Programming ', ' E Balguruswamy ', 300, '2020-03-04'),
(2, ' mayuri ', 3, ' SEN ', ' SS Chavan ', 200, '2020-01-15'),
(1, ' priti ', 2, ' MIC ', ' Rashmi Utage ', 200, '2020-05-06'),
(4, ' Anju ', 2, ' DCC ', ' AD Ambure ', 250, '2020-03-06');

-- --------------------------------------------------------

--
-- Table structure for table `returnbook`
--

CREATE TABLE `returnbook` (
  `sid` int(30) NOT NULL,
  `sname` varchar(30) NOT NULL,
  `bid` int(30) NOT NULL,
  `bname` varchar(30) NOT NULL,
  `author` varchar(30) NOT NULL,
  `pages` int(30) NOT NULL,
  `returndate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `returnbook`
--

INSERT INTO `returnbook` (`sid`, `sname`, `bid`, `bname`, `author`, `pages`, `returndate`) VALUES
(1, ' priti ', 1, ' JAVA Programming ', ' E Balguruswamy ', 300, '2020-05-03'),
(2, ' mayuri ', 3, ' SEN ', ' SS Chavan ', 200, '2020-03-03'),
(4, ' Anju ', 5, ' DCC ', ' AD Ambure ', 250, '2020-06-01'),
(1, ' priti ', 3, ' MIC ', ' Rashmi Utage ', 200, '2020-05-05');

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `sid` int(30) NOT NULL,
  `sname` varchar(30) NOT NULL,
  `address` varchar(30) NOT NULL,
  `phoneno` bigint(50) NOT NULL,
  `schooln` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`sid`, `sname`, `address`, `phoneno`, `schooln`) VALUES
(1, 'priti', 'Latur', 7972404273, 'Somani School'),
(5, 'Apurva', 'Ausa', 7890657866, 'Mukteshwar School'),
(6, 'Mayuri', 'ausa', 1234542312, 'Virbhadreshwar School'),
(7, 'Ganesh', 'Latur', 5678456734, 'Parimal School'),
(10, 'Nivedita', 'Nalegaon', 6758940322, 'Government School'),
(12, 'Gayatri', 'Usmanabad', 8795673445, 'Government School'),
(13, 'Divya', 'Udagir', 9067548900, 'Government School');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_login`
--

CREATE TABLE `tbl_login` (
  `username` varchar(30) NOT NULL,
  `password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_login`
--

INSERT INTO `tbl_login` (`username`, `password`) VALUES
('pihu', '123'),
('priti', '1610'),
('rupa', 'srunithi'),
('sima', 's08'),
('', ''),
('', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `book`
--
ALTER TABLE `book`
  ADD PRIMARY KEY (`bid`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`sid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `book`
--
ALTER TABLE `book`
  MODIFY `bid` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `sid` int(30) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
