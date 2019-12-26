/*
 Navicat Premium Data Transfer

 Source Server         : localhost_3306
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 22/12/2019 18:04:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sysuser
-- ----------------------------
DROP TABLE IF EXISTS `sysuser`;
CREATE TABLE `sysuser`  (
  `id` int(11) NOT NULL,
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `userpassword` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sysuser
-- ----------------------------
INSERT INTO `sysuser` VALUES (1, '123', '2');
INSERT INTO `sysuser` VALUES (2, '13', '12354');
INSERT INTO `sysuser` VALUES (3, '1823', '12354');
INSERT INTO `sysuser` VALUES (4, '1923', '12354');
INSERT INTO `sysuser` VALUES (5, 'user2', 'user12');
INSERT INTO `sysuser` VALUES (6, 'po2', 'pok');
INSERT INTO `sysuser` VALUES (7, '123456', '123456');
INSERT INTO `sysuser` VALUES (8, '5656', '5656');
INSERT INTO `sysuser` VALUES (9, 'user', 'user');
INSERT INTO `sysuser` VALUES (10, 'user4', 'user4');
INSERT INTO `sysuser` VALUES (11, 'po', 'pok');
INSERT INTO `sysuser` VALUES (12, '1293', '123');

SET FOREIGN_KEY_CHECKS = 1;
