package me.lms.tddstart.controller;

import me.lms.tddstart.model.Course;
import me.lms.tddstart.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/courses")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/{course_code}")
    public ResponseEntity<Course> getCourse(@PathVariable("course_code") Integer courseCode) {
        Course course = courseService.getCourseByCode(courseCode);
        return ResponseEntity.ok(course);
    }
}
