package com.orange.SocialSharing.models;

import java.util.List;

public class Content {
    private String body;
    private List<String> links;
    private List<String> hashtags;
    private List<String> locations;
    private List<String> tags;

    public Content(String body, List<String> links, List<String> hashtags, List<String> locations, List<String> tags) {
        this.body = body;
        this.links = links;
        this.hashtags = hashtags;
        this.locations = locations;
        this.tags = tags;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<String> getLinks() {
        return links;
    }

    public void setLinks(List<String> links) {
        this.links = links;
    }

    public List<String> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<String> hashtags) {
        this.hashtags = hashtags;
    }

    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
