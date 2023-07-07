package com.guess.model.persistence;

import java.util.List;
import com.guess.dto.entity.Game;

public interface GameDao {

	int createGame(Game game);
    Game getGameById(int gId);
    List<Game> getAllGames();
    void updateGame(Game game);
}
