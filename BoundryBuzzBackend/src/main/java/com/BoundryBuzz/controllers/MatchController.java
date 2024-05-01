package com.BoundryBuzz.controllers;

import com.BoundryBuzz.entities.Match;
import com.BoundryBuzz.services.MatchServices;
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
   private MatchServices matchServices;

    public MatchController(MatchServices matchServices) {
        this.matchServices = matchServices;
    }
@GetMapping("/live")
    public ResponseEntity<List<Match>>getLiveMatches(){
        return new ResponseEntity<>(this.matchServices.getLiveMatches(), HttpStatus.OK);


    }
    @GetMapping
    public ResponseEntity<List<Match>>getAllMatches(){
        return new ResponseEntity<>(this.matchServices.getAllMatches(),HttpStatus.OK);
    }
    @GetMapping("/point-table")
    public ResponseEntity<?> getPointTable()
    {
return new ResponseEntity<>(this.matchServices.getPointTable(),HttpStatus.OK);
    }
}
