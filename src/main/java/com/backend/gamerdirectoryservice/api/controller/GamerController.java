package com.backend.gamerdirectoryservice.api.controller;

import com.backend.gamerdirectoryservice.api.dto.GamerDto;
import com.backend.gamerdirectoryservice.api.service.GamerService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/gamers")
@RequiredArgsConstructor
public class GamerController {

    private final GamerService gamerService;

    @GetMapping
    public List<GamerDto> getAllGamers() {
        return gamerService.getAllGamers();
    }

    @GetMapping("/geography/{geography}")
    public List<GamerDto> getAllGamersByGeography(@PathVariable String geography) {
        return gamerService.getAllGamersByGeography(geography);
    }
}
