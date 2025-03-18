-- Create the tags table
CREATE TABLE tags
(
    id   int auto_increment primary key,
    name varchar(255) NOT NULL

);

-- Create the user_tags join table
CREATE TABLE user_tags
(
    user_id BIGINT NOT NULL,
    tag_id  INT    NOT NULL,
    PRIMARY KEY (user_id, tag_id),
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE,
    FOREIGN KEY (tag_id) REFERENCES tags (id) ON DELETE CASCADE

);