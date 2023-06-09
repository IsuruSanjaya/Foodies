package com.foodies.foodies_50.model;


import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "post")
public class Post {

    private String id;
    private String postImages;
    private String caption;
    private String location;
    private String mood;
    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Post(String id, String postImages, String caption, String location, String mood, String userId) {
        this.id = id;
        this.postImages = postImages;
        this.caption = caption;
        this.location = location;
        this.mood = mood;
        this.userId = userId;
    }

    public Post() {
    }


    

    public String getid() {

        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getPostImages() {
        return postImages;
    }

    public void setPostImages(String postImages) {
        this.postImages = postImages;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getMood() {
        return mood;
    }

    public void setMood(String mood) {
        this.mood = mood;
    }

}
