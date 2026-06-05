package com.example.demo.service;

import java.time.LocalDateTime;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Company;
import com.example.demo.repository.CompanyRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

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

        Company company =
                companyRepository.findById(id)
                .orElse(null);

        if (company != null) {

            company.setStatus("Inactive");

            companyRepository.save(company);
        }
    }

    @Override
    public Company getCompanyById(Long id) {
        return companyRepository.findById(id).orElse(null);
    }

    @Override
    public Page<Company> getAllCompanies(
            int page,
            int size,
            String search,
            String sortBy,
            String sortDir
    ) {

        Sort sort =
                sortDir.equalsIgnoreCase("desc")
                        ? Sort.by(sortBy).descending()
                        : Sort.by(sortBy).ascending();

        Pageable pageable =
                PageRequest.of(
                        page,
                        size,
                        sort
                );

        if (
                search != null &&
                !search.isEmpty()
        ) {

        	return companyRepository
        	        .findByNameContainingIgnoreCaseAndStatusNot(
        	                search,
        	                "Inactive",
        	                pageable
        	        );
        }

        return companyRepository.findByStatusNot(
                "Inactive",
                pageable
        );
        
        
    }
    
}