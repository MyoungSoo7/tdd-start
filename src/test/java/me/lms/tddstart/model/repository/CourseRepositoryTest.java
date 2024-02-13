package me.lms.tddstart.model.repository;

import jakarta.transaction.Transactional;
import me.lms.tddstart.model.Course;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@Transactional
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    @DisplayName("강의 저장 테스트")
    void saveCourse() {
        // given
        final Course course = new Course(1, "자바 프로그래밍", 1);

        // when
        final Course savedCourse = courseRepository.save(course);

        // then
        assertNotNull(savedCourse);
        assertEquals(1, savedCourse.getCourseCode());
        assertEquals("자바 프로그래밍", savedCourse.getCourseName());
        assertEquals(1, savedCourse.getProfessorCode());
    }

}
