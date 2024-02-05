package me.lms.tddstart.service;


import me.lms.tddstart.model.Department;
import me.lms.tddstart.model.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;
    public Department getDepartments(Integer departmentCode) {
        return departmentRepository.findById(departmentCode).orElse(null);
    }


}
