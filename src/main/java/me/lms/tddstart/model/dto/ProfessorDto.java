package me.lms.tddstart.model.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Schema(description = "교수")
public class ProfessorDto {

    @Schema(description = "교수 아이디")
    private int professorCode;
    @Schema(description = "교수 이름")
    private String professorName;


}
