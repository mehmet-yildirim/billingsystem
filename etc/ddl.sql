CREATE TABLE faturalar
(
    fatura_id INT(11) PRIMARY KEY NOT NULL,
    abone_no VARCHAR(32) NOT NULL,
    fatura_donemi VARCHAR(6) NOT NULL,
    tutar DOUBLE NOT NULL,
    odendi INT(1) DEFAULT '0' NOT NULL
);