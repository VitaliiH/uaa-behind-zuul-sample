package com.news;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * The controller represents silly endpoint, that returns a "news" payload
 * on each request.
 * It was designed with "no security at all" - just to see how to configure
 * Zuul in this situation.
 */
@RestController
@RequestMapping("/")
public class PublicController {

    @RequestMapping(method = RequestMethod.GET)
    public String news() {
        return "Breaking news! The time is: " + LocalDateTime.now();
    }
}