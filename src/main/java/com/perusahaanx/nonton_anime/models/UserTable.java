package com.perusahaanx.nonton_anime.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "user_table")
public class UserTable {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "access_token", length = Integer.MAX_VALUE)
    private String accessToken;

}