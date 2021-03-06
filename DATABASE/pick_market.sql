-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 18, 2020 at 08:02 PM
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
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `RECORD_ID` int(11) NOT NULL,
  `ROLE_CODE` int(11) NOT NULL,
  `FIRST_NAME` varchar(500) NOT NULL,
  `LAST_NAME` varchar(500) NOT NULL,
  `ID_NUMBER` varchar(500) NOT NULL,
  `ADMIN_USERNAME` varchar(500) NOT NULL,
  `ADMIN_PASSWORD` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`RECORD_ID`, `ROLE_CODE`, `FIRST_NAME`, `LAST_NAME`, `ID_NUMBER`, `ADMIN_USERNAME`, `ADMIN_PASSWORD`) VALUES
(1, 2, 'abc', 'silva', '96521512v', 'abc123', '123');

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `RECORD_ID` int(11) NOT NULL,
  `USER_NAME` varchar(500) NOT NULL,
  `ITEM_NAME` varchar(500) NOT NULL,
  `ITEM_QUENTITY` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`RECORD_ID`, `USER_NAME`, `ITEM_NAME`, `ITEM_QUENTITY`) VALUES
(1, 'abc123', 'iphone 7', '1'),
(2, 'def123', 'iphone 8', '2');

-- --------------------------------------------------------

--
-- Table structure for table `checkout`
--

CREATE TABLE `checkout` (
  `RECORD_ID` int(11) NOT NULL,
  `ITEM_NAME` varchar(500) NOT NULL,
  `ITEM_QUENTITY` varchar(500) NOT NULL,
  `TOTAL_AMOUNT` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `checkout`
--

INSERT INTO `checkout` (`RECORD_ID`, `ITEM_NAME`, `ITEM_QUENTITY`, `TOTAL_AMOUNT`) VALUES
(1, 'iphone 7', '1', '60000'),
(2, 'iphone 8', '1', '70000');

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
(1, 'MP_001', 'Iphone 7', '50000', '128 GB, Red'),
(2, 'MP_002', 'Iphone 8', '80000', '128 GB, black');

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `RECORD_ID` int(11) NOT NULL,
  `PAYMENT_ID` int(11) NOT NULL,
  `USER_ID` int(11) NOT NULL,
  `CART_ID` int(11) NOT NULL,
  `PAYMENT_METHOD` varchar(500) NOT NULL,
  `TOTAL_AMOUNT` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment`
--

INSERT INTO `payment` (`RECORD_ID`, `PAYMENT_ID`, `USER_ID`, `CART_ID`, `PAYMENT_METHOD`, `TOTAL_AMOUNT`) VALUES
(1, 1, 3, 1, 'cash', '1500'),
(2, 2, 2, 2, 'card', '2500');

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
(3, 'perera', '10 ,abc , abc', '12232sd323', 'perera@gmail.com', '2020-04-11'),
(4, 'hello', '10 ,hello , hello', '0112545454', 'hello@gmail.com', '2020-04-10');

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
(3, 0, 'perera', 'perera123', '12345', 'perera@gmail.com', ''),
(4, 1, 'perera', 'perera123', '96125552v', 'abc123', '12345');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`RECORD_ID`);

--
-- Indexes for table `cart`
--
ALTER TABLE `cart`
  ADD PRIMARY KEY (`RECORD_ID`);

--
-- Indexes for table `checkout`
--
ALTER TABLE `checkout`
  ADD PRIMARY KEY (`RECORD_ID`);

--
-- Indexes for table `item`
--
ALTER TABLE `item`
  ADD PRIMARY KEY (`RECORD_ID`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
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
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `RECORD_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `cart`
--
ALTER TABLE `cart`
  MODIFY `RECORD_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `checkout`
--
ALTER TABLE `checkout`
  MODIFY `RECORD_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `item`
--
ALTER TABLE `item`
  MODIFY `RECORD_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `RECORD_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `shipping`
--
ALTER TABLE `shipping`
  MODIFY `SHIPPING_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `user`
--
ALTER TABLE `user`
  MODIFY `RECORD_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
