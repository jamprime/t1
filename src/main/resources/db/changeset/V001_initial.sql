CREATE TABLE cards
(
    id        UUID         NOT NULL,
    template  VARCHAR(128) NOT NULL,
    privilege VARCHAR(128) NOT NULL,
    CONSTRAINT pk_cards PRIMARY KEY (id)
);

CREATE TABLE users
(
    id           UUID                                NOT NULL,
    username     VARCHAR(128)                        NOT NULL,
    first_name   VARCHAR(64)                         NOT NULL,
    last_name    VARCHAR(64)                         NOT NULL,
    email        VARCHAR(64)                         NOT NULL,
    password     VARCHAR(64)                         NOT NULL,
    phone_number VARCHAR(128)                        NOT NULL,
    birthday     TIMESTAMP WITHOUT TIME ZONE         NOT NULL,
    role         VARCHAR(128) DEFAULT 'NOT_ASSIGNED' NOT NULL,
    privilege    VARCHAR(128) DEFAULT 'NOT_ASSIGNED' NOT NULL,
    is_locked    BOOLEAN      DEFAULT FALSE          NOT NULL,
    template     VARCHAR(128)                        NOT NULL,
    CONSTRAINT pk_users PRIMARY KEY (id)
);

ALTER TABLE users
    ADD CONSTRAINT uc_users_username UNIQUE (username);

CREATE UNIQUE INDEX users_username ON users (username);