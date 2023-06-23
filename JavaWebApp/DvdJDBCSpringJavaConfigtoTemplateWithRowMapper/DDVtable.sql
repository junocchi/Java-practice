-- DVD Table stores following information
-- Title
-- MPAA rating
-- Director's name
-- Studio
-- User rating

USE wileydi004;
DROP TABLE DVD;

CREATE TABLE DVD(
DvdID INT AUTO_INCREMENT,
Title VARCHAR(30),
MPAArating INT,
DirectorName VARCHAR(30),
Studio VARCHAR(30),
UserRating INT,
CONSTRAINT PK_DVD PRIMARY KEY (DvdID));

INSERT INTO DVD (Title, MPAArating, DirectorName, Studio, UserRating) VALUES
("The Shawshank Redemption", 4, "Frank Darabont", "Columbia Pictures", 9),
("The Godfather", 5, "Francis Ford Coppola", "Paramount Pictures", 9),
("Pulp Fiction", 4, "Quentin Tarantino", "Miramax Films", 8),
("The Dark Knight", 5, "Christopher Nolan", "Warner Bros.", 9),
("Fight Club", 5, "David Fincher", "20th Century Fox", 8),
("Inception", 4, "Christopher Nolan", "Warner Bros.", 9),
("The Matrix", 4, "Lana Wachowski", "Warner Bros.", 8),
("The Lord of the Rings One", 4, "Peter Jackson", "New Line Cinema", 9),
("Forrest Gump", 4, "Robert Zemeckis", "Paramount Pictures", 9),
("The Avengers", 3, "Joss Whedon", "Marvel Studios", 8);

SELECT * FROM DVD;




