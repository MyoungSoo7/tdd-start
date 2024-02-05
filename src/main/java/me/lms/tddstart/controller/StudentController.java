package me.lms.tddstart.controller;


import me.lms.tddstart.model.Student;
import me.lms.tddstart.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/students")
public class StudentController {


    @Autowired
    private StudentService studentService;

    @GetMapping("/{studentId}")
    public ResponseEntity<Student> getStudent(@PathVariable Integer studentId) {
        Student student = studentService.getStudentById(studentId);
        return ResponseEntity.ok(student);
    }

}
