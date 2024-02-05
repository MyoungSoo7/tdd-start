package me.lms.tddstart.model.repository;

import me.lms.tddstart.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}
