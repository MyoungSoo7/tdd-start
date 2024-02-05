package me.lms.tddstart.model.repository;

import me.lms.tddstart.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepositoy extends JpaRepository<Course, Integer> {
}
