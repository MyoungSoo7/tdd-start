package me.lms.tddstart.model.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.Setter;

import java.security.Timestamp;
import java.util.Date;


@Getter
@Setter
public class CourseDto {

    private Integer studentId;
    private Integer courseCode;
    private String courseName;

    private Integer professorCode;

    private Integer limitEnrollment;

    private Integer passScore;

    private Date startDate;

    private Date endDate;

    private Timestamp createDate;

    private String createUserId;

    private Timestamp modifyDate;

    private String modifyUserId;

    public CourseDto(Integer courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }
}
