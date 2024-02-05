package me.lms.tddstart.service;

import me.lms.tddstart.model.Course;
import me.lms.tddstart.model.repository.CourseRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

    @Autowired
    private CourseRepositoy  courseRepository;

    public Course getCourseByCode(Integer courseCode) {
        return courseRepository.findById(courseCode).orElse(null);
    }
}
