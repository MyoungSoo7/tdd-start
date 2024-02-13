package me.lms.tddstart.model.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@Schema(description = "수강 정보")
public class StudentCourseDto {

    @Schema(description = "수강 아이디")
    private int id;
    @Schema(description = "학생 아이디")
    private int studentId;
    @Schema(description = "수강 아이디")
    private int courseCode;
    @Schema(description = "학점")
    private int score;
    @Schema(description = "결과")
    private String result;


}
