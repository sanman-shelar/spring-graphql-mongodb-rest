DROP TABLE IF EXISTS person;
DROP TABLE IF EXISTS address;

create TABLE person (
  pid int NOT NULL PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  age int NOT NULL
);

CREATE TABLE address (
  pid int NOT NULL PRIMARY KEY,
  city VARCHAR(255) NOT NULL,
  state VARCHAR(255) NOT NULL
);

INSERT INTO person (pid, name, age) VALUES
  ('100', 'John', 34),
  ('101', 'Sam', 52);

INSERT INTO address (pid, city, state) VALUES
  ('100', 'Orange', 'CA'),
  ('101', 'Corbin City', 'NJ');