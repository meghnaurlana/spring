package com.example.spring.Service;


import com.example.spring.MockData.PlayerData;
import com.example.spring.Entity.PlayerDetails;
import org.springframework.stereotype.Service;
import java.io.IOException;
import java.util.List;

@Service
public class MapAndFilter {
    public PlayerDetails MapAndFilterData(String favourite_sport) throws IOException {
        List<PlayerDetails> player = PlayerData.getPlayers();
        return player.stream()
                .filter(PlayerDetails -> PlayerDetails.getFavourite_sport().equals(favourite_sport))
                .findFirst().orElse(null);
    }

}

