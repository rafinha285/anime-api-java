package me.rafael.animefodajava.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "studios", schema = "anime")
public class Studio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private UUID id;
    
    @Column(name = "name")
    private String name;
    
    @Column(name = "description")
    private String description;
}
