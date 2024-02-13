package me.lms.tddstart.service;

import me.lms.tddstart.model.Course;
import me.lms.tddstart.model.dto.CourseDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class EnrollmentServiceTest {

    @Mock
    private CourseService courseService;

    @InjectMocks
    private EnrollmentService enrollmentService;

    @Test
    @DisplayName("수강신청 테스트")
    void enroll() {

     /*   when(courseService.getCourseByCode(1)).thenReturn(new Course(1, "강의1" ,1));
        CourseDto result = enrollmentService.enroll(1, 1);

        assertNotNull(result);
        assertEquals(1, result.getCourseCode());
        assertEquals("강의1", result.getCourseName());*/

    }

}
