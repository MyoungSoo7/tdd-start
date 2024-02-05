package me.lms.tddstart.model.repository;

import me.lms.tddstart.model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Integer> {


}
