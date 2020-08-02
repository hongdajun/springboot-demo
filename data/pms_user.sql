/*
Navicat MySQL Data Transfer



Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-07-07 09:42:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `pms_user`
-- ----------------------------
DROP TABLE IF EXISTS `pms_user`;
CREATE TABLE `pms_user` (
  `UUID` varchar(255) COLLATE utf8_bin NOT NULL,
  `USER_PASS` varchar(255) COLLATE utf8_bin NOT NULL DEFAULT '123',
  `REALNAME` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `USER_SEX` decimal(10,0) DEFAULT NULL,
  `USER_ORG` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `TELEPHONE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `MOBILE` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `EMAIL` varchar(255) COLLATE utf8_bin DEFAULT NULL,
  `STATUS` decimal(10,0) NOT NULL DEFAULT '1',
  `LAST_LOGIN_TIME` datetime DEFAULT NULL,
  `IS_SUPERMAN` decimal(10,0) NOT NULL DEFAULT '0',
  `POSITION` varchar(30) CHARACTER SET utf8 DEFAULT NULL,
  `IS_TEAMLEADER` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`UUID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of pms_user
-- ----------------------------
