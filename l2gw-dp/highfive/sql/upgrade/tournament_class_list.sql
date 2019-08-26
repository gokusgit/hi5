DROP TABLE IF EXISTS `tournament_class_list`;
CREATE TABLE `tournament_class_list` (
  `class_name` varchar(19) NOT NULL default '',
  `class_id` int(10) unsigned NOT NULL default '0',
  `type` int(11) NOT NULL default '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `tournament_class_list` VALUES
('Fighter',0,1),
('Warrior',1,1),
('Gladiator',2,1),
('Duelist',88,1),
('Warlord',3,1),
('Dreadnought',89,1),
('Knight',4,1),
('Paladin',5,1),
('PhoenixKnight',90,1),
('DarkAvenger',6,1),
('HellKnight',91,1),
('Rogue',7,1),
('TreasureHunter',8,1),
('Adventurer',93,1),
('Hawkeye',9,1),
('Sagittarius',92,1),
('Mage',10,2),
('Wizard',11,2),
('Sorceror',12,2),
('Archmage',94,2),
('Necromancer',13,2),
('Soultaker',95,2),
('Warlock',14,2),
('ArcanaLord',96,2),
('Cleric',15,3),
('Bishop',16,3),
('Cardinal',97,3),
('Prophet',17,3),
('Hierophant',98,3),
('Fighter',18,1),
('Knight',19,1),
('TempleKnight',20,1),
('EvaTemplar',99,1),
('SwordSinger',21,3),
('SwordMuse',100,3),
('Scout',22,1),
('PlainsWalker',23,1),
('WindRider',101,1),
('SilverRanger',24,1),
('MoonlightSentinel',102,1),
('Mage',25,2),
('Wizard',26,2),
('SpellSinger',27,2),
('MysticMuse',103,2),
('ElementalSummoner',28,2),
('ElementalMaster',104,2),
('Oracle',29,3),
('Elder',30,3),
('EvaSaint',105,3),
('Fighter',31,1),
('PaulusKnight',32,1),
('ShillienKnight',33,1),
('ShillienTemplar',106,1),
('BladeDancer',34,3),
('SpectralDancer',107,3),
('Assassin',35,1),
('AbyssWalker',36,1),
('GhostHunter',108,1),
('PhantomRanger',37,1),
('GhostSentinel',109,1),
('Mage',38,2),
('DarkWizard',39,2),
('Spellhowler',40,2),
('StormScreamer',110,2),
('PhantomSummoner',41,2),
('SpectralMaster',111,2),
('ShillienOracle',42,3),
('ShillienElder',43,3),
('ShillienSaint',112,3),
('Fighter',44,1),
('Raider',45,1),
('Destroyer',46,1),
('Titan',113,1),
('Monk',47,1),
('Tyrant',48,1),
('GrandKhauatari',114,1),
('Mage',49,2),
('Shaman',50,3),
('Overlord',51,3),
('Dominator',115,3),
('Warcryer',52,3),
('Doomcryer',116,3),
('Fighter',53,1),
('Scavenger',54,1),
('BountyHunter',55,1),
('FortuneSeeker',117,1),
('Artisan',56,1),
('Warsmith',57,1),
('Maestro',118,1),
('SoldierM',123,3),
('SoldierF',124,3),
('Trooper',125,3),
('Warder',126,3),
('Berserker',127,3),
('SoulbreakerM',128,3),
('SoulbreakerF',129,3),
('Arbalester',130,3),
('Doombringer',131,3),
('SoulhoundM',132,3),
('SoulhoundF',133,3),
('Trickster',134,3),
('Inspector',135,3),
('Judicator',136,3);