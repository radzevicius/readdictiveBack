package com.radsoft.readdictive.entities;

import javax.persistence.*;

@Entity
@Table(name="challenges")
public class Challenge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    Long Id;

    @Column(name="name")
    String name;

    @Column(name="description")
    String description;

    @Column(name="book_ids")
    String bookIds;

    @Column(name="user_ids")
    String userIds;

    @Column(name="creator_id")
    String creatorId;

    public Challenge(){ }

    public Challenge(String name, String description, String bookIds, String userIds, String creatorId){
        this.name = name;
        this.description = description;
        this.bookIds = bookIds;
        this.userIds = userIds;
        this.creatorId =creatorId;
    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getBookIds() {
        return bookIds;
    }

    public String getUserIds() {
        return userIds;
    }

    public String getCreatorId() {
        return creatorId;
    }
}
