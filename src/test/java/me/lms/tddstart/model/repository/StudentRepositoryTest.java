package me.lms.tddstart.model.repository;

import jakarta.transaction.Transactional;
import me.lms.tddstart.model.Student;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;


@ActiveProfiles("test")
@SpringBootTest
@Transactional
class StudentRepositoryTest {


    @Autowired
    private StudentRepository studentRepository;


    @Test
    @DisplayName("학생 조회 테스트")
    void searchStudent() {
        // given
        Student student = new Student("student1", 1);
        studentRepository.save(student);

        // when
        Student foundStudent = studentRepository.findById(1).orElse(null);

        // then
        assertNotNull(foundStudent);
        assertEquals("student1", foundStudent.getStudentName());
    }




}