package com.codepresso.codepressoblog.controller.dto;

import com.codepresso.codepressoblog.vo.User;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Setter
@Getter
public class UserRequestDto {

    Integer id;

    @NotNull
    String email;

    @NotNull
    String name;

    @NotNull
    String password;


    public User getUser() {
        return new User(this.id, this.email, this.name, this.password);
    }
}
