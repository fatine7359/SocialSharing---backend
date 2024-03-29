package com.orange.SocialSharing.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "comments")
public class Comment {
    private int likesCount;
    private int dislikeCount;

    public Comment(int likesCount, int dislikeCount) {
        this.likesCount = likesCount;
        this.dislikeCount = dislikeCount;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public int getDislikeCount() {
        return dislikeCount;
    }

    public void setDislikeCount(int dislikeCount) {
        this.dislikeCount = dislikeCount;
    }
}
