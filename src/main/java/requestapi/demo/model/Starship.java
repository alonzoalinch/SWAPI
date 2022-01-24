package requestapi.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Starship {
    private String name;
    private String model;
    @JsonProperty("starship_class")
    private String starshipClass;
    private String manufacturer;
    @JsonProperty("cost_in_credits")
    private String costInCredits;
    private String length;
    private String crew;
    private String passengers;
    @JsonProperty("max_atmosphering_speed")
    private String maxAtmospheringSpeed;
    @JsonProperty("hyperdrive_rating")
    private String hyperdriveRating;
    private String MGLT;
    @JsonProperty("cargo_capacity")
    private String cargoCapacity;
    private String consumables;
    private List<Film> films;
    private List<People> pilots;
    private String url;
    private String created;
    private String edited;

    public Starship() {

    }

    public Starship(String name, String model, String starshipClass, String manufacturer, String costInCredits, String length, String crew, String passengers, String maxAtmospheringSpeed, String hyperdriveRating, String MGLT, String cargoCapacity, List<Film> films, List<People> pilots, String url, String created, String edited) {
        this.name = name;
        this.model = model;
        this.starshipClass = starshipClass;
        this.manufacturer = manufacturer;
        this.costInCredits = costInCredits;
        this.length = length;
        this.crew = crew;
        this.passengers = passengers;
        this.maxAtmospheringSpeed = maxAtmospheringSpeed;
        this.hyperdriveRating = hyperdriveRating;
        this.MGLT = MGLT;
        this.cargoCapacity = cargoCapacity;
        this.films = films;
        this.pilots = pilots;
        this.url = url;
        this.created = created;
        this.edited = edited;
    }

    @Override
    public String toString() {
        return "Starship{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", starshipClass='" + starshipClass + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", costInCredits='" + costInCredits + '\'' +
                ", length='" + length + '\'' +
                ", crew='" + crew + '\'' +
                ", passengers='" + passengers + '\'' +
                ", maxAtmospheringSpeed='" + maxAtmospheringSpeed + '\'' +
                ", hyperdriveRating='" + hyperdriveRating + '\'' +
                ", MGLT='" + MGLT + '\'' +
                ", cargoCapacity='" + cargoCapacity + '\'' +
                ", films=" + films +
                ", pilots=" + pilots +
                ", url='" + url + '\'' +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                '}';
    }
}
