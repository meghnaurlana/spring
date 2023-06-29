package com.example.spring.MockData;

import com.example.spring.Dto.SportDetails;
import com.example.spring.Entity.PlayerDetails;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class PlayerData {
public static List<PlayerDetails> data;
public static List<SportDetails> favSport;
    public static List<PlayerDetails> getPlayers() throws IOException{
        ObjectMapper mapper = new ObjectMapper();
         data = List.of(mapper.readValue(new File("C:\\Users\\Meghana\\Downloads\\spring (1)\\spring\\src\\main\\resources\\players.json"), PlayerDetails[].class));
        return data;
    }
    public static List<SportDetails> getSport() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        favSport = Collections.singletonList(mapper.readValue(new File("C:\\Users\\Meghana\\Downloads\\spring (1)\\spring\\src\\main\\resources\\Game.json"), SportDetails.class));
        return favSport;



    }


}
