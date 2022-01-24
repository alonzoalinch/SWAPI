package requestapi.demo.model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.List;


@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class People {
    private String name;
    private String height;
    private String mass;
    @JsonProperty("hair_color")
    private String hairColor;
    @JsonProperty("skin_color")
    private String skinColor;
    @JsonProperty("eye_color")
    private String eyeColor;
    @JsonProperty("birth_year")
    private String birthYear;
    private String gender;
    private String homeworld;
    //private List<Film> films;
    // private List<Specie> species;
    // private List<Vehicle> vehicles;
    // private List<Starship> starships;
    private String created;
    private String edited;
    private String url;

    public People() {
    }

    public People(String name, String birth_year, String eye_color, String gender, String hairColor, String height, String mass, String skin_color, String homeworld, /*List<Film> films, List<Specie> species, List<Starship> starships, List<Vehicle> vehicles,*/ String url, String created, String edited) {
        this.name = name;
        this.birthYear = birth_year;
        this.eyeColor = eye_color;
        this.gender = gender;
        this.hairColor = hairColor;
        this.height = height;
        this.mass = mass;
        this.skinColor = skin_color;
        this.homeworld = homeworld;
        //this.films = films;
        // this.species = species;
        // this.starships = starships;
        //  this.vehicles = vehicles;
        this.url = url;
        this.created = created;
        this.edited = edited;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", birth_year='" + birthYear + '\'' +
                ", eye_color='" + eyeColor + '\'' +
                ", gender='" + gender + '\'' +
                ", hair_color='" + hairColor + '\'' +
                ", height='" + height + '\'' +
                ", mass='" + mass + '\'' +
                ", skin_color='" + skinColor + '\'' +
                ", homeworld='" + homeworld + '\'' +
                //", films=" + films +
                // ", species=" + species +
                // ", starships=" + starships +
                //  ", vehicles=" + vehicles +
                ", url='" + url + '\'' +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                '}';
    }
}
