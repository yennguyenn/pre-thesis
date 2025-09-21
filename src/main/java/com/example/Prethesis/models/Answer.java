package com.example.Prethesis.models;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "answers")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor

public class Answer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long answerId;

    @ManyToOne
    @JoinColumn(name = "question_id", nullable = false)
    private Question question;

        @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    private String choice;

    private Double score;
}

    
