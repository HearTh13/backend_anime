package com.perusahaanx.nonton_anime.models.response.jikan;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Images {
    @JsonProperty
    private ImageFormat jpg;
    @JsonProperty
    private ImageFormat webp;
}