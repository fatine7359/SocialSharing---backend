package com.orange.SocialSharing.models;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "events")
public class Event extends Post{

    private String title;
    private Date startDate;
    private Date endDate;
    private int interestedCount;


    public Event(String picture, Date publicationDate, int likesCount, int dislikesCount, int sharesCount, User user, String title, Date startDate, Date endDate, int interestedCount) {
        super(picture, publicationDate, likesCount, dislikesCount, sharesCount, user);
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.interestedCount = interestedCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public int getInterestedCount() {
        return interestedCount;
    }

    public void setInterestedCount(int interestedCount) {
        this.interestedCount = interestedCount;
    }
}
