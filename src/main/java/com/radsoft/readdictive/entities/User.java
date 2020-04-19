package com.radsoft.readdictive.entities;

import javax.persistence.*;
import java.util.Date;

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

    @Column(name="avatar_image_url")
    String avatarImageUrl;

    @Column(name="joined_date")
    @Temporal(value= TemporalType.TIMESTAMP)
    Date joinedDate;

    @Column(name="completed_books_ids")
    String completedBooksIds;

    public Long getId() {
        return Id;
    }

    public String getNickname() {
        return nickname;
    }

    public String getDescription() {
        return description;
    }

    public String getRole() { return role; }

    public String getAvatarImageUrl() {
        return avatarImageUrl;
    }

    public Date getJoinedDate() {
        return joinedDate;
    }

    public String getCompletedBooksIds() {
        return completedBooksIds;
    }

    public User(){}

    public User(String nickname, String description, String role,String avatarImageUrl,Date joinedDate,String completedBooksIds){
        this.nickname = nickname;
        this.description = description;
        this.role = role;
        this.avatarImageUrl =avatarImageUrl;
        this.joinedDate = joinedDate;
        this.completedBooksIds = completedBooksIds;
    }


}
