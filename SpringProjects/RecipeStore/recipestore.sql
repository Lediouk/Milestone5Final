-- phpMyAdmin SQL Dump
-- version 4.9.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: May 06, 2024 at 02:08 AM
-- Server version: 5.7.24
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
-- Database: `recipestore`
--

-- --------------------------------------------------------

--
-- Table structure for table `recipes`
--

CREATE TABLE `recipes` (
  `recipeid` int(11) NOT NULL,
  `category` varchar(255) DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `description` text,
  `image_file_name` varchar(255) DEFAULT NULL,
  `ingredients` text,
  `instructions` text,
  `name` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `recipes`
--

INSERT INTO `recipes` (`recipeid`, `category`, `created_at`, `description`, `image_file_name`, `ingredients`, `instructions`, `name`) VALUES
(1, 'Pasta', '2024-05-05 13:19:49.000000', 'Classic Italian pasta dish with creamy sauce', 'spaghetti_carbonara.jpg', 'Spaghetti, eggs, bacon, Parmesan cheese, black pepper', '1. Cook spaghetti according to package instructions...', 'Spaghetti Carbonara'),
(2, 'Salad', '2024-05-05 13:19:49.000000', 'Healthy salad with grilled chicken and fresh veggies', 'grilled_chicken_salad.jpg', 'Chicken breast, lettuce, tomato, cucumber, bell pepper', '1. Season chicken breast with salt and pepper. 2. ...', 'Grilled Chicken Salad'),
(3, 'Dessert', '2024-05-05 13:19:49.000000', 'Classic homemade cookies with chocolate chips', 'chocolate_chip_cookies.jpg', 'Butter, sugar, brown sugar, eggs, vanilla extract, flour, chocolate chips', '1. Preheat oven to 350°F (175°C). 2. In a mixing bowl...', 'Chocolate Chip Cookies'),
(4, 'Soup', '2024-05-05 13:19:49.000000', 'Rich and flavorful soup topped with melted cheese', 'french_onion_soup.jpg', 'Onions, beef broth, baguette, Gruyere cheese, butter', '1. Slice onions thinly. 2. Melt butter in a large pot...', 'French Onion Soup'),
(5, 'Salad', '2024-05-05 13:19:49.000000', 'Classic salad with crisp romaine lettuce and Caesar dressing', 'caesar_salad.jpg', 'Romaine lettuce, croutons, Parmesan cheese, Caesar dressing', '1. Tear lettuce into bite-sized pieces. 2. ...', 'Caesar Salad');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `recipes`
--
ALTER TABLE `recipes`
  ADD PRIMARY KEY (`recipeid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `recipes`
--
ALTER TABLE `recipes`
  MODIFY `recipeid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
