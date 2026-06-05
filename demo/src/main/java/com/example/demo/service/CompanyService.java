package com.example.demo.service;

//import java.util.List;
import org.springframework.data.domain.Page;

import com.example.demo.entity.Company;

public interface CompanyService {

    Company createCompany(Company company);

    Company updateCompany(Long id, Company company);

    void deleteCompany(Long id);

    Company getCompanyById(Long id);

    Page<Company> getAllCompanies(
            int page,
            int size,
            String search,
            String sortBy,
            String sortDir
    );
}