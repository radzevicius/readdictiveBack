package com.radsoft.readdictive.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="challenges")
public class Challenge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    Long id;

    @Column(name="name")
    String name;

    @Column(name="description")
    String description;

    @Column(name="creator_id")
    Long creatorId;

    @Column(name="deadline_date")
    @Temporal(value=TemporalType.TIMESTAMP)
    Date deadlineDate;

    @Column(name="started_date")
    @Temporal(value =TemporalType.TIMESTAMP)
    Date startedDate;

    public static class ChallengeBuilder{
        Long id;
        String name;
        String description;
        Long creatorId;
        Date deadlineDate;
        Date startedDate;

        public ChallengeBuilder(){}

        public ChallengeBuilder withId(Long id){
            this.id  = id;
            return this;
        }

        public ChallengeBuilder withName (String name){
            this.name = name;
            return this;
        }

        public ChallengeBuilder withDescription (String description){
            this.description =  description;
            return this;
        }

        public ChallengeBuilder withCreatorId(Long creatorId){
            this.creatorId = creatorId;
            return this;
        }

        public ChallengeBuilder withDeadlineDate(Date deadlineDate){
            this.deadlineDate = deadlineDate;
            return this;
        }

        public ChallengeBuilder withStartedDate(Date startedDate){
            this.startedDate =  startedDate;
            return this;
        }

        public Challenge build(){
            return new Challenge(this);
        }
    }

    public Challenge(){ }

    public Challenge(ChallengeBuilder challengeBuilder){
        this.id = challengeBuilder.id;
        this.name = challengeBuilder.name;
        this.creatorId = challengeBuilder.creatorId;
        this.deadlineDate = challengeBuilder.deadlineDate;
        this.startedDate = challengeBuilder.startedDate;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Long getCreatorId() {
        return creatorId;
    }

    public Date getDeadlineDate() {
        return deadlineDate;
    }

    public Date getStartedDate() {
        return startedDate;
    }
}
