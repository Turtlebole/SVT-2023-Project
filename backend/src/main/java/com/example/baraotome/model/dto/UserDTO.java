package com.example.baraotome.model.dto;

import com.example.baraotome.model.entity.User;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
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

    public UserDTO() {
        super();
    }

    public UserDTO(@NotBlank String firstName, @NotBlank String lastName, @NotBlank String email,
                   @NotBlank String username, @NotBlank String password) {
        super();
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public UserDTO(User createdUser) {
        this.id = createdUser.getId();
        this.username = createdUser.getUsername();
        this.firstName = createdUser.getFirstName();
        this.lastName = createdUser.getLastName();
        this.email = createdUser.getEmail();
    }
}