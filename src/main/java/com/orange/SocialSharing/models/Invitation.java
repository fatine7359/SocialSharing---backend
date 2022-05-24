package com.orange.SocialSharing.models;


import com.orange.SocialSharing.enumeration.InvitationStatus;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "invitations")
public class Invitation {

    @Id
    private int invitationId;
    private Date friendshipDate;
    private InvitationStatus status;

    public Invitation(Date friendshipDate, InvitationStatus status) {
        this.friendshipDate = friendshipDate;
        this.status = status;
    }

    public Date getFriendshipDate() {
        return friendshipDate;
    }

    public void setFriendshipDate(Date friendshipDate) {
        this.friendshipDate = friendshipDate;
    }

    public InvitationStatus getStatus() {
        return status;
    }

    public void setStatus(InvitationStatus status) {
        this.status = status;
    }
}
