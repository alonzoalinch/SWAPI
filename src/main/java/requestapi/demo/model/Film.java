package requestapi.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Film {
    private String title;
    @JsonProperty("episode_id")
    private Integer episodeId;
    @JsonProperty("opening_crawl")
    private String OpeningCrawl;
    private String director;
    private String producer;
    @JsonProperty("release_date")
    private Date releaseDate;
    private List<People> characters;
    private List<Planet> planets;
    private List<Starship> starships;
    private List<Vehicle> vehicles;
    private List<Specie> species;
    private String created;
    private String edited;
    private String url;

    public Film() {
    }

    public Film(String title, Integer episodeId, String openingCrawl, String director, String producer, Date releaseDate, List<People> characters, List<Planet> planets, List<Starship> starships, List<Vehicle> vehicles, List<Specie> species, String created, String edited, String url) {
        this.title = title;
        this.episodeId = episodeId;
        OpeningCrawl = openingCrawl;
        this.director = director;
        this.producer = producer;
        this.releaseDate = releaseDate;
        this.characters = characters;
        this.planets = planets;
        this.starships = starships;
        this.vehicles = vehicles;
        this.species = species;
        this.created = created;
        this.edited = edited;
        this.url = url;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", episodeId=" + episodeId +
                ", OpeningCrawl='" + OpeningCrawl + '\'' +
                ", director='" + director + '\'' +
                ", producer='" + producer + '\'' +
                ", releaseDate=" + releaseDate +
                ", characters=" + characters +
                ", planets=" + planets +
                ", starships=" + starships +
                ", vehicles=" + vehicles +
                ", species=" + species +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
