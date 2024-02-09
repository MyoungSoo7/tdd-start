package me.lms.tddstart.service;

import me.lms.tddstart.model.Student;
import me.lms.tddstart.model.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student getStudentById(Integer studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }
}


