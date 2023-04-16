package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Comment {
    @EmbeddedId
    @Column(length=5000)
    private CommentId pk;
    private String text;

    //region Getters&Setters
    public CommentId getPk() {
        return pk;
    }

    public void setPk(CommentId pk) {
        this.pk = pk;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
    //endregion
}
