CREATE TABLE IF NOT EXISTS employee(
   id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
   name VARCHAR(100) NOT NULL,
   email VARCHAR(40) NOT NULL,
   age NUMERIC NOT NULL,
   payload VARCHAR(255) NOT NULL,
   date_of_birth DATE  
);