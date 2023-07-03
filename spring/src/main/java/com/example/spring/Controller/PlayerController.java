package com.example.spring.Controller;

import com.example.spring.Entity.PlayerDetails;
import com.example.spring.Service.MapAndFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    MapAndFilter mapAndFilter;

    @GetMapping("/players/{favourite_sport}")
    public PlayerDetails getPlayerDetails(@PathVariable String favourite_sport) throws IOException {
        return mapAndFilter.MapAndFilterData(favourite_sport);
    }

    @GetMapping("/newData")
    public List<PlayerDetails> details() throws IOException {
        return mapAndFilter.getSportDetails();
    }
}
