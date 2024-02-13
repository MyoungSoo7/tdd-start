/*
package me.lms.tddstart.controller;


import me.lms.tddstart.model.Professor;
import me.lms.tddstart.model.dto.ProfessorDto;
import me.lms.tddstart.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/professors")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @GetMapping("/{professor_code}")
    public ResponseEntity<ProfessorDto> getProfessor(@PathVariable("professor_code") Integer professorCode) {
        ProfessorDto professor = professorService.getProfessorById(professorCode);
        return ResponseEntity.ok(professor);
    }

}
*/
