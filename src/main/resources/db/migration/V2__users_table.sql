CREATE TABLE `users` (
    `user_id` BIGSERIAL PRIMARY KEY,
    `username` VARCHAR(45) NOT NULL,
    `password` VARCHAR(64) NOT NULL,
    `role` VARCHAR(45) NOT NULL,
    `enabled` BOOLEAN DEFAULT TRUE
);
