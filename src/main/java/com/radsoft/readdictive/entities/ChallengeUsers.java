package com.radsoft.readdictive.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ChallengeUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="challenge_id")
    Long challengeId;

    @Column(name="user_id")
    Long userId;

    @Column(name="completed_date")
    @Temporal(value= TemporalType.TIMESTAMP)
    Date completedDate;

    public static class ChallengeUsersBuilder{
        Long id;
        Long challengeId;
        Long userId;
        Date completedDate;

        public ChallengeUsersBuilder withId(Long id){
            this.id = id;
            return this;
        }

        public ChallengeUsersBuilder withChallengeId(Long challengeId){
            this.challengeId = challengeId;
            return this;
        }

        public ChallengeUsersBuilder withUserId(Long userId){
            this.userId = userId;
            return this;
        }

        public ChallengeUsersBuilder withCompletedDate(Date completedDate){
            this.completedDate = completedDate;
            return this;
        }

        public ChallengeUsers build(){ return new ChallengeUsers(this);}
    }

    public ChallengeUsers(){ }

    public ChallengeUsers(ChallengeUsersBuilder challengeUsersBuilder){
        this.id = challengeUsersBuilder.id;
        this.challengeId = challengeUsersBuilder.challengeId;
        this.userId = challengeUsersBuilder.userId;
        this.completedDate = challengeUsersBuilder.completedDate;
    }

    public Long getId() {
        return id;
    }

    public Long getChallengeId() {
        return challengeId;
    }

    public Long getUserId() {
        return userId;
    }

    public Date getCompletedDate() {
        return completedDate;
    }
}
