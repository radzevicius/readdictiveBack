package com.radsoft.readdictive.entities;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    Long Id;

    @Column(name="nickname")
    String nickname;

    @Column(name="description")
    String description;

    @Column(name="role")
    String role;

    @Column(name="created_challenges_ids")
    String createdChallengesIds;

    @Column(name="member_of_challenges_ids")
    String memberOfChallengesIds;

    public User(){}

    public User(String nickname, String description, String role, String createdChallengesIds, String memberOfChallengesIds){
        this.nickname = nickname;
        this.description = description;
        this.role = role;
        this.createdChallengesIds = createdChallengesIds;
        this.memberOfChallengesIds = memberOfChallengesIds;
    }

    public Long getId() {
        return Id;
    }

    public String getNickname() {
        return nickname;
    }

    public String getDescription() {
        return description;
    }

    public String getRole() {
        return role;
    }

    public String getCreatedChallengesIds() {
        return createdChallengesIds;
    }

    public String getMemberOfChallengesIds() {
        return memberOfChallengesIds;
    }
}
