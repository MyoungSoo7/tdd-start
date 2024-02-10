package me.lms.tddstart.model.repository;

import me.lms.tddstart.model.StudentCourse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hibernate.validator.internal.util.Contracts.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class StudentCourseRepositoryTest {


    @Autowired
    private StudentCourseRepository studentCourseRepository;


    @Test
    @DisplayName("수강 저장 테스트")
    void saveStudentCourse() {
        // given
        StudentCourse studentCourse = new StudentCourse(1, 1);
        studentCourseRepository.save(studentCourse);

        // when
        StudentCourse foundStudentCourse = studentCourseRepository.findById(1).orElse(null);

        // then
        assertNotNull(foundStudentCourse);
        assertEquals(1, foundStudentCourse.getStudentId());
        assertEquals(1, foundStudentCourse.getCourseCode());
    }


}