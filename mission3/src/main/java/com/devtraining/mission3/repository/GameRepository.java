package com.devtraining.mission2.repository;

import com.devtraining.mission3.model.Game;


import java.util.List;

public interface GameRepository{

    List<Game> getAllGames();

    Game getGame(String id);

    void addGame(Game game);

    void updateGame(Game game);

    void deleteGame(String id);
}
