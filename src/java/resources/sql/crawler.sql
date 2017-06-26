/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50713
Source Host           : localhost:3306
Source Database       : crawler

Target Server Type    : MYSQL
Target Server Version : 50713
File Encoding         : 65001

Date: 2017-06-22 15:14:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for song
-- ----------------------------
DROP TABLE IF EXISTS `song`;
CREATE TABLE `song` (
  `url` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `title` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `comment_count` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`url`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

-- ----------------------------
-- Table structure for webpage
-- ----------------------------
DROP TABLE IF EXISTS `webpage`;
CREATE TABLE `webpage` (
  `url` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `title` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `type` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `status` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `html` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`url`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;
SET FOREIGN_KEY_CHECKS=1;
