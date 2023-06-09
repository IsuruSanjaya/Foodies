package com.foodies.foodies_50.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="story")

public class Story {

    private String  id;
    private String image;
    private String caption;
    private String userId;

    public Story() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    
    

   
}
