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

    @GetMapping("/gamesList")
    public List<Game> all_games(){
        return gameService.getAllGamesList();
    }
    @GetMapping("/game/{id}")
    public Game getGame(@PathVariable("id") String id) {
        return gameService.getGame(id);
    }
    @PostMapping("/addgame")
    public void addGames(@RequestBody Game game){
        gameService.addGame(game);
        }
    @PutMapping("/updateGame/{id}")
    public void updateGame(@RequestBody Game game, @PathVariable("id") String id) {
        gameService.updateGame(game,id);
    }
    @DeleteMapping("/deleteGame/{id}")
    public void deleteGame(@PathVariable("id") String id){
        gameService.deleteGame(id);
    }
}

