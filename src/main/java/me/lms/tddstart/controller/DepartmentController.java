package me.lms.tddstart.controller;


import me.lms.tddstart.model.Course;
import me.lms.tddstart.model.Department;
import me.lms.tddstart.service.CourseService;
import me.lms.tddstart.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/{department_code}")
    public ResponseEntity<Department> getDepartments(@PathVariable("department_code") Integer departmentCode) {
        Department department = departmentService.getDepartments(departmentCode);
        return ResponseEntity.ok(department);
    }

}
