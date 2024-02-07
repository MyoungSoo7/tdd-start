package me.lms.tddstart.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "student_course")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StudentCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "student_id")
    private int studentId;

    @Column(name = "course_code")
    private int courseCode;

    @Column(name = "score")
    private int score;

    @Column(name = "result")
    private String result;
}
