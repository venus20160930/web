create table user_connection (
   user_id,
   provider_id Varchar(255) NOT NULL,
   provider_user_id  VARCHAR(255) NOT NULL,
   rank bigint NOT NULL,
   display_name VARCHAR(255) NOT NULL,
   profile_url VARCHAR(255) NOT NULL,
   image_url VARCHAR(255) NOT NULL,
   access_token VARCHAR(1024) NOT NULL,
   secret VARCHAR(255) NOT NULL,
   refresh_token VARCHAR(255) NOT NULL,
   expire_time bigint NOT NULL
   PRIMARY KEY (user_id, provider_id, provider_user_id)
);