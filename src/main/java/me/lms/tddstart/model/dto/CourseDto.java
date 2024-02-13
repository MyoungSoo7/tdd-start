package me.lms.tddstart.model.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.security.Timestamp;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Schema(description = "수강 정보")
public class CourseDto {

    @Schema(description = "학생 아이디")
    private Integer studentId;
    @Schema(description = "수강 아이디")
    private Integer courseCode;
    @Schema(description = "수강 과목")
    private String courseName;
    @Schema(description = "교수 아이디")
    private Integer professorCode;
    @Schema(description = "수강 정원")
    private Integer limitEnrollment;
    @Schema(description = "합격 점수")
    private Integer passScore;
    @Schema(description = "수강 시작일")
    private Date startDate;
    @Schema(description = "수강 종료일")
    private Date endDate;
    @Schema(description = "수강 생성일")
    private Timestamp createDate;
    @Schema(description = "수강 생성자")
    private String createUserId;
    @Schema(description = "수강 수정일")
    private Timestamp modifyDate;
    @Schema(description = "수강 수정자")
    private String modifyUserId;



}
