package com.perusahaanx.nonton_anime.models.response.jikan;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ImageFormat {
    @JsonProperty("image_url")
    private String imageUrl;

    @JsonProperty("small_image_url")
    private String smallImageUrl;

    @JsonProperty("large_image_url")
    private String largeImageUrl;
}