/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50628
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50628
File Encoding         : 65001

Date: 2018-08-18 16:35:18
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for example
-- ----------------------------
DROP TABLE IF EXISTS `example`;
CREATE TABLE `example` (
  `id` varchar(32) NOT NULL,
  `test_name` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of example
-- ----------------------------
INSERT INTO `example` VALUES ('1', '123');
INSERT INTO `example` VALUES ('10', '2351235');
INSERT INTO `example` VALUES ('2', '123');
INSERT INTO `example` VALUES ('3', '33456');
INSERT INTO `example` VALUES ('4', '4444421');
INSERT INTO `example` VALUES ('5', '2134234');
INSERT INTO `example` VALUES ('6', '2341234');
INSERT INTO `example` VALUES ('7', '23143');
INSERT INTO `example` VALUES ('8', '1234');
INSERT INTO `example` VALUES ('9', '1351325');
