INSERT INTO `users` (`username`,`password`,`role`,`enabled`)
VALUES ('admin',
'$2a$12$4iKFmlzDA60K/iH5ZBtmouAk7DR2KY4wAIPDhaLFBLQqkWSPWRwLa',
'ROLE_ADMIN', TRUE);

INSERT INTO `users` (`username`,`password`,`role`,`enabled`)
VALUES ('user',
'$2a$12$4iKFmlzDA60K/iH5ZBtmouAk7DR2KY4wAIPDhaLFBLQqkWSPWRwLa',
'ROLE_USER', TRUE);