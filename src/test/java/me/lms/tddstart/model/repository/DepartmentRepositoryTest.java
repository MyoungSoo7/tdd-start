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
        Department department = new Department(1, "개발팀");
        departmentRepository.save(department);

        // when
        Department foundDepartment = departmentRepository.findById(1).orElse(null);

        // then
        assertNotNull(foundDepartment);
        assertEquals(1, foundDepartment.getDepartmentCode());
        assertEquals("개발팀", foundDepartment.getDepartmentName());
    }




}