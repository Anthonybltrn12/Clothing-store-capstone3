package org.yearup.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import org.yearup.models.Category;
import org.yearup.models.Product;
import org.yearup.models.Profile;
import org.yearup.models.User;
import org.yearup.service.ProfileService;
import org.yearup.service.UserService;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/profile")
@CrossOrigin
public class ProfileController {
        @Autowired
        private ProfileService profileService;
        @Autowired
        private UserService userService;

        public ProfileController(ProfileService profileService, UserService userService){
            this.profileService = profileService;
            this.userService = userService;
        }

    @GetMapping
    @PreAuthorize("permitAll()")
    public ResponseEntity<Profile> getProfile(Principal principal) {
        String userName = principal.getName();
        User user = userService.getByUserName(userName);
        int userId = user.getId();
        // find and return all categories
        return ResponseEntity.ok().body(profileService.getProfileById(userId).orElseThrow());
    }

    @PutMapping("/{userId}")
    @PreAuthorize("permitAll()")
    public Profile updateProfile(@PathVariable int userId, @RequestBody Profile profile)
    {
        if (profileService.getProfileById(userId).isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return profileService.update(userId, profile);
    }
}
