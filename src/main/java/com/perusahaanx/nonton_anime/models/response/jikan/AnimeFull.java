package com.perusahaanx.nonton_anime.models.response.jikan;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class AnimeFull {
    @JsonProperty("mal_id")
    private int malId;
    @JsonProperty
    private Images images;
    @JsonProperty
    private Trailer trailer;
    @JsonProperty
    private String title;
    @JsonProperty
    private String title_english;
    @JsonProperty
    private String title_japanese;
    @JsonProperty("title_synonyms")
    private List<String> titleSynonyms;
    @JsonProperty
    private String type;
    @JsonProperty
    private String source;
    @JsonProperty
    private int episodes;
    @JsonProperty
    private String status;
    @JsonProperty
    private boolean airing;
    @JsonProperty
    private Aired aired;
    @JsonProperty
    private String duration;
    @JsonProperty
    private String rating;
    @JsonProperty
    private double score;
    @JsonProperty
    private int scored_by;
    @JsonProperty
    private int rank;
    @JsonProperty
    private int popularity;
    @JsonProperty
    private int members;
    @JsonProperty
    private int favorites;
    @JsonProperty
    private String synopsis;
    @JsonProperty
    private String background;
    @JsonProperty
    private String season;
    @JsonProperty
    private int year;
    @JsonProperty
    private Broadcast broadcast;
    @JsonProperty
    private List<Producer> producers;
    @JsonProperty
    private List<Producer> licensors;
    @JsonProperty
    private List<Producer> studios;
    @JsonProperty
    private List<Genre> genres;
    @JsonProperty
    private List<Genre> explicit_genres;
    @JsonProperty
    private List<Genre> themes;
    @JsonProperty
    private List<Genre> demographics;
}
