CREATE TABLE IF NOT EXISTS feedback
(
    id       BIGINT AUTO_INCREMENT NOT NULL,
    feedback TEXT                  NULL,
    email    VARCHAR(255)          NULL,
    name     VARCHAR(255)          NULL,
    phone    VARCHAR(255)          NULL,
    created  datetime              NULL,
    CONSTRAINT pk_feedback PRIMARY KEY (id)
);