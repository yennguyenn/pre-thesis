package com.example.Prethesis.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "submajors")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SubMajor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @Column(length = 1000)
    private String description;

    // Link with SubMajor
    @ManyToOne
    @JoinColumn(name = "major_id", nullable = false)
    private Major major;
}
