package com.cricket.aps.services;

import com.cricket.aps.entities.Match;

import java.util.List;

public interface MatchService {
    //get all matches
    List<Match> getAllMatches();

    //get live match
    List<Match>getLiveMatches();

    //get cws2023 point table
    List<List<String>> getPointTable();

}
