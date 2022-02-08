package requestapi.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import requestapi.demo.model.PlanetSearchResponse;
import requestapi.demo.service.PlanetService;

@RestController
public class PlanetController {

    private PlanetService planetService;

    public PlanetController(PlanetService planetService) {
        this.planetService = planetService;
    }
    @GetMapping("/planets")
    public PlanetSearchResponse searchPlanet(String search){
        return planetService.searchPlanet(search);
    }
}
