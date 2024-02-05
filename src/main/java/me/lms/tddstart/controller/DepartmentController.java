package me.lms.tddstart.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {

    @GetMapping("/{department_code}")
    public String getDepartments(@PathVariable Integer departmentCode) {


        return "Departments";
    }



}
