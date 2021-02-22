CREATE TABLE tb_cal (
   no  int NOT NULL,
   op1  varchar(15) NOT NULL,
   op  varchar(15) NOT NULL,
   op2  varchar(15) NOT NULL,
   result  varchar(15) NOT NULL
);
ALTER TABLE tb_cal ADD PRIMARY KEY (no);
CREATE SEQUENCE seq_log;

select * from tb_cal;