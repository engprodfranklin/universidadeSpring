INSERT INTO tb_curso(nomecurso, duracaocurso, datapublicacao) VALUES ('ADS', 80, '10/05/2020');
INSERT INTO tb_curso(nomecurso, duracaocurso, datapublicacao) VALUES ('JAVA', 120, '04/02/2019');
INSERT INTO tb_curso(nomecurso, duracaocurso, datapublicacao) VALUES ('ADMINISTRAÇÃO', 200, '24/03/2018');

INSERT INTO tb_aluno(matricula, nome, dtnascimento, telefone, bairro, cep, fk_codigocurso) VALUES (111, 'Franklin', '01/11/1991', '(79) 98007107', 'Luzia', '49048-440', 1);
INSERT INTO tb_aluno(matricula, nome, dtnascimento, telefone, bairro, cep, fk_codigocurso) VALUES (222, 'Flávia', '12/01/1993', '(79) 98888888', 'Luzia', '49048-440', 1);
INSERT INTO tb_aluno(matricula, nome, dtnascimento, telefone, bairro, cep, fk_codigocurso) VALUES (333, 'Ewerton', '25/05/1975', '(79) 99999999', 'Atalaia', '49037-220', 3);
INSERT INTO tb_aluno(matricula, nome, dtnascimento, telefone, bairro, cep, fk_codigocurso) VALUES (444, 'Gil', '24/06/1991', '(79) 97777777', 'Atalaia', '49037-220', 2);
INSERT INTO tb_aluno(matricula, nome, dtnascimento, telefone, bairro, cep, fk_codigocurso) VALUES (555, 'Jorge', '08/10/1987', '(79) 96666666', 'Ponto', '49145-874', 3);