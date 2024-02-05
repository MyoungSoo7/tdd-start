package me.lms.tddstart.service;


import me.lms.tddstart.model.Professor;
import me.lms.tddstart.model.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    public Professor getProfessorById(Integer professorId) {
        return professorRepository.findById(professorId).orElse(null);
    }

}
