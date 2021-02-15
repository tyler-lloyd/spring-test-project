package com.privvy.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class TweetController {
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/tweet")
    public Tweet tweet() {
        return new Tweet(counter.incrementAndGet());
    }
}
