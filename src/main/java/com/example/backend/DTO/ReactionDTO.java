package com.example.backend.DTO;

import com.example.backend.Models.EReactionType;
import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
public class ReactionDTO {
    private int id;
    @NotBlank
    private String type;
    @NotBlank
    private LocalDateTime timeStamp;

    public ReactionDTO(int id, String type, LocalDateTime timeStamp) {
        this.id = id;
        this.type = type;
        this.timeStamp = timeStamp;
    }
}
