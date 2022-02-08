package requestapi.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import java.util.ArrayList;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
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
    private ArrayList<String> residents;
    private ArrayList<String> films;
    private String url;
    private String created;
    private String edited;
}
