package requestapi.demo.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import requestapi.demo.model.People;

@RestController
public class PeopleController {

    private static String url = "https://swapi.dev/api/people";
    WebClient webClient = WebClient.builder().baseUrl(url).build();


    @GetMapping("/people/{id}")
    public People findPeople(@PathVariable String id) {

        People people = new People();
        String result =
                webClient.get()
                        .uri("/{id}", id)
                        .accept(MediaType.APPLICATION_JSON)
                        .retrieve()
                        .bodyToMono(String.class)
                        .block().toString();

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            people = objectMapper.readValue(result, People.class);
            System.out.println("name: " + people.getName());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return people;
    }
}
