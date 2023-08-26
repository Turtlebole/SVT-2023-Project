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
public class UserDTO {
    private int id;
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    @NotBlank
    private String email;
    @NotBlank
    private String firstName;
    @NotBlank
    private String lastName;
    @NotBlank
    private String displayName;
    @NotBlank
    private String description;

    public UserDTO(int id, String username, String password, String email, String firstName, String lastName, String displayName, String description) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.displayName = displayName;
        this.description = description;
    }
}
