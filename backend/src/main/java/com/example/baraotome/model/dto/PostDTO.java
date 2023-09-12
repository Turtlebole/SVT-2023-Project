package com.example.baraotome.model.dto;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class PostDTO {
    private Integer id;
    private String content;
    private String userName;
    private Integer groupId;
    public PostDTO() {
        super();
    }

    public PostDTO( Integer id, String content, String userName, Integer groupId) {
        super();
        this.id = id;
        this.content = content;
        this.userName = userName;
        this.groupId = groupId;
    }

}
