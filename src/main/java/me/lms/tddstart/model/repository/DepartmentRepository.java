package me.lms.tddstart.model.repository;

import me.lms.tddstart.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
}
