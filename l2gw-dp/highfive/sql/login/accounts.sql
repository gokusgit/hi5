CREATE TABLE IF NOT EXISTS `accounts` (
  `account_id` int(11) NOT NULL AUTO_INCREMENT,
  `login` varchar(45) NOT NULL DEFAULT '',
  `password` varchar(45) DEFAULT '',
  `lastactive` int(15) unsigned NOT NULL DEFAULT '0',
  `access_level` tinyint(6) NOT NULL DEFAULT '0',
  `lastIP` varchar(15) DEFAULT '',
  `lastServer` int(4) DEFAULT '1',
  `comments` text,
  `email` varchar(45) NOT NULL DEFAULT 'null@null',
  `pay_stat` tinyint(1) NOT NULL DEFAULT '1',
  `premiumEndDate` int(15) unsigned NOT NULL DEFAULT '0',
  `banExpires` int(11) NOT NULL DEFAULT '0',
  `AllowIPs` varchar(255) NOT NULL DEFAULT '*',
  `altIp` int(11) NOT NULL DEFAULT '0',
  `temp_password` tinyint NOT NULL DEFAULT 0,
  `update_password` int(15) unsigned NOT NULL default '0',
	`second_use` TINYINT(1) NOT NULL DEFAULT '1',
	`second_password` VARCHAR(32) NOT NULL DEFAULT '',
	`second_fail` INT(10) NOT NULL DEFAULT '0',
  PRIMARY KEY (`account_id`),
  UNIQUE KEY `login` (`login`),
  KEY `access_level` (`access_level`),
  KEY `pay_stat` (`pay_stat`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;