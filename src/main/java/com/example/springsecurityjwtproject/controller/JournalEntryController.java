package com.example.springsecurityjwtproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {

    @GetMapping
    public String getAllJournal(){
        return "All Journal";
    }
}
