package com.radsoft.readdictive.controllers;

import com.radsoft.readdictive.services.ChallengeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/challenge")
@CrossOrigin("http://192.168.1.248:3000")
public class ChallengeController {

    @Autowired
    ChallengeService challengeService;


}
