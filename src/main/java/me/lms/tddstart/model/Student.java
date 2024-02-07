package me.lms.tddstart.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import me.lms.tddstart.model.dto.StudentDto;

@Entity
@Table(name = "`student`")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Student {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int studentId;
    private String studentName;
    private int departmentCode;

    public Student(String studentName, int departmentCode) {
        this.studentName = studentName;
        this.departmentCode = departmentCode;
    }

    public StudentDto toDto() {
        return new StudentDto(studentId, studentName, departmentCode);
    }


}
