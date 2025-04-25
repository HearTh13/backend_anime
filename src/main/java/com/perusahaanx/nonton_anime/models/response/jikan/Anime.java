package com.perusahaanx.nonton_anime.models.response.jikan;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Anime {
    @JsonProperty("mal_id")
    private int malId;

    @JsonProperty
    private String title;
}