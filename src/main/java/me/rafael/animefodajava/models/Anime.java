package me.rafael.animefodajava.models;

import jakarta.persistence.*;
import me.rafael.animefodajava.enums.Language;
import me.rafael.animefodajava.enums.State;
import me.rafael.animefodajava.enums.Weekday;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.util.*;

@Entity
@Table(name = "anime", schema = "anime")
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id")
    private  UUID id = UUID.randomUUID();

    @Column(name = "averageeptime")
    private  double averageEptime = 0;

    @Column(name = "date_added")
    private  OffsetDateTime dateAdded = OffsetDateTime.now();

    @Column(name = "description")
    private  String description = "";

    @JdbcTypeCode(SqlTypes.ARRAY)
    @Column(name = "genre")
    private  List<String> genre = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    @Column(name = "language")
    private  Language language = Language.Legendado;

    @Column(name = "malid")
    private  Integer malid = null;

    @Column(name = "name")
    private  String name = "";

    @Column(name = "name2")
    private  String name2 = "";

    @Column(name = "rating")
    private  Double rating = null;

    @Column(name = "visible")
    private  Boolean visible = false;

    @Enumerated(EnumType.STRING)
    @Column(name = "weekday")
    private  Weekday weekday = null;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
//    @JoinTable(
//        name = "anime_producers",
//        schema = "anime",
//        joinColumns = @JoinColumn(name = "anime_id"),
//        inverseJoinColumns = @JoinColumn(name = "producer_id")
//    )
    private  Set<Producer> producers = new HashSet<>();

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinTable(
//            name = "anime_creators",
//            schema = "anime",
//            joinColumns = @JoinColumn(name = "anime_id"),
//            inverseJoinColumns = @JoinColumn(name = "creator_id")
//    )
    private  Set<Creator> creators = new HashSet<>();
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
//    @JoinTable(
//            name = "anime_studios",
//            schema = "anime",
//            joinColumns = @JoinColumn(name = "anime_id"),
//            inverseJoinColumns = @JoinColumn(name = "studio_id")
//    )
    private Set<Studio> studios = new HashSet<>();
    
    @Enumerated(EnumType.STRING)
    @Column(name = "state")
    private State state = null;
    
    @Column(name = "releasedate")
    private LocalTime releaseDate = null;
    
    @OneToMany(mappedBy = "anime_id", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Season> seasons = new ArrayList<>();
}
