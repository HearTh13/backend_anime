package com.perusahaanx.nonton_anime.models.response.jikan;

import lombok.Data;

@Data
public class Broadcast {
    private String day;
    private String time;
    private String timezone;
    private String string;
}
