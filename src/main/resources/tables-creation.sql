CREATE TABLE IF NOT EXISTS ExpenseCategory (
    id LONG PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name VARCHAR(50) NOT NULL
);

CREATE TABLE IF NOT EXISTS Expense (
    id LONG PRIMARY KEY AUTO_INCREMENT NOT NULL,
    amount DOUBLE NOT NULL,
    category_id LONG NOT NULL,
    category_name VARCHAR(30) NOT NULL,
    date VARCHAR(20),
    FOREIGN KEY (category_id) REFERENCES ExpenseCategory(id)
);

/*INSERT INTO ExpenseCategory (name) VALUES ('Comida');
INSERT INTO ExpenseCategory (name) VALUES ('Transporte');
INSERT INTO ExpenseCategory (name) VALUES ('Servicios Públicos');
INSERT INTO ExpenseCategory (name) VALUES ('Entretenimiento');
INSERT INTO ExpenseCategory (name) VALUES ('Cuidado de la Salud');
INSERT INTO ExpenseCategory (name) VALUES ('Educación');
INSERT INTO ExpenseCategory (name) VALUES ('Ropa');
INSERT INTO ExpenseCategory (name) VALUES ('Vivienda');
INSERT INTO ExpenseCategory (name) VALUES ('Viajes');
INSERT INTO ExpenseCategory (name) VALUES ('Misceláneo');

INSERT INTO Expense (amount, category_id, category_name, date) VALUES (50.0, 1, 'Comida', '2023-12-01');
INSERT INTO Expense (amount, category_id, category_name, date) VALUES (20.0, 2, 'Transporte', '2023-12-02');
INSERT INTO Expense (amount, category_id, category_name, date) VALUES (100.0, 3, 'Servicios Públicos', '2023-12-03');
INSERT INTO Expense (amount, category_id, category_name, date) VALUES (30.0, 4, 'Entretenimiento', '2023-12-04');
INSERT INTO Expense (amount, category_id, category_name, date) VALUES (80.0, 5, 'Cuidado de la Salud', '2023-12-05');
INSERT INTO Expense (amount, category_id, category_name, date) VALUES (200.0, 6, 'Educación', '2023-12-06');
INSERT INTO Expense (amount, category_id, category_name, date) VALUES (40.0, 7, 'Ropa', '2023-12-07');
INSERT INTO Expense (amount, category_id, category_name, date) VALUES (150.0, 8, 'Vivienda', '2023-12-08');
INSERT INTO Expense (amount, category_id, category_name, date) VALUES (300.0, 9, 'Viajes', '2023-12-09');
INSERT INTO Expense (amount, category_id, category_name, date) VALUES (25.0, 10, 'Misceláneo', '2023-12-10');*/

