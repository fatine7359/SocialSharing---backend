package com.orange.SocialSharing.models;

import java.util.Date;

public class SharedPost extends Post{
    public SharedPost(String picture, Date publicationDate, int likesCount, int dislikesCount, int sharesCount, User user) {
        super(picture, publicationDate, likesCount, dislikesCount, sharesCount, user);
    }
}
