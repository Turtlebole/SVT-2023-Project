package com.example.backend.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "banned")
public class Banned {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;
    @Column(name = "timeStamp")
    private LocalDateTime timeStamp;
}
