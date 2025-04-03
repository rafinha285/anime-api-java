package me.rafael.animefodajava.repositories;

import me.rafael.animefodajava.models.Anime;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AnimeRepository extends JpaRepository<Anime, UUID> {
}
