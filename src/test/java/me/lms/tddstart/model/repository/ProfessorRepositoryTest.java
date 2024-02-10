package me.lms.tddstart.model.repository;

import me.lms.tddstart.model.Professor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;



@SpringBootTest
class ProfessorRepositoryTest {

    @Autowired
    private ProfessorRepository professorRepository;


    @Test
    @DisplayName("교수 저장 테스트")
    void saveProfessor() {
        // given
        final Professor professor = new Professor(1, "빌게이츠", 1);

        // when
        final Professor savedProfessor = professorRepository.save(professor);

        // then
        assertNotNull(savedProfessor);
        assertEquals(1, savedProfessor.getProfessorCode());
        assertEquals("빌게이츠", savedProfessor.getProfessorName());
        assertEquals(1, savedProfessor.getDepartmentCode());
    }



}