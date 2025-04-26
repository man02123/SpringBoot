package com.maneesh.service;

import java.util.List;

import com.maneesh.entity.Department;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> getAllDepartments();

    public Department fetchDepartmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

}
