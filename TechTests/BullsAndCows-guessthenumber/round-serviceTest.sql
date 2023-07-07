CREATE database wileydi004Test;
USE wileydi004Test;
USE wileydi004;
CREATE TABLE game (
  gameId INT AUTO_INCREMENT PRIMARY KEY,
  gameStatus VARCHAR(20) NOT NULL,
  gameAnswer VARCHAR(20) NOT NULL);

CREATE TABLE round (
  roundId INT AUTO_INCREMENT PRIMARY KEY,
  gameId INT NOT NULL,
  guess VARCHAR(20) NOT NULL,
  result VARCHAR(20) NOT NULL,
  timeOfGuess DATETIME NOT NULL,
  FOREIGN KEY (gameId) REFERENCES game (gameId));
  
  
  INSERT INTO game
  values(1, "Finished", "1234");
  
  INSERT INTO round
  values(1, 1, "4321", "e:0:p:4", CURRENT_TIMESTAMP);
  INSERT INTO round
  values(2, 1, "2134", "e:0:p:4", CURRENT_TIMESTAMP);
  INSERT INTO round
  values(3, 1, "1234", "e:0:p:4", CURRENT_TIMESTAMP);