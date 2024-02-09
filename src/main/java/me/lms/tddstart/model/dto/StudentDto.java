package me.lms.tddstart.model.dto;


import lombok.AllArgsConstructor;

@AllArgsConstructor
//@Schema(description = "학생 정보")
public class StudentDto {
    private int studentId;
    private String studentName;
    private int departmentCode;


    public static void main(String[] args) {


    }

}
