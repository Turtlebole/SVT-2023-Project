package com.example.baraotome.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "admins")
public class Administrator extends User {

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "admin")
    private Set<Banned> bans = new HashSet<Banned>();
}
