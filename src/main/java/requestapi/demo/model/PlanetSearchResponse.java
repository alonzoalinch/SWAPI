package requestapi.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlanetSearchResponse {
    private Integer count;
    private String next;
    private String previous;
    private List<Planet> results;
}
