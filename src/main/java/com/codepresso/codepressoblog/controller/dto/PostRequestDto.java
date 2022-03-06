package com.codepresso.codepressoblog.controller.dto;

import com.codepresso.codepressoblog.vo.Post;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class PostRequestDto {
    Integer id;

    @NotNull
    String title;

    @NotNull
    String content;

    @NotNull
    String username;

    public Post getPost() {
        return new Post(this.id, this.title, this.content, this.username);
    }
}
