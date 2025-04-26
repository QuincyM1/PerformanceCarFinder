DELETE FROM modifications;
DELETE FROM cars;

INSERT INTO cars (id, make, model, year, horsepower, drivetrain, price) VALUES
(1, 'BMW', 'M340i', 2022, 382, 'AWD', 58000.00),
(2, 'Nissan', 'GT-R', 2021, 565, 'AWD', 113540.00);

INSERT INTO modifications (id, type, brand, power_gain, cost, car_id) VALUES
(1, 'Exhaust', 'Akrapovic', 15, 3200.00, 1),
(2, 'Tune', 'Cobb', 40, 1200.00, 1),
(3, 'Turbo Upgrade', 'HKS', 100, 7000.00, 2);
