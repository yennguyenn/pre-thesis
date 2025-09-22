package com.example.Prethesis.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "choose_major")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChooseMajor {

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

    // Link with Major
    @ManyToOne
    @JoinColumn(name = "major_id", nullable = false)
    private Major major;

    // Link with User 
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
