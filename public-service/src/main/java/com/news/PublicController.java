package com.news;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/")
public class PublicController {

    @RequestMapping(method = RequestMethod.GET)
    @PreAuthorize("permitAll")
    public String news() {
        return "Breaking news! The time is: " + new Date();
    }
}
