package com.perusahaanx.nonton_anime.controllers;

import com.perusahaanx.nonton_anime.models.response.jikan.Anime;
import com.perusahaanx.nonton_anime.models.response.jikan.AnimeResponse;
import com.perusahaanx.nonton_anime.services.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Map;


@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RequestMapping("/anime-list")
public class AnimeController {

    @Autowired
    private AnimeService animeService;

    @GetMapping()
    public Mono<AnimeResponse> getAllAnime(
            @RequestParam Integer page,
            @RequestParam Integer limit,
            @RequestParam(required = false) String search,
            @RequestParam(required = false) String type,
            @RequestParam(required = false) String status,
            @RequestParam(required = false) String orderBy,
            @RequestParam(required = false) String sort
    ) {
        return animeService.fetchAnimeList(page, limit, search, type, status, orderBy, sort);
    }

}
