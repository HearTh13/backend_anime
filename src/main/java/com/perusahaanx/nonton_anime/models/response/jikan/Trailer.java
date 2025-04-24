package com.perusahaanx.nonton_anime.models.response.jikan;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Trailer {
    @JsonProperty("youtube_id")
    private String youtubeId;

    private String url;

    @JsonProperty("embed_url")
    private String embedUrl;

    private ImageFormat images;
}