package com.example.spring.Service;

import com.example.spring.Entity.PlayerDetails;
import com.example.spring.MockData.PlayerData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class MapAndFilter {

    public PlayerDetails MapAndFilterData(String favourite_sport) throws IOException {
        List<PlayerDetails> player = PlayerData.getPlayers();
        return player.stream()
                .filter(PlayerDetails -> PlayerDetails.getFavourite_sport().equals(favourite_sport))
                .findFirst().orElse(null);
    }

    public List<PlayerDetails> getSportDetails() throws IOException {
        List<PlayerDetails> addData = new ArrayList<>();
        List<String> values = PlayerData.getSport().getFavourite_sports();
        for (PlayerDetails playerDetails : PlayerData.getPlayers()) {
            if (values.contains(playerDetails.getFavourite_sport())) {
                addData.add(playerDetails);
            }
        }
        return addData;
    }

}

