package com.perusahaanx.nonton_anime.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {
    @Bean
    public WebClient webClient() {
        return WebClient.create();
    }

//    @Bean
//    public WebClient webClient(WebClient.Builder builder) {
//        return builder.baseUrl("https://api.jikan.moe/v4").build();
//    }
}