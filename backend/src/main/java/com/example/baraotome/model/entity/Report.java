package com.example.baraotome.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "reports")
public class Report {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;
    @Column(name = "reason")
    private EReportReason reason;
    @Column(name = "timeStamp")
    private LocalDateTime timeStamp;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user")
    private User byUser;
    @Column(name = "accepted")
    private boolean isAccepted;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "reportedUser")
    private User reportedUser;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "post")
    private Post post;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "comment")
    private Comment comment;
}