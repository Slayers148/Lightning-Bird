package com.devtraining.mission2.controller;

import com.devtraining.mission2.model.Game;
import com.devtraining.mission2.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping("/v1/gamesList")
    public List<Game> all_games(){
        return gameService.getAllGamesList();
    }
    @GetMapping("/v1/game/{id}")
    public Game getGame(@PathVariable("id") String id) {
        return gameService.getGame(id);
    }
    @PostMapping("/v1/addgame")
    public void addGames(@RequestBody Game game){
        gameService.addGame(game);
        }
    @PutMapping("/v1/updateGame/{id}")
    public void updateGame(@RequestBody Game game, @PathVariable("id") String id) {
        gameService.updateGame(game,id);
    }
    @DeleteMapping("/v1/deleteGame/{id}")
    public void deleteGame(@PathVariable("id") String id){
        gameService.deleteGame(id);
    }
}

