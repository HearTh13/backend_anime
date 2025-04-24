package com.perusahaanx.nonton_anime.models.response.jikan;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Items {
    private int count;
    private int total;

    @JsonProperty("per_page")
    private int perPage;
}