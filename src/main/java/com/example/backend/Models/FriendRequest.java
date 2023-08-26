package com.example.backend.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "friends")
public class FriendRequest {
    @Id
    private int id;
    private boolean isApproved;
    private LocalDateTime createdAt;
    private LocalDateTime at;
}
