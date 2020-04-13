package com.devtraining.mission2.service;

import com.devtraining.mission2.model.Game;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GameService {

    private List<Game> gameList = new ArrayList<>(Arrays.asList(

            new Game("1", "ff7", "sqex"),
            new Game("2", "ff8", "sqex"),
            new Game("3", "ff9", "sqex")

    ));

    public List<Game> getAllGamesList(){
        return gameList;
    }
    public Game getGame(String id){
        return gameList.stream().filter(topic -> topic.getId().equals(id)).findFirst().get();
    }
    public void addGame(Game game){
        gameList.add(game);
    }
    public void updateGame(Game game, String id){
        int counter = 0;
        for (Game game1 : gameList){
            if(game1.getId().equals(id)){
                gameList.set(counter, game);
            }
            counter++;
        }
    }
    public void deleteGame(String id){
        gameList.removeIf(game -> game.getId().equals(id));
    }
}