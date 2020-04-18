CREATE TABLE books (
    id SERIAL PRIMARY KEY ,
    title VARCHAR(255),
    author VARCHAR(255),
    page_count VARCHAR(255),
    description TEXT,
    image_url VARCHAR(255),
    goodreads_url VARCHAR(255),
    isbn VARCHAR(255)

);

CREATE TABLE challenges(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    description TEXT,
    book_ids VARCHAR(255),
    user_ids VARCHAR(255),
    creator_id VARCHAR(255)
);

CREATE TABLE users(
    id SERIAL PRIMARY KEY,
    nickname VARCHAR(255),
    description TEXT,
    role VARCHAR(255),
    created_challenges_ids VARCHAR(255),
    member_of_challenges_ids VARCHAR(255)
);