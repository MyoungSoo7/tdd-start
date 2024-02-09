package me.lms.tddstart.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.security.Timestamp;
import java.util.Date;


@Entity
@Table(name = "`course`")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_code")
    private Integer courseCode;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "professor_code")
    private Integer professorCode;

    @Column(name = "limit_enrollment")
    private Integer limitEnrollment;

    @Column(name = "pass_score")
    private Integer passScore;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column(name = "create_date")
    private Timestamp createDate;

    @Column(name = "create_user_id")
    private String createUserId;

    @Column(name = "modify_date")
    private Timestamp modifyDate;

    @Column(name = "modify_user_id")
    private String modifyUserId;

    public Course(int courseCode, String courseName ) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }
}
