package me.lms.tddstart.service;

import me.lms.tddstart.model.Course;
import me.lms.tddstart.model.dto.CourseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnrollmentService {

    @Autowired
    private CourseService courseService;

    public CourseDto enroll(Integer studentId, Integer courseCode) {

        //Student student = studentRepository.findById(studentId).orElse(null);
        Course course = courseService.getCourseByCode(courseCode);

        CourseDto courseDto = new CourseDto(course.getCourseCode(),course.getCourseName());

        // 수강신청 로직 구현



        // 수강신청 가능인원 체크



        // Integer studentId, Integer courseCode
        // result :  student 가 course 에 등록하면  student_course 등록

        return courseDto;
    }


 /*   public void cancel(Integer studentId, Integer courseCode) {
        // 수강취소 로직 구현
        studentCourseRepository.delete(id);
        enrollmentRepository.delete(enrollment);

    }*/
}


