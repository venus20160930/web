create table users (
   user_id BIGINT primary key,
   password VARCHAR(100) NOT NULL,
   email VARCHAR(50) NOT NULL,
   state CHAR(1) NOT NULL,
   UNIQUE (email)
);

create table user_profile (
   user_id serial primary key,
   first_name VARCHAR(150) NOT NULL,
   last_name  VARCHAR(150) NOT NULL,
   phone VARCHAR(150) NOT NULL
);


create table roles (
   role_id serial primary key,
   name VARCHAR(30) NOT NULL,
   UNIQUE (name)
);


CREATE TABLE user_role (
    user_id BIGINT NOT NULL,
    role_id BIGINT NOT NULL,
    PRIMARY KEY (user_id, role_id),
    CONSTRAINT fk_users FOREIGN KEY (user_id) REFERENCES users (user_id),
    CONSTRAINT fk_roles FOREIGN KEY (role_id) REFERENCES roles (role_id)
);


create table users (
   user_id BIGINT primary key,
   password VARCHAR(100) NOT NULL,
   email VARCHAR(50) NOT NULL,
   state CHAR(1) NOT NULL,
   UNIQUE (email)
);

create table user_profile (
   user_id serial primary key,
   first_name VARCHAR(150) NOT NULL,
   last_name  VARCHAR(150) NOT NULL,
   phone VARCHAR(150) NOT NULL
);


create table roles (
   role_id serial primary key,
   name VARCHAR(30) NOT NULL,
   UNIQUE (name)
);


CREATE TABLE user_role (
    user_id BIGINT NOT NULL,
    role_id BIGINT NOT NULL,
    PRIMARY KEY (user_id, role_id),
    CONSTRAINT fk_users FOREIGN KEY (user_id) REFERENCES users (user_id),
    CONSTRAINT fk_roles FOREIGN KEY (role_id) REFERENCES roles (role_id)
);


create table user_connection (
   user_id BIGINT,
   provider_id VARCHAR(255) NOT NULL,
   provider_user_id  VARCHAR(255) NOT NULL,
   rank bigint NOT NULL,
   display_name VARCHAR(255) NOT NULL,
   profile_url VARCHAR(255) NOT NULL,
   image_url VARCHAR(255) NOT NULL,
   access_token VARCHAR(1024) NOT NULL,
   secret VARCHAR(255) NOT NULL,
   refresh_token VARCHAR(255) NOT NULL,
   expire_time bigint NOT NULL,
   PRIMARY KEY (user_id, provider_id, provider_user_id)
);

create table sample (
   sample_id BIGINT primary key,
   sample_name VARCHAR(255) NOT NULL,
   sample_age int
);

INSERT INTO roles(name) VALUES ('USER');
INSERT INTO roles(name) VALUES ('ADMIN');
