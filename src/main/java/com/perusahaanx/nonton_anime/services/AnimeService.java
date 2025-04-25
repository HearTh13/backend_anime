package com.perusahaanx.nonton_anime.services;

import com.perusahaanx.nonton_anime.models.response.jikan.AnimeFullResponse;
import com.perusahaanx.nonton_anime.models.response.jikan.AnimeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class AnimeService {

    private static final String JIKAN_API_URL = "https://api.jikan.moe/v4/anime";

    @Autowired
    private WebClient webClient;

    public Mono<AnimeResponse> fetchAnimeList(
            Integer page,
            Integer limit,
            String search,
            String type,
            String status,
            String orderBy,
            String sort
    ) {
        String uri = JIKAN_API_URL+"?";
        if (page != null && limit != null) {
            uri += "page=" + page + "&limit=" + limit + "&";
        }
        if (search != null) {
            uri += "search=" + search + "&";
        }
        if (type != null) {
            uri += "type=" + type + "&";
        }
        if (status != null) {
            uri += "status=" + status + "&";
        }
        if (orderBy != null) {
            uri += "orderBy=" + orderBy + "&";
        }
        if (sort != null) {
            uri += "sort=" + sort + "&";
        }
        uri = uri.substring(0, uri.length() - 1);
        return webClient.get()
                .uri(uri)
                .retrieve()
                .bodyToMono(AnimeResponse.class);
    }
    public Mono<AnimeFullResponse> fetchAnimeById(Integer id) {
        String uri = JIKAN_API_URL+"/"+id+"/"+"full";
        System.out.println("uri: "+uri);
        return webClient.get()
                .uri(uri)
                .retrieve()
                .bodyToMono(AnimeFullResponse.class);
    }
}
