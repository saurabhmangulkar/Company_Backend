package com.example.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Company;

public interface CompanyRepository
        extends JpaRepository<Company, Long> {

    Page<Company> findByNameContainingIgnoreCase(
            String name,
            Pageable pageable
    );
    Page<Company> findByStatusNot(
            String status,
            Pageable pageable
    );
    Page<Company>
    findByNameContainingIgnoreCaseAndStatusNot(
            String name,
            String status,
            Pageable pageable
    );
}