CREATE TABLE IF NOT EXISTS `Order` (
    `id`        UUID PRIMARY KEY,
    `time`      INTEGER NOT NULL,
    `beverage` VARCHAR(50) NOT NULL,
    `size` VARCHAR(50) NOT NULL,
    `sugar`        INTEGER  NOT NULL
);