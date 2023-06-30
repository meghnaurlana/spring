package com.example.spring.Service;

import com.example.spring.Dto.SportDetails;
import com.example.spring.MockData.PlayerData;
import com.example.spring.Entity.PlayerDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
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
        SportDetails details = PlayerData.getSport();
        System.out.println("details "+details);
        System.out.println("get Player " + PlayerData.getPlayers());
        System.out.println("get sport "+ PlayerData.getSport().getFavourite_sports());
        System.out.println("condition "+PlayerData.getPlayers().contains(PlayerData.getSport().getFavourite_sports()));
        for (PlayerDetails playerDetails : PlayerData.getPlayers()) {
            if (PlayerData.getPlayers().contains(PlayerData.getSport().getFavourite_sports())) {
                addData.add(playerDetails);
                System.out.println("addData" + addData);
            }
        }
        return addData;
    }

}

