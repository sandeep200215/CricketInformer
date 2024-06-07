package com.cricket.aps.controllers;


import com.cricket.aps.entities.Match;
import com.cricket.aps.entities.MatchStatus;
import com.cricket.aps.services.MatchService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {
    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }
    //get only live matches
    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches()
    {
        System.out.println("Live Scores");
       return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
//        return this.matchService.getLiveMatches();

    }
    // get all matches
    @GetMapping("/allmatches")
    public ResponseEntity<List<Match>>getAllMatches()
    {
        return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
    }
    //get point table matches
    @GetMapping("/point-table")
    public ResponseEntity<?>getPointTable()
    {
        return new ResponseEntity<>(this.matchService.getPointTable(),HttpStatus.OK);
    }
}
