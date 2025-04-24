package com.perusahaanx.nonton_anime.repositories;

import com.perusahaanx.nonton_anime.models.UserTable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserTableRepository extends JpaRepository<UserTable, UUID> {
}