package com.example.backend.DTO;

import com.example.backend.Models.User;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    public PostDTO(int id, String content, LocalDateTime creationDate) {
        this.id = id;
        this.content = content;
        this.creationDate = creationDate;
    }
}
