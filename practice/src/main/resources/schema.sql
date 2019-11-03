DROP TABLE IF EXISTS coffee;

CREATE TABLE coffee (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  cost INT
);

INSERT INTO coffee (name, cost) VALUES
  ('아메리카노', 500),
  ('라떼', 700),
  ('카푸치노', 900);