package me.lms.tddstart.service;

import me.lms.tddstart.model.repository.StudentCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentService {

    @Autowired
    private StudentCourseRepository  studentCourseRepository;
/*
    public void enroll(Integer studentId, Integer courseCode) {
        // 수강신청 로직 구현
        studentCourseRepository.save(studentId, courseCode);

    }


    public void cancel(Integer studentId, Integer courseCode) {
        // 수강취소 로직 구현
        studentCourseRepository.delete(id);
        enrollmentRepository.delete(enrollment);

    }*/
}


