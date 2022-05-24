package com.orange.SocialSharing.models;

import com.orange.SocialSharing.enumeration.PostVisibility;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "posts")
public class Post {

    @Id
    private String id;
    private String picture;
    private Date publicationDate;
    private int likesCount;
    private int dislikesCount;
    private int sharesCount;
    private User user;
    private PostVisibility visibility;

    public Post(String picture, Date publicationDate, int likesCount, int dislikesCount, int sharesCount, User user) {
        this.picture = picture;
        this.publicationDate = publicationDate;
        this.likesCount = likesCount;
        this.dislikesCount = dislikesCount;
        this.sharesCount = sharesCount;
        this.user = user;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(Date publicationDate) {
        this.publicationDate = publicationDate;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public int getDislikesCount() {
        return dislikesCount;
    }

    public void setDislikesCount(int dislikesCount) {
        this.dislikesCount = dislikesCount;
    }

    public int getSharesCount() {
        return sharesCount;
    }

    public void setSharesCount(int sharesCount) {
        this.sharesCount = sharesCount;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
