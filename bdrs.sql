-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Feb 28, 2025 at 02:59 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bdrs`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`) VALUES
(1, 'admin', 'adminko');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_citizen`
--

CREATE TABLE `tbl_citizen` (
  `c_id` int(10) NOT NULL,
  `c_fname` varchar(50) NOT NULL,
  `c_lname` varchar(50) NOT NULL,
  `c_gender` varchar(50) NOT NULL,
  `c_email` varchar(100) NOT NULL,
  `c_address` varchar(100) NOT NULL,
  `c_status` varchar(11) NOT NULL,
  `c_contact` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_citizen`
--

INSERT INTO `tbl_citizen` (`c_id`, `c_fname`, `c_lname`, `c_gender`, `c_email`, `c_address`, `c_status`, `c_contact`) VALUES
(1, 'John Micole', 'Mangila', 'Male', 'johnmicole@gmail.com', 'Naga, tinaan', 'single', '917755555');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `gender` enum('Male','Female') NOT NULL,
  `contact` varchar(20) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(255) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `first_name`, `last_name`, `gender`, `contact`, `username`, `password`, `created_at`) VALUES
(3, 'clyde', 'undang', 'Male', '09090909', 'clydue', '15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225', '2025-02-24 14:47:48'),
(4, 'jiggy', 'gituaban', 'Male', '09090909', 'jigs', '9ab1f22b66d78d423022b76b4857ead025ce079c0ad74e2dad95f8c9380e15c2', '2025-02-24 14:57:41'),
(5, 'john', 'micole', 'Male', '09123456789', 'micole', '4938a08a8e81a8a9e45b4ee887d4a2b3431a9d38ddb03ff1705c1b056bbf9be1', '2025-02-26 06:27:12'),
(6, 'Jesriel', 'Aligado', 'Male', '097858512', 'Jess', '3b40aeaa85a6d392b4732abe09f4003036bb4b20f129b1b0b182c6e641616bd4', '2025-02-26 10:04:09'),
(8, 'chloe', 'ceballos', 'Female', '09758585858', 'chloe', 'dfbdace52288149c66618b8da71546f93ea2dd22dd942728ce8ce6a4cb4f5712', '2025-02-26 10:09:28'),
(10, 'taho', 'baho', 'Male', '09090909', 'taho', '560346596bff386ee14cf5299fbeadd611ff00d0b00032b41c6c9838726e6593', '2025-02-26 10:29:03'),
(11, 'micole', 'john', 'Male', '123456789', 'coleme', '3f05963ccb00d530facd29b56f0646363eaa085eeb479b975ded759ff47670eb', '2025-02-26 10:32:34'),
(14, 'gwapo', 'kaayo', 'Male', '78954212', 'gwapo', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', '2025-02-26 10:36:49'),
(16, 'gwapa', 'ka', 'Male', '123588888', 'gwaps', '3f05963ccb00d530facd29b56f0646363eaa085eeb479b975ded759ff47670eb', '2025-02-26 10:41:59'),
(17, 'john', 'micole', 'Male', '09123456789', 'gwapos', '93f0c0cf3540055cc1e18917ff279976f7474b3501870546fb9fc37caf122ecd', '2025-02-26 10:44:50');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- Indexes for table `tbl_citizen`
--
ALTER TABLE `tbl_citizen`
  ADD PRIMARY KEY (`c_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `tbl_citizen`
--
ALTER TABLE `tbl_citizen`
  MODIFY `c_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
