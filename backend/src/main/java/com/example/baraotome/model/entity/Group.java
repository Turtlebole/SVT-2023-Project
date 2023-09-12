package com.example.baraotome.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "all_groups")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private LocalDateTime creationDate;

    @OneToOne
    private User groupAdmin;

    @OneToMany( mappedBy = "group", fetch = FetchType.LAZY)
    private Set<User> groupUserList = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "group")
    private Set<Post> postList = new HashSet<Post>();
}