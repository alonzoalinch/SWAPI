package requestapi.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
public class Vehicle {
    private String name;
    private String model;
    @JsonProperty("vehicle_class")
    private String vehicleClass;
    private String manufacturer;
    private String length;
    @JsonProperty("cost_in_credits")
    private String costInCredits;
    private String crew;
    private String passengers;
    @JsonProperty("max_atmosphering_speed")
    private String maxAtmospheringSpeed;
    @JsonProperty("cargo_capacity")
    private String cargoCapacity;
    private String consumables;
    private List<Film> films;
    private List<People> pilots;
    private String url;
    private String created;
    private String edited;

    public Vehicle() {

    }

    public Vehicle(String name, String model, String vehicleClass, String manufacturer, String length, String costInCredits, String crew, String passengers, String maxAtmospheringSpeed, String cargoCapacity, String consumables, List<Film> films, List<People> pilots, String url, String created, String edited) {
        this.name = name;
        this.model = model;
        this.vehicleClass = vehicleClass;
        this.manufacturer = manufacturer;
        this.length = length;
        this.costInCredits = costInCredits;
        this.crew = crew;
        this.passengers = passengers;
        this.maxAtmospheringSpeed = maxAtmospheringSpeed;
        this.cargoCapacity = cargoCapacity;
        this.consumables = consumables;
        this.films = films;
        this.pilots = pilots;
        this.url = url;
        this.created = created;
        this.edited = edited;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", vehicleClass='" + vehicleClass + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", length='" + length + '\'' +
                ", costInCredits='" + costInCredits + '\'' +
                ", crew='" + crew + '\'' +
                ", passengers='" + passengers + '\'' +
                ", maxAtmospheringSpeed='" + maxAtmospheringSpeed + '\'' +
                ", cargoCapacity='" + cargoCapacity + '\'' +
                ", consumables='" + consumables + '\'' +
                ", films=" + films +
                ", pilots=" + pilots +
                ", url='" + url + '\'' +
                ", created='" + created + '\'' +
                ", edited='" + edited + '\'' +
                '}';
    }
}
