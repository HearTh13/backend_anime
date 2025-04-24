package com.perusahaanx.nonton_anime.models.response.jikan;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class AnimeResponse {
    @JsonProperty
    private Pagination pagination;
    @JsonProperty
    private List<Anime> data;
}