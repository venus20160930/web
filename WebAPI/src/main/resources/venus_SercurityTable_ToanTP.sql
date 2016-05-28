﻿Create table VENUS_ROLE (
   ROLE_ID serial,
   ROLE_NAME VARCHAR(50) NOT NULL,
   CREATE_USER_ID INT,
    CREATE_DATE VARCHAR(10),
    LAST_MODIFIED_USER_ID INT,
    LAST_MODIFIED_DATE VARCHAR(10),
   UNIQUE (ROLE_NAME),
   PRIMARY KEY (ROLE_ID)
);
   
Create table VENUS_USER (
   USER_ID serial,
   DISPLAY_NAME VARCHAR(20),
   FULL_NAME VARCHAR(50) NOT NULL,
   EMAIL VARCHAR(50) NOT NULL,
   SEX INT,
   ADDRESS VARCHAR(200),
   PHONE_NUMBER VARCHAR(11),
   AVATAR_PATH VARCHAR(200),
   PASSWORD VARCHAR(100) NOT NULL,
   PASSWORD_EXPIRED_DATE VARCHAR(10),
   LAST_LOGIN_DATE varchar(10),
   NUMBER_TRY_LOGIN INT,
   IS_ACTIVED INT,
   IS_LOCKED INT,
   IS_DELETED INT,
   CREATE_USER_ID INT,
   CREATE_DATE VARCHAR(10),
   LAST_MODIFIED_USER_ID INT,
   LAST_MODIFIED_DATE VARCHAR(10),
   UNIQUE(EMAIL),
   PRIMARY KEY (USER_ID)
);

CREATE TABLE VENUS_USER_ROLE (
    USER_ID BIGINT NOT NULL,
    ROLE_ID BIGINT NOT NULL,
    CREATE_USER_ID INT,
    CREATE_DATE VARCHAR(10),
    LAST_MODIFIED_USER_ID INT,
    LAST_MODIFIED_DATE VARCHAR(10),
    PRIMARY KEY (USER_ID, ROLE_ID)
);

INSERT INTO VENUS_ROLE(ROLE_NAME) VALUES ('USER');
INSERT INTO VENUS_ROLE(ROLE_NAME) VALUES ('ADMIN');
