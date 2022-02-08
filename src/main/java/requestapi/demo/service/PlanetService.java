package requestapi.demo.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import requestapi.demo.model.PlanetSearchResponse;

@Service
public class PlanetService {

    private static String url = "https://swapi.dev/api/planets";
    WebClient webClient = WebClient.builder().baseUrl(url).build();

    public PlanetSearchResponse searchPlanet(String search) {

        if (search == null) {
            throw new IllegalStateException("Keyword not found");
        }
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .queryParam("search", search)
                        .build())
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(PlanetSearchResponse.class)
                .block();

    }
}
