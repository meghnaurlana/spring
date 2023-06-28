package com.example.spring;


import com.example.spring.MockData.PlayerData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
@Service
@Slf4j
public class MapAndFilter {
   public  PlayerDetails MapAndFilterData(String favourite_sport) throws IOException {
        List<PlayerDetails> player = PlayerData.getPlayers();
        log.info("hello"+ player);
        PlayerDetails players = new PlayerDetails();
        return (PlayerDetails) player.stream()
                .filter(PlayerDetails -> PlayerDetails.getFavourite_sport().equals(favourite_sport))
                .collect(Collectors.toList());

//         PlayerDetails players = (PlayerDetails) player.stream()
//
//                .filter(PlayerDetails -> PlayerDetails.getFavourite_sport().equals(favourite_sport))
//                .collect(Collectors.toList());
//         log.info("helloplayyer"+ players);
//return players;

        }

   }

