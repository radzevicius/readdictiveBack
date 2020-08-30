package com.radsoft.readdictive.repositories;

import com.radsoft.readdictive.entities.ChallengeUsers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChallengeUsersRepository extends JpaRepository<ChallengeUsers,Long> {

    public List<ChallengeUsers> findByUserId(Long id);

    public List<ChallengeUsers> findByChallengeId(Long id);
}
