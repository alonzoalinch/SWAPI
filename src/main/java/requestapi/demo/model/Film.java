package requestapi.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.Date;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
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
    private List<String> characters;
    private List<String> planets;
    private List<String> starships;
    private List<String> vehicles;
    private List<String> species;
    private String created;
    private String edited;
    private String url;
}
