package requestapi.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import requestapi.demo.model.People;
import requestapi.demo.service.PeopleService;

@RestController
public class PeopleController {

    private PeopleService peopleService;

    public PeopleController(PeopleService peopleService) {
        this.peopleService = peopleService;
    }

    @GetMapping("/people/{id}")
    public People findPeople(@PathVariable String id) {
        return peopleService.findPeople(id);
    }
}
