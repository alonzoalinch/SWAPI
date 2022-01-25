package requestapi.demo.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import requestapi.demo.model.People;

@Service
public class PeopleService {

    private static String url = "https://swapi.dev/api/people";
    private WebClient webClient = WebClient.builder().baseUrl(url).build();


    public People findPeople(String id) {

        People people = new People();

        String result =
                webClient.get()
                        .uri("/{id}", id)
                        .accept(MediaType.APPLICATION_JSON)
                        .retrieve()
                        .bodyToMono(String.class)
                        .block();//.toString();

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
