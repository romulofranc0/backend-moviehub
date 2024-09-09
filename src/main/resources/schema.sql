CREATE TABLE IF NOT EXISTS mh_list (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    user_id UUID NOT NULL
);

CREATE TABLE IF NOT EXISTS mh_review (
    review_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    creation_datetime TIMESTAMP,
    user_id UUID NOT NULL,
    score DOUBLE,
    review_title VARCHAR(255),
    review_body TEXT
);

CREATE TABLE IF NOT EXISTS mh_roles (
    role_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS mh_users (
    user_id UUID PRIMARY KEY,
    username VARCHAR(255) UNIQUE,
    password VARCHAR(255)
);

CREATE TABLE IF NOT EXISTS mh_users_roles (
    user_id UUID,
    role_id BIGINT,
    PRIMARY KEY (user_id, role_id),
    FOREIGN KEY (user_id) REFERENCES mh_users(user_id),
    FOREIGN KEY (role_id) REFERENCES mh_roles(role_id)
);

CREATE TABLE IF NOT EXISTS mh_list_movie_ids (
    list_id BIGINT,
    movie_id VARCHAR(255),
    FOREIGN KEY (list_id) REFERENCES mh_list(id)
);