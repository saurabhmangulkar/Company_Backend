
package com.example.demo.repository;

import com.example.demo.entity.CompanySubscription;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanySubscriptionRepository
        extends JpaRepository<
            CompanySubscription,
            Long
        > {

}

