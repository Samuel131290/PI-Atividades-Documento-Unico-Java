CREATE DATABASE pi_atividades1;
USE pi_atividades1;
  
CREATE TABLE documentoUnico
  (
    Id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    Nome VARCHAR(100),
    Rg VARCHAR(9),
    Cpf VARCHAR(11),
    Titulo VARCHAR(12),
    Celular VARCHAR(12),
    Sexo VARCHAR(10),
    Endereco VARCHAR(50),
    Nº VARCHAR(4),
    Bairro VARCHAR(50),
    Cidade VARCHAR(40),
    Estado VARCHAR(2),
    Email VARCHAR(40),
    ConfirmarEmail VARCHAR(40),
    Senha VARCHAR(20),
    ConfirmarSenha VARCHAR(20),
    Data VARCHAR(10),
    DocumentoUnico VARCHAR(30)
  ); 


SELECT * FROM documentoUnico; -- Exibe a tabela 'documentoUnico'.
