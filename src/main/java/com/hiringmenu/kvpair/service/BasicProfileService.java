package com.hiringmenu.kvpair.service;

import com.hiringmenu.kvpair.model.BasicProfile;
import com.hiringmenu.kvpair.repo.BasicProfileRepository;
import org.springframework.stereotype.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Optional;

@Service
public class BasicProfileService {

    private final BasicProfileRepository basicProfileRepository;

    @Autowired
    public BasicProfileService(BasicProfileRepository basicProfileRepository) {
        this.basicProfileRepository = basicProfileRepository;
    }

    public List<BasicProfile> getAllProfiles() {
        return basicProfileRepository.findAll();
    }

    public Optional<BasicProfile> getProfileById(int id) {
        return basicProfileRepository.findById(id);
    }

    public BasicProfile createProfile(BasicProfile profile) {
        return basicProfileRepository.save(profile);
    }

    public BasicProfile updateProfile(int id, BasicProfile profile) {
        if (basicProfileRepository.existsById(id)) {
            profile.setId(id);
            return basicProfileRepository.save(profile);
        } else {
            throw new RuntimeException("Profile with id " + id + " not found");
        }
    }

    public void deleteProfile(int id) {
        basicProfileRepository.deleteById(id);
    }
}
