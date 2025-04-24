package com.perusahaanx.nonton_anime.services;


import com.perusahaanx.nonton_anime.repositories.UserTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserTableRepository userRepository;

}
