package com.perusahaanx.nonton_anime.models.response.jikan;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Anime {
    @JsonProperty("mal_id")
    private int malId;

    private String url;
    private Images images;
    private Trailer trailer;
    private boolean approved;
    private List<Title> titles;
    @JsonProperty
    private String title;
    private String title_english;
    private String title_japanese;
    private List<String> titleSynonyms;

    private String type;
    private String source;
    private int episodes;
    private String status;
    private boolean airing;
    private Aired aired;
    private String duration;
    private String rating;
    private double score;
    private int scored_by;
    private int rank;
    private int popularity;
    private int members;
    private int favorites;
    private String synopsis;
    private String background;
    private String season;
    private int year;
    private Broadcast broadcast;

    private List<Producer> producers;
    private List<Producer> licensors;
    private List<Producer> studios;
    private List<Genre> genres;
    private List<Genre> explicit_genres;
    private List<Genre> themes;
    private List<Genre> demographics;
}