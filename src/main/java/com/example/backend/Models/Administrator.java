package com.example.backend.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Table;

import java.util.HashSet;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "admins")
public class Administrator extends User {
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "admin")
    private Set<Banned> bans = new HashSet<Banned>();
}
