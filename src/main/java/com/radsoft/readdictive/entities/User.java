package com.radsoft.readdictive.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    Long id;

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

    public static class UserBuilder{

        Long id;
        String nickname;
        String description;
        String role;
        String avatarImageUrl;
        Date joinedDate;
        String completedBooksIds;

        public UserBuilder withId(Long id){
            this.id = id;
            return this;
        }

        public UserBuilder withNickname(String nickname){
            this.nickname = nickname;
            return this;
        }

        public  UserBuilder withDescription(String description){
            this.description = description;
            return this;
        }

        public UserBuilder withRole(String role){
            this.role = role;
            return this;
        }

        public UserBuilder withAvatarImageUrl(String avatarImageUrl){
            this.avatarImageUrl = avatarImageUrl;
            return this;
        }

        public UserBuilder withJoinedDate(Date joinedDate){
            this.joinedDate = joinedDate;
            return this;
        }

        public UserBuilder withCompletedBooksIds(String completedBooksIds){
            this.completedBooksIds = completedBooksIds;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

    public User(){}

    public User(UserBuilder userBuilder){
        this.id = userBuilder.id;
        this.nickname = userBuilder.nickname;
        this.description = userBuilder.description;
        this.role = userBuilder.role;
        this.avatarImageUrl = userBuilder.avatarImageUrl;
        this.joinedDate = userBuilder.joinedDate;
        this.completedBooksIds = userBuilder.completedBooksIds;
    }

    public Long getId() {
        return id;
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

}
