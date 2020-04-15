CREATE TABLE books (
    id SERIAL PRIMARY KEY ,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    page_count VARCHAR(255),
    description TEXT,
    image_url VARCHAR(255),
    goodreads_url VARCHAR(255)

)