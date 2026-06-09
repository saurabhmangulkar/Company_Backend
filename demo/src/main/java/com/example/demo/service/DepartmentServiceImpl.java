package com.example.demo.service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl
        implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department createDepartment(
            Department department) {

        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {

        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long id) {

        return departmentRepository.findById(id)
                .orElse(null);
    }

    @Override
    public Department updateDepartment(
            Long id,
            Department department) {

        Department existingDepartment =
                departmentRepository.findById(id)
                        .orElse(null);

        if (existingDepartment != null) {

            existingDepartment.setCompanyId(
                    department.getCompanyId());

            existingDepartment.setBranchId(
                    department.getBranchId());

            existingDepartment.setName(
                    department.getName());

            existingDepartment.setStatus(
                    department.getStatus());

            return departmentRepository.save(
                    existingDepartment);
        }

        return null;
    }

    @Override
    public void deleteDepartment(Long id) {

        departmentRepository.deleteById(id);
    }
}