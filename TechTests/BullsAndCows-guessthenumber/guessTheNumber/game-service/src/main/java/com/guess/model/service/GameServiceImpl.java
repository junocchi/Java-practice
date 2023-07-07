package com.guess.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guess.dto.entity.Game;
import com.guess.model.persistence.GameDao;

@Service
public class GameServiceImpl implements GameService {
	
	@Autowired
	private GameDao gameDao;
	
	public int createGame(Game game) {
        game.setGameStatus("in-progress");
        return gameDao.createGame(game);
    }

    public Game getGameById(int gameId, boolean showAnswer) {
        Game game = gameDao.getGameById(gameId);
        if(showAnswer == false) {
        	if (game != null && game.getGameStatus().equals("in-progress")) {
        		game.setGameAnswer(0);
        	}}
        return game;
    }

    public List<Game> getAllGames() {
        List<Game> games = gameDao.getAllGames();
        for (Game game : games) {
            if (game.getGameStatus().equals("in-progress")) {
                game.setGameAnswer(0);
            }
        }
        return games;
    }

    public Game updateGame(Game game) {
        gameDao.updateGame(game);
        return gameDao.getGameById(game.getGameId());
    }
	

}
