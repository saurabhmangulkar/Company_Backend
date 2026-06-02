package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Company;

public interface CompanyService {

    Company createCompany(Company company);

    Company updateCompany(Long id, Company company);

    void deleteCompany(Long id);

    Company getCompanyById(Long id);

    List<Company> getAllCompanies();
}