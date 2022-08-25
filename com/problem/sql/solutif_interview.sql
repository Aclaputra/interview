-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Aug 24, 2022 at 07:14 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `solutif_interview`
--
CREATE DATABASE solutif_interview;
-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `id` int(11) NOT NULL,
  `nip` varchar(255) NOT NULL,
  `nama` varchar(255) NOT NULL,
  `jurusan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `mahasiswa`
--

INSERT INTO `mahasiswa` (`id`, `nip`, `nama`, `jurusan`) VALUES
(1, '776654342', 'Nama A', 'Teknik Informatika'),
(2, '234674224', 'Nama B', 'Sistem Informasi'),
(3, '238644535', 'Nama C', 'Ekonomi'),
(4, '235565656', 'Nama D', 'Sastra Inggris'),
(5, '232344677', 'Nama E', 'Teknik Industri');

-- --------------------------------------------------------

--
-- Table structure for table `pinjaman`
--

CREATE TABLE `pinjaman` (
  `id` int(11) NOT NULL,
  `mahasiswa_id` int(11) NOT NULL,
  `nip` varchar(255) NOT NULL,
  `kd_buku` varchar(255) NOT NULL,
  `tgl_pinjam` date DEFAULT NULL,
  `tgl_kembali` date DEFAULT NULL,
  `denda` bigint(20) NOT NULL,
  `status_pembayaran` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pinjaman`
--

INSERT INTO `pinjaman` (`id`, `mahasiswa_id`, `nip`, `kd_buku`, `tgl_pinjam`, `tgl_kembali`, `denda`, `status_pembayaran`) VALUES
(1, 1, '776654342', 'KD130', '2022-07-21', NULL, 1000, 'belum'),
(2, 2, '234674224', 'KD032', '2022-06-15', '2022-07-20', 0, 'lunas'),
(3, 3, '238644535', 'KD001', '2022-01-01', '2022-01-07', 0, 'belum'),
(4, 4, '235565656', 'KD022', '2022-07-12', NULL, 3000, 'belum'),
(5, 5, '232355677', 'KD111', '2022-06-22', NULL, 5000, 'belum');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pinjaman`
--
ALTER TABLE `pinjaman`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Sambungkan ke user id` (`mahasiswa_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `pinjaman`
--
ALTER TABLE `pinjaman`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `pinjaman`
--
ALTER TABLE `pinjaman`
  ADD CONSTRAINT `Sambungkan ke user id` FOREIGN KEY (`mahasiswa_id`) REFERENCES `mahasiswa` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- test database dan tabel
-- soal nomor 1
SELECT mahasiswa.nip, mahasiswa.nama, mahasiswa.jurusan, pinjaman.kd_buku
FROM pinjaman INNER JOIN mahasiswa ON pinjaman.mahasiswa_id = mahasiswa.id;
-- soal nomor 2
SELECT pinjaman.tgl_pinjam, pinjaman.tgl_kembali FROM pinjaman INNER JOIN
mahasiswa ON pinjaman.mahasiswa_id = mahasiswa.id;
-- soal nomor 3
SELECT mahasiswa.nip, mahasiswa.nama, mahasiswa.jurusan FROM pinjaman INNER
JOIN mahasiswa ON pinjaman.mahasiswa_id = mahasiswa.id WHERE
pinjaman.status_pembayaran = "belum";






