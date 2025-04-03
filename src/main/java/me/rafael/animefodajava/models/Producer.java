package me.rafael.animefodajava.models;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "producers", schema = "anime")
public class Producer {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private final UUID id = UUID.randomUUID();

    @Column(name = "name")
    private final String name = null;

    @Column(name = "description", columnDefinition = "text")
    private final String description = null;

    public Producer() {}
}
