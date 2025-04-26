package com.maneesh.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.maneesh.entity.Department;
import com.maneesh.service.DepartmentService;

@RestController
public class DepartmentController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department savDepartment(@RequestBody Department department) { // @RequestBody is used to convert the json
                                                                          // data to java object
        return departmentService.saveDepartment(department);
    }
}
