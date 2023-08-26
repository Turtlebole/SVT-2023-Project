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
public class GroupDTO {
    private int id;
    @NotBlank
    private String name;
    @NotBlank
    private String description;
    private LocalDateTime creationDate;
    private boolean isSuspended;
    private String suspensionReason;

    public GroupDTO(int id, String name, String description, LocalDateTime creationDate, boolean isSuspended, String suspensionReason) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.creationDate = creationDate;
        this.isSuspended = isSuspended;
        this.suspensionReason = suspensionReason;
    }
}
