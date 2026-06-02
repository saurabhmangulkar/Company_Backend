package com.example.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Company;
import com.example.demo.repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    @Override
    public Company createCompany(Company company) {
        company.setCreatedDate(LocalDateTime.now());
        return companyRepository.save(company);
    }

    @Override
    public Company updateCompany(Long id, Company company) {

        Company existingCompany =
                companyRepository.findById(id).orElse(null);

        if (existingCompany != null) {

            existingCompany.setName(company.getName());
            existingCompany.setLogo(company.getLogo());
            existingCompany.setEmail(company.getEmail());
            existingCompany.setMobile(company.getMobile());
            existingCompany.setGstNo(company.getGstNo());
            existingCompany.setPanNo(company.getPanNo());
            existingCompany.setAddress(company.getAddress());
            existingCompany.setStatus(company.getStatus());
            existingCompany.setSubscriptionStatus(
                    company.getSubscriptionStatus()
            );

            return companyRepository.save(existingCompany);
        }

        return null;
    }

    @Override
    public void deleteCompany(Long id) {
        companyRepository.deleteById(id);
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }
}