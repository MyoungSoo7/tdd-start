package me.lms.tddstart.service;

import me.lms.tddstart.model.repository.StudentCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentService {

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    public void enroll(Integer studentId, Integer courseCode) {
        // 수강신청 로직 구현
        /*Enrollment enrollment = new Enrollment();
        enrollment.setStudentId(studentId);
        enrollment.setCourseCode(courseCode);
        enrollment.setEnrollmentDate(new Timestamp(System.currentTimeMillis()));
        enrollmentRepository.save(enrollment);*/
    }


    public void cancel(Integer id) {
        // 수강취소 로직 구현
        /*Enrollment enrollment = enrollmentRepository.findByStudentIdAndCourseCode(studentId, courseCode);
        enrollmentRepository.delete(enrollment);*/
    }
}


