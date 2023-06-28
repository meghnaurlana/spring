package com.example.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class PlayerController {
    @Autowired
MapAndFilter mapAndFilter;

    @GetMapping("/players/{favorite_sport}")
    public PlayerDetails getPlayerDetails(@PathVariable String favorite_sport) throws IOException {
       return (PlayerDetails) mapAndFilter.MapAndFilterData(favorite_sport);

    }

}
