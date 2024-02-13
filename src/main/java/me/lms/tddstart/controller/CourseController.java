/*
package me.lms.tddstart.controller;

import me.lms.tddstart.model.Course;
import me.lms.tddstart.model.dto.CourseDto;
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
    public ResponseEntity<CourseDto> getCourse(@PathVariable("course_code") Integer courseCode) {
        CourseDto course = courseService.getCourseByCode(courseCode);
        return ResponseEntity.ok(course);
    }
}
*/
