package com.example.demo.model;

import jakarta.persistence.*;
import java.io.Serializable;

@Embeddable
public class CommentId implements Serializable {
    @ManyToOne
    private User user;
    @ManyToOne
    private Feature feature;

    //region Getters&Setters
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }
    //endregion
}
