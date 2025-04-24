package com.perusahaanx.nonton_anime.models.response.jikan;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Producer {
    @JsonProperty("mal_id")
    private int malId;

    private String type;
    private String name;
    private String url;
}