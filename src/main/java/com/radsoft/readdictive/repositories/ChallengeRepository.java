package com.radsoft.readdictive.repositories;

import com.radsoft.readdictive.entities.Challenge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChallengeRepository extends JpaRepository<Challenge, Long> {

    List<Challenge> findByNameContaining(String name);

    

}
