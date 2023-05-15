/*CREATE DATABASE es;*/
CREATE TABLE IF NOT EXISTS  clienti(
	numerocliente INT NOT NULL PRIMARY KEY,
	nome VARCHAR NOT NULL,
	datadinascita VARCHAR NOT NULL,
	regioneresidenza VARCHAR NOT NULL
);

CREATE TABLE IF NOT EXISTS fatture(
	numerofattura INT NOT NULL PRIMARY KEY,
	tipologia VARCHAR NOT NULL,
	importo NUMERIC NOT NULL,
	iva INT NOT NULL,
	idcliente VARCHAR NOT NULL,
	datafattura INT NOT NULL,
	numerofornitore VARCHAR NOT NULL
);


CREATE TABLE IF NOT EXISTS prodotti(
	idprodotto INT NOT NULL PRIMARY KEY,
	descrizione VARCHAR NOT NULL,
	inproduzione BOOLEAN  NOT NULL,
	incommercio BOOLEAN	NOT NULL,
	dataattivazione INT NOT NULL,
	datadisattivazione INT NOT NULL
);

CREATE TABLE IF NOT EXISTS fornitori(
	numerofornitore INT NOT NULL PRIMARY KEY,
	denominazione VARCHAR NOT NULL,
	regioneresidenza VARCHAR NOT NULL
);

INSERT INTO clienti (nome,datadinascita,regioneresidenza) VALUES ('Davide','270702','sicilia');