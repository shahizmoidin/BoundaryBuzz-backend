package com.BoundryBuzz.services;

import com.BoundryBuzz.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchServices {
    List<Match> getAllMatches();

    List<Match> getLiveMatches();
    List<List<String>>getPointTable();
}
