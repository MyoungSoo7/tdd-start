package me.lms.tddstart.model;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Generated;

@Data
public class Score {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long scoreId;
    private Long lectureId;
    private Long studentId;
    private int score;
}
