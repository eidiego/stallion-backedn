package com.eidiego.stallionbackend.domain.step;

import com.eidiego.stallionbackend.domain.job.Job;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Step {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String command;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "job_id", nullable = false)
    private Job job;

}
