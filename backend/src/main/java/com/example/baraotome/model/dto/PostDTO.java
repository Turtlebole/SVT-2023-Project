package com.example.baraotome.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class PostDTO {
    private int id;
    @NotBlank
    private String content;
    @NotBlank
    private LocalDateTime creationDate;
    @NotBlank
    private Integer group;


    public PostDTO(int id, String content, LocalDateTime creationDate, Integer group) {
        this.id = id;
        this.content = content;
        this.creationDate = creationDate;
        this.group = group;
    }
}
