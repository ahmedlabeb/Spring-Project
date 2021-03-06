-- MySQL Script generated by MySQL Workbench
-- 04/28/17 16:59:27
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema onlineshopping
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema onlineshopping
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `onlineshopping` DEFAULT CHARACTER SET utf8 ;
USE `onlineshopping` ;

-- -----------------------------------------------------
-- Table `onlineshopping`.`creditcard`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `onlineshopping`.`creditcard` ;

CREATE TABLE IF NOT EXISTS `onlineshopping`.`creditcard` (
  `number` BIGINT(20) NOT NULL,
  `expireDate` VARCHAR(45) NULL DEFAULT NULL,
  `balance` DOUBLE NULL DEFAULT '1000',
  PRIMARY KEY (`number`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `onlineshopping`.`user`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `onlineshopping`.`user` ;

CREATE TABLE IF NOT EXISTS `onlineshopping`.`user` (
  `email` VARCHAR(45) NOT NULL,
  `gender` VARCHAR(45) NOT NULL,
  `firstName` VARCHAR(45) NOT NULL,
  `lastName` VARCHAR(45) NOT NULL,
  `birthDate` DATE NULL DEFAULT NULL,
  `password` VARCHAR(45) NOT NULL,
  `phone` VARCHAR(45) NULL DEFAULT NULL,
  `imageurl` VARCHAR(1024) NULL DEFAULT NULL,
  `type` VARCHAR(45) NOT NULL,
  `address` VARCHAR(45) NULL DEFAULT NULL,
  `creditCard_number` BIGINT(20) NULL DEFAULT NULL,
  PRIMARY KEY (`email`),
  INDEX `fk_User_creditCard1_idx` (`creditCard_number` ASC),
  CONSTRAINT `fk_User_creditCard1`
    FOREIGN KEY (`creditCard_number`)
    REFERENCES `onlineshopping`.`creditcard` (`number`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `onlineshopping`.`orders`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `onlineshopping`.`orders` ;

CREATE TABLE IF NOT EXISTS `onlineshopping`.`orders` (
  `date` DATE NULL DEFAULT NULL,
  `status` INT(11) NULL DEFAULT '0',
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `User_email` VARCHAR(25) NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_order_User1_idx` (`User_email` ASC),
  CONSTRAINT `fk_order_User1`
    FOREIGN KEY (`User_email`)
    REFERENCES `onlineshopping`.`user` (`email`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `onlineshopping`.`products`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `onlineshopping`.`products` ;

CREATE TABLE IF NOT EXISTS `onlineshopping`.`products` (
  `product_id` INT(11) NOT NULL AUTO_INCREMENT,
  `productName` VARCHAR(45) NOT NULL,
  `price` DOUBLE NOT NULL,
  `quantity` INT(11) NOT NULL,
  `imageUrl` VARCHAR(1024) NOT NULL,
  `description` VARCHAR(500) NOT NULL,
  `discount` DOUBLE NULL DEFAULT NULL,
  `categoryName` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`product_id`),
  UNIQUE INDEX `productName_UNIQUE` (`productName` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `onlineshopping`.`orderdetails`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `onlineshopping`.`orderdetails` ;

CREATE TABLE IF NOT EXISTS `onlineshopping`.`orderdetails` (
  `products_product_id` INT(11) NOT NULL,
  `order_id` INT(11) NOT NULL,
  `price` DOUBLE NOT NULL,
  `quantity` INT(11) NOT NULL,
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  INDEX `fk_products_has_order_order1_idx` (`order_id` ASC),
  INDEX `fk_products_has_order_products1_idx` (`products_product_id` ASC),
  CONSTRAINT `fk_products_has_order_order1`
    FOREIGN KEY (`order_id`)
    REFERENCES `onlineshopping`.`orders` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_products_has_order_products1`
    FOREIGN KEY (`products_product_id`)
    REFERENCES `onlineshopping`.`products` (`product_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `onlineshopping`.`productimages`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `onlineshopping`.`productimages` ;

CREATE TABLE IF NOT EXISTS `onlineshopping`.`productimages` (
  `imageUrl` VARCHAR(800) NOT NULL,
  `products_product_id` INT(11) NOT NULL,
  PRIMARY KEY (`imageUrl`, `products_product_id`),
  INDEX `fk_productImages_products1_idx` (`products_product_id` ASC),
  CONSTRAINT `fk_productImages_products1`
    FOREIGN KEY (`products_product_id`)
    REFERENCES `onlineshopping`.`products` (`product_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `onlineshopping`.`productreviews`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `onlineshopping`.`productreviews` ;

CREATE TABLE IF NOT EXISTS `onlineshopping`.`productreviews` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `comment` VARCHAR(255) NULL DEFAULT NULL,
  `User_email` VARCHAR(25) NOT NULL,
  `products_product_id` INT(11) NOT NULL,
  PRIMARY KEY (`id`, `User_email`, `products_product_id`),
  INDEX `fk_productReviews_User1_idx` (`User_email` ASC),
  INDEX `fk_productReviews_products1_idx` (`products_product_id` ASC),
  CONSTRAINT `fk_productReviews_User1`
    FOREIGN KEY (`User_email`)
    REFERENCES `onlineshopping`.`user` (`email`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_productReviews_products1`
    FOREIGN KEY (`products_product_id`)
    REFERENCES `onlineshopping`.`products` (`product_id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `onlineshopping`.`rechargecards`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `onlineshopping`.`rechargecards` ;

CREATE TABLE IF NOT EXISTS `onlineshopping`.`rechargecards` (
  `number` INT(11) NOT NULL,
  `value` INT(11) NULL DEFAULT NULL,
  `status` VARCHAR(10) NULL DEFAULT NULL,
  PRIMARY KEY (`number`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
