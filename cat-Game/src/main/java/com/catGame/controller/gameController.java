package com.catGame.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("{/gamecpu}")

public class gameController {
    @PostMapping("{/new}")
    public ResponseEntity<GameDTO> newGame(@RequestParam boolean cpu){};


    @PostMapping("{/play}")
    public List<boardDTO> play(@RequestBody gameRequest game){};

}
