package com.example.spring.MockData;

import com.example.spring.Entity.PlayerDetails;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class PlayerData {
public static List<PlayerDetails> data;
    public static List<PlayerDetails> getPlayers() throws IOException{
        ObjectMapper mapper = new ObjectMapper();
         data = List.of(mapper.readValue(new File("C:\\Users\\Meghana\\Downloads\\spring (1)\\spring\\src\\main\\resources\\players.json"), PlayerDetails[].class));
        return data;
    }


}
