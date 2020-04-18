-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 18, 2020 at 07:47 AM
-- Server version: 10.1.35-MariaDB
-- PHP Version: 7.2.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pick_market`
--

-- --------------------------------------------------------

--
-- Table structure for table `item`
--

CREATE TABLE `item` (
  `RECORD_ID` int(11) NOT NULL,
  `ITEM_CODE` varchar(100) DEFAULT NULL,
  `ITEM_NAME` varchar(100) DEFAULT NULL,
  `ITEM_PRICE` varchar(100) DEFAULT NULL,
  `ITEM_DESCRIPTION` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `item`
--

INSERT INTO `item` (`RECORD_ID`, `ITEM_CODE`, `ITEM_NAME`, `ITEM_PRICE`, `ITEM_DESCRIPTION`) VALUES
(1, 'MP_001', 'Iphone 7', '50000', '128 GB, Red');

-- --------------------------------------------------------

--
-- Table structure for table `shipping`
--

CREATE TABLE `shipping` (
  `SHIPPING_ID` int(11) NOT NULL,
  `SHIPPING_CUSTOMER` varchar(500) NOT NULL,
  `SHIPPING_ADDRESS` varchar(500) NOT NULL,
  `SHIPPING_PHONE` varchar(500) NOT NULL,
  `SHIPPING_EMAIL` varchar(500) NOT NULL,
  `SHIPPING_DATE` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `shipping`
--

INSERT INTO `shipping` (`SHIPPING_ID`, `SHIPPING_CUSTOMER`, `SHIPPING_ADDRESS`, `SHIPPING_PHONE`, `SHIPPING_EMAIL`, `SHIPPING_DATE`) VALUES
(1, 'yasas', 'abc , abc', '12232323', 'yas@gmail.com', '2020-04-18'),
(2, 'abc', '1A, hbhsdb bdfhsd', '1551545', 'abc@gmail.com', '2020-04-17'),
(3, 'perera', '10 ,abc , abc', '12232sd323', 'perera@gmail.com', '2020-04-11');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `RECORD_ID` int(11) NOT NULL,
  `ROLE_CODE` int(11) NOT NULL,
  `FIRST_NAME` varchar(500) NOT NULL,
  `LAST_NAME` varchar(500) NOT NULL,
  `ID_NUMBER` varchar(500) NOT NULL,
  `USER_USERNAME` varchar(500) NOT NULL,
  `USER_PASSWORD` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`RECORD_ID`, `ROLE_CODE`, `FIRST_NAME`, `LAST_NAME`, `ID_NUMBER`, `USER_USERNAME`, `USER_PASSWORD`) VALUES
(1, 0, 'yasas', 'yas96', '123', 'yas@gmail.com', ''),
(2, 0, 'abc', 'abc83', '1234', 'abc@gmail.com', ''),
(3, 0, 'perera', 'perera123', '12345', 'perera@gmail.com', '');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`RECORD_ID`);

--
-- Indexes for table `shipping`
--
ALTER TABLE `shipping`
  ADD PRIMARY KEY (`SHIPPING_ID`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`RECORD_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `item`
--
ALTER TABLE `item`
  MODIFY `RECORD_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `shipping`
--
ALTER TABLE `shipping`
  MODIFY `SHIPPING_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `RECORD_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
