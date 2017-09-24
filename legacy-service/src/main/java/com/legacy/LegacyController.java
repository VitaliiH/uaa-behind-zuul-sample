package com.legacy;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * The controller that represents a bunch of simple end-points, that are about to be substituted by
 * implementations in another service.
 */
@RestController
@RequestMapping("/")
public class LegacyController {

    @RequestMapping(path = "user", method = RequestMethod.GET)
    @PreAuthorize("#oauth2.hasScope('openid') and hasRole('ROLE_USER')")
    public String userPage() {
        return "A very old implementation of user page";
    }

	@RequestMapping(path = "guest", method = RequestMethod.GET)
    @PreAuthorize("#oauth2.hasScope('openid') and hasRole('ROLE_GUEST')")
    public String guestPage() {
		return "A very old implementation of guest page";
    }

    @RequestMapping(path = "admin", method = RequestMethod.GET)
    @PreAuthorize("#oauth2.hasScope('openid') and hasRole('ROLE_ADMIN')")
    public String adminPage() {
        return "Welcome to the Administration page!";
    }
}