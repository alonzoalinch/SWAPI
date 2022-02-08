package requestapi.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import requestapi.demo.model.FilmSearchResponse;
import requestapi.demo.service.FilmService;

@RestController
public class FilmController {

    private FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }


    @GetMapping("/films")
    public FilmSearchResponse searchForFilms(@RequestParam String search){
        return filmService.searchForFilms(search);
    }


}
