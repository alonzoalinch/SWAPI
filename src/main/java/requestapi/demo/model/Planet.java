package requestapi.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;

@Getter
@Setter
public class Planet {

    private String name;
    private String diameter;
    @JsonProperty("rotation_period")
    private String rotationPeriod;
    @JsonProperty("orbital_period")
    private String orbitalPeriod;
    private String gravity;
    private String population;
    private String climate;
    private String terrain;
    @JsonProperty("surface_water")
    private String surfaceWater;
    private ArrayList<People> residents;
    private ArrayList<Film> films;
    private String url;
    private String created;
    private String edited;

    public Planet() {

    }

    public Planet(String name, String diameter, String rotationPeriod, String orbitalPeriod, String gravity, String population, String climate, String terrain, String surfaceWater, ArrayList<People> residents, ArrayList<Film> films, String url, String created, String edited) {
        this.name = name;
        this.diameter = diameter;
        this.rotationPeriod = rotationPeriod;
        this.orbitalPeriod = orbitalPeriod;
        this.gravity = gravity;
        this.population = population;
        this.climate = climate;
        this.terrain = terrain;
        this.surfaceWater = surfaceWater;
        this.residents = residents;
        this.films = films;
        this.url = url;
        this.created = created;
        this.edited = edited;
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", diameter='" + diameter + '\'' +
                ", rotationPeriod='" + rotationPeriod + '\'' +
                ", orbitalPeriod='" + orbitalPeriod + '\'' +
                ", gravity='" + gravity + '\'' +
                ", population='" + population + '\'' +
                ", climate='" + climate + '\'' +
                ", terrain='" + terrain + '\'' +
                ", surfaceWater='" + surfaceWater + '\'' +
                ", residents=" + residents +
                ", films=" + films +
                ", url='" + url + '\'' +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                '}';
    }
}
