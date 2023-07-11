USE wileydi004;

DROP TABLE ShareService;

CREATE TABLE ShareService(
ShareId INT AUTO_INCREMENT,
ShareName VARCHAR(30),
MarketPrice DOUBLE,
CONSTRAINT PK_ShareId PRIMARY KEY (ShareId));

INSERT INTO ShareService (ShareId, ShareName, MarketPrice) VALUES
(1, 'Apple', 150.75),
(2, 'Microsoft', 300.50),
(3, 'Amazon', 3500.25),
(4, 'Google', 2500.80),
(5, 'Facebook', 350.50),
(6, 'Tesla', 750.10),
(7, 'Netflix', 550.75),
(8, 'Alphabet', 2750.60);

SELECT * FROM ShareService;