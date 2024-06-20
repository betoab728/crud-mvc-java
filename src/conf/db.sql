-- Crear la base de datos
CREATE DATABASE IF NOT EXISTS PersonasDB;

-- Usar la base de datos
USE PersonasDB;

-- Crear la tabla Persona
CREATE TABLE IF NOT EXISTS Persona (
    Id INT AUTO_INCREMENT PRIMARY KEY,
    DNI VARCHAR(20) NOT NULL,
    Nombres VARCHAR(100) NOT NULL
);
