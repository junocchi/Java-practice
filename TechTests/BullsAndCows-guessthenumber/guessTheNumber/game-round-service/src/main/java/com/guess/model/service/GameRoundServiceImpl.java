package com.guess.model.service;

import java.time.LocalDateTime;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.guess.dto.entity.Game;
import com.guess.dto.entity.GameRound;
import com.guess.dto.entity.Round;
import com.guess.dto.entity.RoundList;

@Service
public class GameRoundServiceImpl implements GameRoundService {

	@Autowired
	private RestTemplate restTemplate; // any rest api can be called with RestTemplate

	@Override
	public List<GameRound> getGameRoundByGameId(int gameId) {

		List<GameRound> gameRounds = new ArrayList<GameRound>();

		// Call Round and get the List of : roundId, guess, result and gameId
		RoundList roundList = restTemplate.getForObject("http://localhost:6061/rounds/" + gameId, RoundList.class);

		for (Round round : roundList.getRounds()) {
			// For each gameId call game-service, which will return gameId, gameStatus and
			// gameAnswer
			Game game = restTemplate.getForObject("http://localhost:6060/games" + round.getGameId(), Game.class);
		}
		return gameRounds;
	}

	@Override
	public List<GameRound> getGameRoundByRoundId(String roundId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Round makeGuess(int gameId, int guess) {

		// Getting answer from game-service

		Game game = restTemplate.getForObject("http://localhost:6060/game/" + gameId + "/?showAnswer=true", Game.class);

		String result = getResult(game, Integer.toString(guess));

		Round round = new Round();
		round.setGuess(guess);
		round.setResult(result);
		round.setGameId(gameId);
		round.setTimeOfGuess(LocalDateTime.now());

		if (result.equals("e:4:p:0")) {

			game.setGameStatus("Finished");

			// Using game-service to update the current game to finished

			restTemplate.put("http://localhost:6060/updategame/" + gameId, game);
		}

		round = restTemplate.postForObject("http://localhost:6061/newround", round, Round.class);

		return round;
	}

	// Method to calculate the result, called by makeGuess()
	@Override
	public String getResult(Game game, String guess) {

		String answer = Integer.toString(game.getGameAnswer());

		int e = 0;
		int p = 0;

		for (int i = 0; i < guess.length(); i++) {
			char guessChar = guess.charAt(i);
			if (guessChar == answer.charAt(i)) {
				e++;
			} else if (answer.contains(Character.toString(guessChar))) {
				p++;
			}
		}

		return "e:" + e + ":p:" + p;
	}

}
