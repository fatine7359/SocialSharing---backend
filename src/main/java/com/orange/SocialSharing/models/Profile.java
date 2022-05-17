package com.orange.SocialSharing.models;

import java.util.Date;

public class Profile {

    private String username;
    private String password;
    private Date joinDate;
    private String about;
    private String picture;
    private String ipAddress;

    public Profile(String username, String password, Date joinDate, String about, String picture, String ipAddress) {
        this.username = username;
        this.password = password;
        this.joinDate = joinDate;
        this.about = about;
        this.picture = picture;
        this.ipAddress = ipAddress;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }
}
