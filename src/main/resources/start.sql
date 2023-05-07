CREATE SCHEMA M4L11;

-- devices
CREATE TABLE clients (
                         id INTEGER PRIMARY KEY AUTO_INCREMENT,
                         first_name VARCHAR(50) DEFAULT NULL,
                         last_name VARCHAR(50) DEFAULT NULL
);

-- ports
CREATE TABLE accounts (
                       id INTEGER PRIMARY KEY AUTO_INCREMENT,
                       client_id INTEGER,
                       value DOUBLE,
                       currency VARCHAR(3)
);


INSERT INTO clients (first_name, last_name)
VALUES
    ('Macaulay', 'Culkin'),
    ('Joe', 'Pesci'),
    ('Daniel', 'Stern'),
    ('Catherine', 'O\'Hara');

INSERT INTO accounts (client_id, value, currency)
VALUES
    (1, 555.55, 'USD') ,
    (2, 0.98, 'USD') ,
    (3, 2.34, 'USD') ,
    (4, 9891.77, 'USD');

DROP TABLE clients;