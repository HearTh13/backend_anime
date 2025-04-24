package com.perusahaanx.nonton_anime.models.response.jikan;

import lombok.Data;

@Data
public class Aired {
    private String from;
    private String to;
    private AiredProp prop;
    private String string;
}