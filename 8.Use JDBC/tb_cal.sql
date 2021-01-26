CREATE TABLE tb_cal (
   no  int NOT NULL,
   op1  int NOT NULL,
   op  varchar(10) NOT NULL,
   op2  int NOT NULL,
   result  int NOT NULL
);
ALTER TABLE tb_cal ADD PRIMARY KEY (no);

CREATE SEQUENCE seq_cal;

select * from tb_cal;

drop table tb_cal;
drop SEQUENCE seq_cal;