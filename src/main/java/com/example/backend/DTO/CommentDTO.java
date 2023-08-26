package com.example.backend.DTO;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
public class CommentDTO {
    private int id;
    @NotBlank
    private String text;
    private LocalDateTime timeStamp;
    private boolean isDeleted;

    public CommentDTO(int id, String text, LocalDateTime timeStamp, boolean isDeleted) {
        this.id = id;
        this.text = text;
        this.timeStamp = timeStamp;
        this.isDeleted = isDeleted;
    }
}
