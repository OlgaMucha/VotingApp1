package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Vote {
    @EmbeddedId
    private VoteId pk;
    private boolean upvote;

    //region Getters&Setters
    public boolean isUpvote() {
        return upvote;
    }

    public void setUpvote(boolean upvote) {
        this.upvote = upvote;
    }
    //endregion

}
