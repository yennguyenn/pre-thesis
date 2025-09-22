package com.example.Prethesis.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "choose_submajor")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChooseSubMajor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Link with Question
    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;

    // Link with Answer
    @ManyToOne
    @JoinColumn(name = "answer_id", nullable = false)
    private Answer answer;

    // Link with SubMajor
    @ManyToOne
    @JoinColumn(name = "submajor_id", nullable = false)
    private SubMajor subMajor;
}
