package me.rafael.animefodajava.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "seasons", schema = "anime")
public class Season {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "anime_id")
    private UUID anime_id;
    
    @Column(name = "index")
    private int index;
}
