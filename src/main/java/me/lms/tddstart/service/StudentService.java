package me.lms.tddstart.service;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import me.lms.tddstart.model.Student;
import me.lms.tddstart.model.dto.StudentDto;
import me.lms.tddstart.model.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    @Transactional
    public StudentDto saveStudent(Student student) {
        return studentRepository.save(student);
    }

    public StudentDto getStudent(int studentCode) {
        return studentRepository.findById(studentCode

}


