ALTER TABLE users
Drop PRIMARY KEY,
CHANGE COLUMN username username VARCHAR(30) NOT NULL UNIQUE,
ADD PRIMARY KEY (id);