package requestapi.demo.service;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import requestapi.demo.model.People;
import requestapi.demo.model.PeopleSearchResponse;

@Service
public class PeopleService {

    private static String url = "https://swapi.dev/api/people";
    private WebClient webClient = WebClient.builder().baseUrl(url).build();


    public People findPeople(String id) {

        return webClient.get()
                .uri("/{id}", id)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(People.class)
                .block();
    }

    public PeopleSearchResponse searchPeople(String keyword) {
        if (keyword == null) {
            throw new IllegalStateException("empty Keyword");
        }
        return webClient.get()
                .uri("?search={search}", keyword)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(PeopleSearchResponse.class)
                .block();
    }
}
