
package com.example.demo.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "company_subscription")
public class CompanySubscription {

    @Id
    @GeneratedValue(
        strategy =
        GenerationType.IDENTITY
    )
    private Long id;

    private Long companyId;

    private Long planId;

    private LocalDate startDate;

    private LocalDate endDate;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }



    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(
            Long companyId
    ) {
        this.companyId =
                companyId;
    }



    public Long getPlanId() {
        return planId;
    }

    public void setPlanId(
            Long planId
    ) {
        this.planId = planId;
    }

  
    		
    		


    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(
            LocalDate startDate
    ) {
        this.startDate =
                startDate;
    }



    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(
            LocalDate endDate
    ) {
        this.endDate =
                endDate;
    }
}
