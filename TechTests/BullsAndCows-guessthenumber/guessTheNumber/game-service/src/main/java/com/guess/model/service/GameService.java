package com.guess.model.service;

import java.util.List;

import com.guess.dto.entity.Game;

public interface GameService {

	int createGame(Game game);
    Game getGameById(int gId, boolean showAnswer);
    List<Game> getAllGames();
    Game updateGame(Game game);

}
