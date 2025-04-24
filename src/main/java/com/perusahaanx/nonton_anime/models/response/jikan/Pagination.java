package com.perusahaanx.nonton_anime.models.response.jikan;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Pagination {
    @JsonProperty("last_visible_page")
    private int lastVisiblePage;

    @JsonProperty("has_next_page")
    private boolean hasNextPage;

    @JsonProperty("current_page")
    private int currentPage;

    private Items items;
}
