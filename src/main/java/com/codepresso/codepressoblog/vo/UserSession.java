package com.codepresso.codepressoblog.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;


public class UserSession {

    Integer id;
    Integer user_id;
    String name;
    Date createdAt;


    public UserSession(Integer id, Integer user_id, String name, Date createdAt) {
        this.id = id;
        this.user_id = user_id;
        this.name = name;
        this.createdAt = createdAt;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
