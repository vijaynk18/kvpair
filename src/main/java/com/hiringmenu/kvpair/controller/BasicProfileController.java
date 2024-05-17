package com.hiringmenu.kvpair.controller;

import com.hiringmenu.kvpair.model.BasicProfile;
import com.hiringmenu.kvpair.service.BasicProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.Optional;

@RestController
@RequestMapping("/profiles")
public class BasicProfileController {

    private final BasicProfileService basicProfileService;

    @Autowired
    public BasicProfileController(BasicProfileService basicProfileService) {
        this.basicProfileService = basicProfileService;
    }

    @GetMapping
    public ResponseEntity<List<BasicProfile>> getAllProfiles() {
        List<BasicProfile> profiles = basicProfileService.getAllProfiles();
        return new ResponseEntity<>(profiles, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BasicProfile> getProfileById(@PathVariable int id) {
        Optional<BasicProfile> profile = basicProfileService.getProfileById(id);
        return profile.map(value -> new ResponseEntity<>(value, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<BasicProfile> createProfile(@RequestBody BasicProfile profile) {
        BasicProfile createdProfile = basicProfileService.createProfile(profile);
        return new ResponseEntity<>(createdProfile, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<BasicProfile> updateProfile(@PathVariable int id, @RequestBody BasicProfile profile) {
        BasicProfile updatedProfile = basicProfileService.updateProfile(id, profile);
        return new ResponseEntity<>(updatedProfile, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProfile(@PathVariable int id) {
        basicProfileService.deleteProfile(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
