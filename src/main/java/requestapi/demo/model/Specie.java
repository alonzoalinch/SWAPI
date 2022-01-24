package requestapi.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Specie {
    private String name;
    private String classification;
    private String designation;
    @JsonProperty("average_height")
    private String averageHeight;
    @JsonProperty("average_lifespan")
    private String averageLifespan;
    @JsonProperty("eye_colors")
    private String eyeColors;
    @JsonProperty("hair_colors")
    private String hairColors;
    @JsonProperty("skin_colors")
    private String skinColors;
    private String language;
    private String homeworld;
    private List<People> people;
    private List<Film> films;
    private String url;
    private String created;
    private String edited;

    private Specie() {

    }

    public Specie(String name, String classification, String designation, String averageHeight, String averageLifespan, String eyeColors, String hairColors, String skinColors, String language, String homeworld, List<People> people, List<Film> films, String url, String created, String edited) {
        this.name = name;
        this.classification = classification;
        this.designation = designation;
        this.averageHeight = averageHeight;
        this.averageLifespan = averageLifespan;
        this.eyeColors = eyeColors;
        this.hairColors = hairColors;
        this.skinColors = skinColors;
        this.language = language;
        this.homeworld = homeworld;
        this.people = people;
        this.films = films;
        this.url = url;
        this.created = created;
        this.edited = edited;
    }

    @Override
    public String toString() {
        return "Specie{" +
                "name='" + name + '\'' +
                ", classification='" + classification + '\'' +
                ", designation='" + designation + '\'' +
                ", averageHeight='" + averageHeight + '\'' +
                ", averageLifespan='" + averageLifespan + '\'' +
                ", eyeColors='" + eyeColors + '\'' +
                ", hairColors='" + hairColors + '\'' +
                ", skinColors='" + skinColors + '\'' +
                ", language='" + language + '\'' +
                ", homeworld='" + homeworld + '\'' +
                ", people=" + people +
                ", films=" + films +
                ", url='" + url + '\'' +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                '}';
    }
}
