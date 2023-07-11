USE wileydi004;
DROP TABLE CustomerShareDetails;

CREATE TABLE CustomerShareDetails(
DetailsId INT,
CustomerId INT,
ShareId INT, 
ShareType VARCHAR(30),
Quantity DOUBLE,
CONSTRAINT PK_DetailsId PRIMARY KEY (ShareId)
);

INSERT INTO CustomerShareDetails (DetailsId, CustomerId, ShareId, ShareType, Quantity) VALUES
(101, 1, 1001, 'A', 10.5),
(102, 2, 1002, 'B', 5.2),
(103, 3, 1003, 'C', 8.7),
(104, 4, 1004, 'D', 15.9),
(105, 5, 1005, 'E', 20.3),
(106, 6, 1006, 'F', 12.1),
(107, 7, 1007, 'G', 3.8);

SELECT * FROM CustomerShareDetails;