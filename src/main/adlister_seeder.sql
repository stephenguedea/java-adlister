USE adlister_db;

select * from users;

INSERT INTO users (username, email, password) values ('sguedea', 'sguedea@email.com', 'ironmansucks'),
('lizb', 'liz@email.com', 'bosslady'),
('cindy', 'cindy@email.com', 'cincity'),
('justin', 'justin@email.com', 'jay5');

INSERT INTO ads (title, user_id, description) VALUES
  ('Toyota Corolla For Sale', 1, 'It runs'),
  ('MacBook Pro For Sale', 1, 'It does not run'),
  ('Cat For Sale', 1, 'He runs a lot');


