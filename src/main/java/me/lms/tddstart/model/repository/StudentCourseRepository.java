package me.lms.tddstart.model.repository;

import me.lms.tddstart.model.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCourseRepository extends JpaRepository<StudentCourse, Integer> {

}
