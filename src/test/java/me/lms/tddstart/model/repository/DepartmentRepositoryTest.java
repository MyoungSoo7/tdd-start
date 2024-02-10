package me.lms.tddstart.model.repository;

import me.lms.tddstart.model.Department;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;



@SpringBootTest
class DepartmentRepositoryTest {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Test
    @DisplayName("부서 저장 테스트")
    void saveDepartment() {
        // given
        final Department department = new Department(1, "컴퓨터공학");

        // when
        final Department savedDepartment = departmentRepository.save(department);

        // then
        assertNotNull(savedDepartment);
        assertEquals(1, savedDepartment.getDepartmentCode());
        assertEquals("컴퓨터공학", savedDepartment.getDepartmentName());
    }

}