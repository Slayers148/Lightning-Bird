package com.devtraining.mission3.model;

        import lombok.Data;

        import javax.persistence.*;

@Entity
@Data
public class Game {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    @Column (nullable = true)
    private String name;

    @Column (nullable = true)
    private String publisher;
}