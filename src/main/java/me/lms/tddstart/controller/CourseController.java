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

    @GetMapping("/{courseCode}")
    public ResponseEntity<Course> getCourse(@PathVariable Integer courseCode) {
        Course course = courseService.getCourseByCode(courseCode);
        return ResponseEntity.ok(course);
    }
}
