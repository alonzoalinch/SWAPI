package requestapi.demo.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import requestapi.demo.model.Film;
import requestapi.demo.model.FilmSearchResponse;

import java.util.List;

@Service
public class FilmService {

    private static String url = "https://swapi.dev/api/films";
    private WebClient webCLient = WebClient.builder().baseUrl(url).build();

    //private RestTemplate restTemplate = RestTemplate.


    public FilmSearchResponse searchForFilms(String search) {
        if (search == null) {
            throw new IllegalStateException("keyword not found");
        }
        System.out.println("llega al servicio");
        return webCLient.get().
                uri(uriBuilder -> uriBuilder.
                    queryParam("search", search).
                    build()).
                accept(MediaType.APPLICATION_JSON).
                retrieve().
                bodyToMono(FilmSearchResponse.class).
                block();

    }
}
