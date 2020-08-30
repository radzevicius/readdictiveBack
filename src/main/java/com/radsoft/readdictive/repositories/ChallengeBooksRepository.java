package com.radsoft.readdictive.repositories;

import com.radsoft.readdictive.entities.ChallengeBooks;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChallengeBooksRepository extends JpaRepository<ChallengeBooks,Long> {

    List<ChallengeBooks> findByChallengeId(Long challengeId);

    List<ChallengeBooks> findByBookId(Long bookId);
}
