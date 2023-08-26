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
public class GroupRequestDTO {
    private int id;
    private boolean isApproved;
    private LocalDateTime createdAt;
    private LocalDateTime at;
    @NotBlank
    private String username;
    @NotBlank
    private int group;

    public GroupRequestDTO(int id, boolean isApproved, LocalDateTime createdAt, LocalDateTime at, String username, int group) {
        this.id = id;
        this.isApproved = isApproved;
        this.createdAt = createdAt;
        this.at = at;
        this.username = username;
        this.group = group;
    }
}
