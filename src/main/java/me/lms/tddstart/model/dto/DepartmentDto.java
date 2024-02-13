package me.lms.tddstart.model.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Schema(description = "학과 정보")
public class DepartmentDto {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Schema(description = "학과 코드")
    private int departmentCode;
    @Schema(description = "학과 이름")
    private String departmentName;

}
