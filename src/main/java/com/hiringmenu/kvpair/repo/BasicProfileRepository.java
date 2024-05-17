package com.hiringmenu.kvpair.repo;

import com.hiringmenu.kvpair.model.BasicProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// BasicProfileRepository.java
@Repository
public interface BasicProfileRepository extends JpaRepository<BasicProfile, Integer> {
    // Custom query methods if needed
}