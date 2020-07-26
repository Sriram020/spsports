-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.22-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema sports
--

CREATE DATABASE IF NOT EXISTS sports;
USE sports;

--
-- Definition of table `collegetour`
--

DROP TABLE IF EXISTS `collegetour`;
CREATE TABLE `collegetour` (
  `Tourname` varchar(45) NOT NULL,
  `Sport` varchar(45) NOT NULL,
  `Venue` varchar(45) NOT NULL,
  `Sdate` date NOT NULL,
  `Edate` date NOT NULL,
  PRIMARY KEY  (`Tourname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `collegetour`
--

/*!40000 ALTER TABLE `collegetour` DISABLE KEYS */;
INSERT INTO `collegetour` (`Tourname`,`Sport`,`Venue`,`Sdate`,`Edate`) VALUES 
 ('GIOE Trophy','Cricket','GIOE','2018-10-10','2018-11-10'),
 ('IOE Kabbaddi','Kabbadi','IOE','2018-12-10','2018-12-20'),
 ('Sprinter Trophy','Running','GIOPT','2018-10-01','2018-11-10');
/*!40000 ALTER TABLE `collegetour` ENABLE KEYS */;


--
-- Definition of table `staffreg`
--

DROP TABLE IF EXISTS `staffreg`;
CREATE TABLE `staffreg` (
  `Staffname` varchar(45) NOT NULL,
  `StaffID` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Mobile` varchar(45) NOT NULL,
  `DOB` date NOT NULL,
  `Password` varchar(45) NOT NULL,
  `College` varchar(45) NOT NULL,
  PRIMARY KEY  (`StaffID`,`Email`,`Mobile`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staffreg`
--

/*!40000 ALTER TABLE `staffreg` DISABLE KEYS */;
INSERT INTO `staffreg` (`Staffname`,`StaffID`,`Email`,`Mobile`,`DOB`,`Password`,`College`) VALUES 
 ('SravanB','ioe007','Sravan@gmail.com','8639486323','2000-05-25','Sriram','GIOE'),
 ('Lokesh','par052','lokesh1234@gmail.com','123456789','2000-09-28','Lokesh','Parayana');
/*!40000 ALTER TABLE `staffreg` ENABLE KEYS */;


--
-- Definition of table `statetour`
--

DROP TABLE IF EXISTS `statetour`;
CREATE TABLE `statetour` (
  `Tourname` varchar(45) NOT NULL,
  `Sport` varchar(45) NOT NULL,
  `Venue` varchar(45) NOT NULL,
  `Sdate` date NOT NULL,
  `Ddate` date NOT NULL,
  PRIMARY KEY  (`Tourname`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `statetour`
--

/*!40000 ALTER TABLE `statetour` DISABLE KEYS */;
INSERT INTO `statetour` (`Tourname`,`Sport`,`Venue`,`Sdate`,`Ddate`) VALUES 
 ('ProKabaddi','Kabbadi','Gachibowly Stadium','2018-10-01','2018-11-12'),
 ('Ranji Trophy','Cricket','RGI Stadium','2018-09-03','2018-10-10'),
 ('SPrinter Trophy','Running','LB Stadium','2018-10-10','2018-11-12');
/*!40000 ALTER TABLE `statetour` ENABLE KEYS */;


--
-- Definition of table `stureg`
--

DROP TABLE IF EXISTS `stureg`;
CREATE TABLE `stureg` (
  `Student_Name` varchar(45) NOT NULL,
  `Roll_Number` varchar(45) NOT NULL,
  `Email` varchar(45) NOT NULL,
  `Phone_Number` varchar(45) NOT NULL,
  `DOB` date NOT NULL,
  `Sport` varchar(45) NOT NULL,
  `College` varchar(45) NOT NULL,
  `Status` varchar(45) default NULL,
  `Level` varchar(45) NOT NULL,
  PRIMARY KEY  (`Roll_Number`,`Email`,`Phone_Number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `stureg`
--

/*!40000 ALTER TABLE `stureg` DISABLE KEYS */;
INSERT INTO `stureg` (`Student_Name`,`Roll_Number`,`Email`,`Phone_Number`,`DOB`,`Sport`,`College`,`Status`,`Level`) VALUES 
 ('Sunil','002','sunil@gmail.com','963852741','1998-02-01','Running','GIOE',NULL,'State'),
 ('Dhanush','004','dhanush@gmail.com','987654321','2000-09-05','Cricket','Parayana',NULL,'State'),
 ('Sravan','007','sravan@gmail.com','123456789','1999-05-25','Cricket','GIOE','Selected','College'),
 ('Sriram','020','sriram@gmail.com','123456789','2000-09-03','Cricket','GIOE','Selected','State'),
 ('Prabay','021','pranay@gmail.com','147258369','2000-02-13','Cricket','Parayana','Rejected','College'),
 ('Prasad','060','prasad123@gmail.com','789456123','1998-10-19','Cricket','Parayana','Selected','College'),
 ('Sriramkumar','15054cp020','sriram.erugudala@gmail.com','8639486323','2000-09-03','Cricket','Parayana','Selected','State');
/*!40000 ALTER TABLE `stureg` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
