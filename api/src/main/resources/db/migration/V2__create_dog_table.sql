CREATE TABLE dogs (
    id SERIAL NOT NULL PRIMARY KEY,
    name TEXT,
    date_of_birth TIMESTAMP,
    breed_id INTEGER REFERENCES breeds (id)
);
