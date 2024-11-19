CREATE DATABASE cadastro2;
USE cadastro2;

CREATE TABLE pessoa (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100)
);

DELIMITER //

CREATE PROCEDURE cadastrar_pessoa(IN p_nome VARCHAR(100), IN p_email VARCHAR(100))
BEGIN
    INSERT INTO pessoa (nome, email) 
    VALUES (p_nome, p_email);
END //

DELIMITER ;


select * from pessoa;
