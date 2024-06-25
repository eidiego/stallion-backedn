package com.eidiego.stallionbackend.domain.entities.job;

import com.eidiego.stallionbackend.domain.entities.step.Step;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Job {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String repositoryUrl;

    @Column(nullable = false)
    private String branch;

    @OneToMany(mappedBy = "job", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Step> steps;

}
