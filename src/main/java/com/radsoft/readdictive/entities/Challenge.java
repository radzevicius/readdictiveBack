package com.radsoft.readdictive.entities;

import javax.persistence.*;
import java.util.Date;

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
    Long creatorId;

    @Column(name="deadline_date")
    @Temporal(value=TemporalType.TIMESTAMP)
    Date deadlineDate;

    @Column(name="started_date")
    @Temporal(value =TemporalType.TIMESTAMP)
    Date startedDate;

    public Challenge(){ }

    public Challenge(String name, String description, String bookIds, String userIds, Long creatorId, Date deadlineDate,Date startedDate){
        this.name = name;
        this.description = description;
        this.bookIds = bookIds;
        this.userIds = userIds;
        this.creatorId =creatorId;
        this.deadlineDate =deadlineDate;
        this.startedDate =startedDate;
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
