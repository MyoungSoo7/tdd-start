package me.lms.tddstart.model.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Schema(description = "학생 정보")
public class StudentDto {
    private int studentId;
    private String studentName;
    private int departmentCode;
}
