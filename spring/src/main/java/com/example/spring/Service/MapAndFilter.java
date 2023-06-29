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
//        List<SportDetails> sport = PlayerData.getSport();
//        log.info("hello1", sport);
//        System.out.println(sport);

        for (PlayerDetails playerDetails : PlayerData.getPlayers()) {
            System.out.println("hello2");

            if (PlayerData.getPlayers().contains(playerDetails.getFavourite_sport())) {
                System.out.println("hello 3");
                log.info("hello");
                addData.add(playerDetails);
                log.info("hellos", addData);
            }
        }
        System.out.println(addData);
        return addData;
    }

}

