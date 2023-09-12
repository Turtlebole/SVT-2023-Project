package com.example.baraotome.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
public class ReactionDTO {
    private Integer id;

    private String reactionType;

    private String userName;

    private Integer postId;

}
