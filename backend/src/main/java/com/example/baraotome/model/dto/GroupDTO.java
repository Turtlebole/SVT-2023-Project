package com.example.baraotome.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.time.LocalDateTime;

@Getter
@Setter
public class GroupDTO {
    private Integer id;
    private String name;
    private String description;
    private String groupAdmin;

    public GroupDTO() {
    }

    public GroupDTO(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public GroupDTO(Integer id, String name, String description, String groupAdmin) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.groupAdmin = groupAdmin;
    }
}
