package com.codepresso.codepressoblog.vo;

import java.util.Date;

public class Post {
    Integer id;
    String title;
    String content;
    String username;
    Date createdAt;

    public Post(Integer id,  String title, String content, String username) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
    }

    public Post(Integer id, String title, String content, String username, Date createdAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getUsername() {
        return username;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
