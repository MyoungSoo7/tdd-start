package me.lms.tddstart.model.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@Schema(description = "학생 정보")
public class StudentDto {

    @Schema(description = "학생 아이디")
    private int studentId;
    @Schema(description = "학생 이름")
    private String studentName;
    @Schema(description = "학과 코드")
    private int departmentCode;

}
