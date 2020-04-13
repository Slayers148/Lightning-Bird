package com.devtraining.mission2.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Game {

    private String id;
    private String name;
    private String description;
}