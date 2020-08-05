-- noinspection SqlNoDataSourceInspectionForFile

CREATE TABLE books (
    id SERIAL PRIMARY KEY ,
    title VARCHAR(255),
    author VARCHAR(255),
    page_count INTEGER ,
    description TEXT,
    image_url VARCHAR(255),
    goodreads_url VARCHAR(255),
    isbn INTEGER ,
    genre VARCHAR(255)
);

CREATE TABLE challenges(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    description TEXT,
    creator_id INTEGER ,
    deadline_date TIMESTAMP ,
    started_date TIMESTAMP
);

CREATE TABLE users(
    id SERIAL PRIMARY KEY,
    nickname VARCHAR(255),
    description TEXT,
    role VARCHAR(255),
    avatar_image_url VARCHAR(255),
    joined_date TIMESTAMP
);

CREATE  TABLE reviews(
    id SERIAL PRIMARY KEY,
    review_title VARCHAR(255),
    review_text VARCHAR(255),
    reviewer_id INTEGER,
    review_score INTEGER ,
    book_id INTEGER ,
    created_date TIMESTAMP
);

CREATE TABLE completed_books(
    id SERIAL PRIMARY KEY,
    user_id INTEGER,
    book_id INTEGER,
    completed_date TIMESTAMP,
    CONSTRAINT book_id FOREIGN KEY(id) REFERENCES books(id),
    CONSTRAINT user_id FOREIGN KEY(id) REFERENCES users(id)
);

CREATE TABLE challenge_books(
    id SERIAL PRIMARY KEY,
    challenge_id INTEGER,
    book_id INTEGER
);

CREATE TABLE challenge_users(
    id SERIAL PRIMARY KEY,
    challenge_id INTEGER,
    user_id INTEGER,
    completed_date TIMESTAMP
);


