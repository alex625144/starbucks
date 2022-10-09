CREATE TABLE IF NOT EXISTS `Order` (
    `id`         INTEGER  PRIMARY KEY AUTO_INCREMENT,
    `beverage` VARCHAR(50) NOT NULL,
    `size` VARCHAR(50) NOT NULL,
    `sugar`        INTEGER  NOT NULL
);